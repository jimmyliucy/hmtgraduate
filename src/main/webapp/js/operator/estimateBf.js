$(function() {
    layui.use('form', function(){
        var form = layui.form;
        form.on('submit(formDemo)', function(data){
            //获取checkbox[name='like']的值
            var arr = new Array();
            $("input:checkbox[name='like']:checked").each(function(i){
                arr[i] = $(this).val();
            });
            data.field.like = arr.join(",");//将数组合并成字符串

            $.post("admin.php", {data:data.field}, function (res) {
                if (res.code == 1) {
                    layer.msg(res.msg, {time: 1800, icon: 1}, function () {
                        location.href = res.url;
                    });
                } else {
                    layer.msg(res.msg, {time: 1800, icon: 2});
                }
            }, 'json');

            return false;
        });
    });

});