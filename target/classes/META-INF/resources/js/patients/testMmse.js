/**
 * 认知测试
 */
$(function() {
    layui.use('table', function(){
        var table = layui.table
            ,form = layui.form;

        tableIns=table.render({
            elem: '#patientList'
            ,url:'/patients/getPatients'
            ,method: 'post' //默认：get请求
            ,cellMinWidth: 80
            ,page: true,
            request: {
                pageName: 'page' //页码的参数名称，默认：page
                ,limitName: 'limit' //每页数据量的参数名，默认：limit
            },response:{
                statusName: 'code' //数据状态的字段名称，默认：code
                ,statusCode: 200 //成功的状态码，默认：0
                ,countName: 'totals' //数据总数的字段名称，默认：count
                ,dataName: 'list' //数据列表的字段名称，默认：data
            }
            ,cols: [[
                //{type:'numbers'}
                {field:'id', title:'ID',width:30, unresize: true, sort: true}
                ,{field:'name', title:'患者姓名'}
                ,{field:'age', title:'年龄'}
                ,{field:'sex', title: '性别'}
                ,{field:'phoneNo', title: '手机号', minWidth:80}
                ,{field:'hispitalNo', title: '住院号'}
                ,{field:'degree', title:'学历'}
                ,{field:'primaryDiagnosis', title:'初步诊断'}
                ,{fixed:'right', title:'操作',width:200, align:'center', toolbar:'#optBar'}
            ]]
            ,done: function(res, curr, count){
                pageCurr=curr;
            }
        });

        //监听工具条
        table.on('tool(patientTable)', function(obj){
            var data = obj.data;
            if(obj.event === 'detailMmse'){
                detailMmse(data.id, data.name);
            } else if(obj.event === 'addMmse'){
                //新增cam测试
                openMmse(data.id,data.name);
            }
        });
        //监听提交
        form.on('submit(mmseSubmit)', function(data){
            // TODO 校验
            submitAjax(data);
            return false;
        });

    });
    //搜索框
    layui.use(['form','laydate'], function(){
        var form = layui.form ,layer = layui.layer
            ,laydate = layui.laydate;
        //监听搜索框
        form.on('submit(searchSubmit)', function(data){
            //重新加载table
            load(data);
            return false;
        });
    });
});

//开通用户
 function openMmse(patientId, name){
    $("#patientId").val(patientId);
    console.log(patientId + "=="+ name);
     layer.open({
         type:1,
         title: name + "--MMSE测试",
         fixed:false,
         resize :false,
         shadeClose: true,
         area: ['600px', '680px'],
         content:$('#setMMSE'),
         end:function(){
             cleanSearch();
         }
     });
 }

function detailMmse(patientId, name) {
    //加载数据
    console.log("patientId="+patientId+"===patientName="+name)
    layui.use('table', function(){
        var table = layui.table;
        camListIns=table.render({
            elem: '#mmseList'
            ,url:'/recognite/mmseList'
            ,method: 'post' //默认：get请求
            ,cellMinWidth: 60
            ,page: true
            ,where: {patientId: patientId},//患者的id号
            request: {
                pageName: 'page' //页码的参数名称，默认：page
                ,limitName: 'limit' //每页数据量的参数名，默认：limit
            },response:{
                statusName: 'code' //数据状态的字段名称，默认：code
                ,statusCode: 200 //成功的状态码，默认：0
                ,countName: 'totals' //数据总数的字段名称，默认：count
                ,dataName: 'list' //数据列表的字段名称，默认：data
            }
            ,cols: [[
                {field:'id', title:'ID', unresize: true, sort: true}
                ,{field:'status', title:'手术状态'}
                ,{field:'questionOne', title:'问题1'}
                ,{field:'questionTwo', title: '问题2'}
                ,{field:'questionThr', title: '问题3'}
                ,{field:'questionFour', title: '问题4'}
                ,{field:'questionFive', title:'问题5'}
                ,{field:'questionSix', title:'问题6'}
                ,{field:'questionSev', title:'问题7'}
                ,{field:'questionEig', title:'问题8'}
                ,{field:'questionNine', title:'问题9'}
                ,{field:'questionTen', title:'问题10'}
                ,{field:'questionTone', title:'问题11'}
                ,{field:'questionTtwo', title:'问题12'}
                ,{field:'questionTthr', title: '问题13'}
                ,{field:'questionTfour', title: '问题14'}
                ,{field:'questionTfive', title: '问题15'}
                ,{field:'questionTsix', title:'问题16'}
                ,{field:'questionTsev', title:'问题17'}
                ,{field:'questionTeig', title:'问题18'}
                ,{field:'questionTnin', title:'问题19'}
                ,{field:'questionWt', title:'问题20'}
                ,{field:'score', title:'总分'}
            ]]
            ,done: function(res, curr, count){
                pageCurr=curr;
            }
        });

    });
    layer.open({
         type:1,
         title: name+"--MMSE测试详情",
         fixed:false,
         resize :false,
         shadeClose: true,
         area: ['1400px', '680px'],
         content:$('#detailMmse'),
         end:function(){
             cleanSearch();
         }
     });

}

function submitAjax(obj,currentUser){
    $.ajax({
        type: "POST",
        data: $("#mmseScoreForm").serialize(),
        url: "/recognite/addMmse",
        success: function (data) {
            if(isLogin(data)){
                if (data == "ok") {
                    layer.alert("操作成功",function(){
                        if($("#id").val()==currentUser){
                            //如果是自己，直接重新登录
                            parent.location.reload();
                        }else{
                            layer.closeAll();
                            cleanSearch();
                            load(obj);
                        }
                    });
                } else {
                    layer.alert(data,function(){
                        layer.closeAll();
                        //加载load方法
                        load(obj);//自定义
                    });
                }
            }
        },
        error: function () {
            layer.alert("操作请求错误，请您稍后再试",function(){
                layer.closeAll();
                //加载load方法
                load(obj);//自定义
            });
        }
    });
}

function load(obj){
    //重新加载table
    tableIns.reload({
        where: obj.field
        , page: {
            curr: pageCurr //从当前页码开始
        }
    });
}

function cleanSearch(){
    $("#").val();
    $("#").val();
    $("#").val();
    $("#").val();
    $("#").val();
    $("#").val();
    $("#").val();
    $("#").val();
    $("#").val();
}
