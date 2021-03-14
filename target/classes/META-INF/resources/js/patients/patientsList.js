/**
 * 患者信息列表
 */
$(function() {
    //初始化 页面表格
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
<<<<<<< HEAD
            if(obj.event === 'beforeEvalaute'){
               // beforeEvalaute(data.id, data.name);
            } else if(obj.event === 'detailPatient'){
                //新增cam测试
               // detailPatient(data.id,data.name);
=======
            if(obj.event === 'surgeryedCAM'){
                surgeryedCAM(data.id, data.name);
>>>>>>> 778539cb5552fe79a32abd6b761a7bd62c004977
            }
        });
        //监听提交
        form.on('submit(mmseSubmit)', function(data){
            // TODO 校验
            //submitAjax(data);
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
            console.log(data.field);
            //load(data);
            tableIns.reload({
                where: data.field
                , page: {
                    curr: pageCurr //从当前页码开始
                }
            });
            return false;
        });
    });
});

<<<<<<< HEAD
=======
function surgeryedCAM(patientId, name) {
    if (isBlank(patientId)) {
        layer.alert("未获取到患者id");
    }
    $("#camPatientId").val(patientId);
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

>>>>>>> 778539cb5552fe79a32abd6b761a7bd62c004977
function load(obj){
    //重新加载table
    console.log("====="+obj.field);

}