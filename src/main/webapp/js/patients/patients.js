/**
 * 权限列表
 */
$(function() {
    //初始化 页面表格
    layui.use(['laytpl', 'util'], function () {
        var laytpl = layui.laytpl;
        var util = layui.util;

        var view = document.getElementById('patientTable');
        var getTpl = patientView.innerHTML
        var data = { rows : patientList };
        laytpl(getTpl).render(data, function(html){
            view.innerHTML = html;
        });
    });

    //操作
    layui.use('form', 'laydate', function(){
        var form = layui.form;
        var laydate = layui.laydate;
        laydate.render({
            elem: '#illnessTime'
        });
        //监听提交
        form.on('submit(patientSubmit)', function(data){
            console.log("=================="+$("#patientForm").serialize());
            $.ajax({
                type: "POST",
                // TODO $("#patientForm").serialize() 这样提交不到后台，不知道原因
                data: $("#patientForm").serialize(),
                url: "/patients/editPatient",
                success: function (result) {
                    if (result == "ok") {
                        layer.alert("操作成功",function(){
                            layer.closeAll();
                        });
                    } else {
                        layer.alert(data);
                    }
                },
                error: function (data) {
                    layer.alert("操作请求错误，请您稍后再试");
                }
            });
            return false;
        });
        form.render();
    });
});

function addPatient(flag){
    layui.use(['laytpl', 'laydate'], function () {
        var laydate = layui.laydate;
        laydate.render({
            elem: '#illnessTime'
        });
    });
    $("#id").val(-1);
    layer.open({
        type:1,
        title: "添加患者信息",
        fixed:false,
        resize :false,
        shadeClose: true,
        area: ['600px', '680px'],
        content:$('#updatePatient'),  //页面自定义的div，样式自定义
        end:function(){
            location.reload();
        }
    });
}

//修改
function edit(id){
    layui.use(['laytpl', 'laydate'], function () {
        var laydate = layui.laydate;
        laydate.render({
            elem: '#illnessTime'
        });
    });
    if(null!=id){
        //$("#type").val(type);
        $("#id").val(id);
        console.log(id);
        $.get("/patients/getPatient",{"id":id},function(data) {
            console.log(data);
            if(null!=data){
                //将更新框中的数据进行填充
                fillParam4Update(data);

                layer.open({
                    type:1,
                    title: "更新患者信息",
                    fixed:false,
                    resize :false,
                    shadeClose: true,
                    area: ['600px', '680px'],
                    content:$('#updatePatient'),
                    end:function(){
                        location.reload();
                    }
                });
            }else{
                layer.alert("获取患者数据出错，请您稍后再试");
            }
        });
    }
}

//删除
function del(id,name){
    // console.log("===删除id："+id);
    if(null!=id){
        layer.confirm('您确定要删除'+name+'权限吗？', {
            btn: ['确认','返回'] //按钮
        }, function(){
            $.post("/patients/del",{"id":id},function(data){
                if(data=="ok"){
                    //回调弹框
                    layer.alert("删除成功！",function(){
                        layer.closeAll();
                        //加载load方法
                        location.reload();;//自定义
                    });
                }else{
                    layer.alert(data);//弹出错误提示
                }
            });
        }, function(){
            layer.closeAll();
        });
    }

}

function fillParam4Update(data) {
    layui.use(['form'], function(){
        var $ = layui.$
        ,form = layui.form;
        var illnessTime = layui.util.toDateString(data.illnessTime, "yyyy-MM-dd")
        $("#id").val(data.id);
        $("input[name='name']").val(data.name);
        $("input[name='age']").val(data.age);
        $("input[name='createDate']").val(data.createDate);
        $("input[name='adress']").val(data.adress);
        $("input[name='allergy']").val(data.allergy);
        $("input[name='familyDisease']").val(data.familyDisease);
        $("input[name='symptom']").val(data.symptom);
        $("input[name='illnessTime']").val(illnessTime);
        $("select[name='degree']").val(data.degree);
        $("input[name='phoneNo']").val(data.phoneNo);
        $("input[name='familyDisease']").val(data.familyDisease);
        $("input[name='historyDisease']").val(data.historyDisease);
        $("input[name='historyAnesthesia']").val(data.historyAnesthesia);
        $("textarea[name='primaryDiagnosis']").text(data.primaryDiagnosis);
        data.sex==0?$("input[name='sex'][value='0']").prop("checked","true"):$("input[name='sex'][value='1']").prop("checked","true");
        data.marriage==0?$("input[name='marriage'][value='0']").prop("checked","true"):$("input[name='marriage'][value='1']").prop("checked","true");
        form.render();
    });
}

//关闭弹框
function close(){
    layer.closeAll();
}
