/**
 * 患者信息列表
 */
$(function() {

    layui.use('laydate', function(){
        var laydate = layui.laydate;
        laydate.render({
            elem: '#illnessTime'
        });
    });

});

    function mmseSubmit() {
        $.ajax({
            type: "POST",
            data: $("#mmseScoreForm").serialize(),
            url: "/recognite/addMmse",
            success: function (result) {
                if (result == "ok") {
                    layer.alert("操作成功",function(){
                        layer.closeAll();
                    });
                } else {
                    layer.alert(result);
                }
            },
            error: function (data) {
                layer.alert("操作请求错误，请您稍后再试");
            }
        });

    }

    function patientSubmit() {
        $.ajax({
            type: "POST",
            data: $("#patientForm").serialize(),
            url: "/patients/editPatient",
            success: function (result) {
                if (result != null || result != undefined || result != '') {
                    layer.alert("操作成功",function(){
                        $("#patientId").val(result);
                        layer.closeAll();
                    });
                } else {
                    layer.alert(result);
                }
            },
            error: function (data) {
                layer.alert("操作请求错误，请您稍后再试");
            }
        });
    }

    function camSubmit() {
        $.ajax({
            type: "POST",
            data: $("#camForm").serialize(),
            url: "/recognite/addCam",
            success: function (result) {
                if (result == "ok") {
                    layer.alert("操作成功",function(){
                        layer.closeAll();
                    });
                } else {
                    layer.alert(result);
                }
            },
            error: function (data) {
                layer.alert("操作请求错误，请您稍后再试");
            }
        });
    }