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
        var patient = $("patientId").val();
        if (isBlank(patient)) {
            layer.alert("请返回上一页提交患者信息后再进行本次操作");
        }
        $("mmsePatientId").val(patient);
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
        var patient = $("patientId").val();
        if (isBlank(patient)) {
            layer.alert("请返回上一页提交患者信息后再进行本次操作");
        }
        $("camPatientId").val(patient);
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

    /****************************************************
     * last Keyword in function signature is mean
     * 表示上一页；
     * next Keyword in function signature is mean
     * 表示下一页；
     * 显示隐藏DIV域的方法：
     *   1、$("#demo").attr("style","display:none;");//隐藏div
     *      $("#demo").attr("style","display:block;");//显示div
     *   2、$("#demo").css("display","none");//隐藏div
     *      $("#demo").css("display","block");//显示div
     *   3、$("#demo").hide();//隐藏div
     *      $("#demo").show();//显示div
     *   4、$("#demo").toggle(//动态显示和隐藏
     *          function () {
     *              $(this).attr("style","display:none;");//隐藏div
     *          },
     *          function () {
     *              $(this).attr("style","display:block;");//显示div
     *          });
     * **************************************************/
    function patientNextPage() {
        $("#addPatient").css("display","none");//隐藏div
        $("#setMMSE").css("display","block");//显示div
    }

    function mmseLastPage() {
        $("#setMMSE").css("display","none");//
        $("#addPatient").css("display","block");//
    }

    function mmseNextPage() {
        $("#setMMSE").css("display","none");//
        $("#addCam").css("display","block");//
    }

    function camLastPage() {
        $("#addCam").css("display","none");//
        $("#setMMSE").css("display","block");//
    }
