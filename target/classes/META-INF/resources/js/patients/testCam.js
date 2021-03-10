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
            if(obj.event === 'detailCam'){
                detailCam(data.id, data.name);
            } else if(obj.event === 'addCAM'){
                //新增cam测试
                openCam(data.id,data.name);
            }
        });
        //监听提交
        form.on('submit(camSubmit)', function(data){
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
 function openCam(patientId, name){
    $("#patientId").val(patientId);
    console.log(patientId + "=="+ name);
     layer.open({
         type:1,
         title: name + "--谵妄测试",
         fixed:false,
         resize :false,
         shadeClose: true,
         area: ['600px', '680px'],
         content:$('#setCAM'),
         end:function(){
             cleanSearch();
         }
     });
 }

function detailCam(patientId, name) {
    //加载数据
    console.log("patientId="+patientId+"===patientName="+name)
    layui.use('table', function(){
        var table = layui.table;
        camListIns=table.render({
            elem: '#camList'
            ,url:'/recognite/camList'
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
                {field:'id', title:'ID',width:30, unresize: true, sort: true}
                ,{field:'status', title:'手术状态'}
                ,{field:'acute', title:'急性起病'}
                ,{field:'attention', title: '注意障碍'}
                ,{field:'thinking', title: '思维混乱'}
                ,{field:'sence', title: '意识水平的改变'}
                ,{field:'directional', title:'定向障碍'}
                ,{field:'memoryLoss', title:'记忆力减退'}
                ,{field:'perceptionDisorders', title:'知觉障碍'}
                ,{field:'psychoSportExcitement', title:'精神运动性兴奋'}
                ,{field:'mentalSportSlow', title:'精神运动性迟缓'}
                ,{field:'wave', title:'波动性'}
                ,{field:'sleepWakeCycle', title:'睡眠—觉醒周期'}
                ,{field:'score', title:'总分'}
            ]]
            ,done: function(res, curr, count){
                pageCurr=curr;
            }
        });

    });
    layer.open({
         type:1,
         title: name+"--谵妄测试详情",
         fixed:false,
         resize :false,
         shadeClose: true,
         area: ['1400px', '680px'],
         content:$('#detailCam'),
         end:function(){
             cleanSearch();
         }
     });

}

function submitAjax(obj,currentUser){
    $.ajax({
        type: "POST",
        data: $("#camForm").serialize(),
        url: "/recognite/addCam",
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
//    $("#name").val("");
//    $("#hispitalNo").val("");
    $("#patientId").val("");
    $("#id").val("");
    $("#pageNum").val("");
    $("select[name='status']").get(0).selectedIndex;
    $("select[name='acute']").get(0).selectedIndex;
    $("select[name='attention']").get(0).selectedIndex;
    $("select[name='thinking']").get(0).selectedIndex;
    $("select[name='sence']").get(0).selectedIndex;
    $("select[name='directional']").get(0).selectedIndex;
    $("select[name='memoryLoss']").get(0).selectedIndex;
    $("select[name='perceptionDisorders']").get(0).selectedIndex;
    $("select[name='psychoSportExcitement']").get(0).selectedIndex;
    $("select[name='mentalSportSlow']").get(0).selectedIndex;
    $("select[name='wave']").get(0).selectedIndex;
    $("select[name='sleepWakeCycle']").get(0).selectedIndex;
}
