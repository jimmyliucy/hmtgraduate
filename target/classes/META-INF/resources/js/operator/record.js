/**
* 数据录入页面
*/

$(function() {

    layui.use('element', function(){
      var $ = layui.jquery
      ,element = layui.element; //Tab的切换功能，切换事件监听等，需要依赖element模块

       //触发事件
        var active = {
          tabAdd: function(){
            //新增一个Tab项
            element.tabAdd('demo', {
              title: '新选项'+ (Math.random()*1000|0) //用于演示
              ,content: '内容'+ (Math.random()*1000|0)
              ,id: new Date().getTime() //实际使用一般是规定好的id，这里以时间戳模拟下
            })
          }
          ,tabDelete: function(othis){
            //删除指定Tab项
            element.tabDelete('demo', '44'); //删除：“商品管理”


            othis.addClass('layui-btn-disabled');
          }
          ,tabChange: function(){
            //切换到指定Tab项
            element.tabChange('demo', '22'); //切换到：用户管理
          }
        };

        $('.site-demo-active').on('click', function(){
          var othis = $(this), type = othis.data('type');
          active[type] ? active[type].call(this, othis) : '';
        });

        //Hash地址的定位
        var layid = location.hash.replace(/^#test=/, '');
        element.tabChange('test', layid);

        element.on('tab(test)', function(elem){
          location.hash = 'test='+ $(this).attr('lay-id');
        });

      });

//    $("#surgeryBefore").click(function () {
//        $("#surgeryBefore").removeClass("layui-this");
//        $("#surgeryBeforeDiv").removeClass("layui-show");
//
//        $("#surgerying").removeClass("layui-this");
//        $("#surgeryingDiv").css("display","none");
//        $("#surgeryAfter").removeClass("layui-this");
//        $("#surgeryAfterDiv").css("display","none");
//
//        $("#surgeryBefore").addClass("layui-this");
//        $("#surgeryBeforeDiv").addClass("layui-show");
//    });
//    $("#surgerying").click(function () {
//        $("#surgerying").removeClass("layui-this");
//        $("#surgeryingDiv").removeClass("layui-show");
//
//        $("#surgeryBefore").css("display","none");
//        $("#surgeryBeforeDiv").css("display","none");
//        $("#surgeryAfter").css("display","none");
//        $("#surgeryAfterDiv").css("display","none");
//
//        $("#surgerying").addClass("layui-this");
//        $("#surgeryingDiv").addClass("layui-show");
//    });
//    $("#surgeryAfter").click(function () {
//            $("#surgeryAfter").removeClass("layui-this");
//            $("#surgeryAfterDiv").removeClass("layui-this");
//
//            $("#surgeryBefore").removeClass("layui-show");
//            $("#surgeryBeforeDiv").removeClass("layui-show");
//            $("#surgerying").removeClass("layui-show");
//            $("#surgeryingDiv").removeClass("layui-show");
//
//            $("#surgeryAfter").addClass("layui-this");
//            $("#surgeryAfterDiv").addClass("layui-show");
//    });
//    if(flag=="surgeryAfterDiv"){
//        $("#surgeryAfter").removeClass("layui-this");
//        $("#surgeryAfterDiv").removeClass("layui-this");
////        $("#roleListDiv").removeClass("layui-show");
////        $("#setRoleDiv").removeClass("layui-show");
//
//        $("#surgeryAfter").addClass("layui-this");
//        $("#surgeryAfterDiv").addClass("layui-show");
////        $("#updateRoleLi").css("display","inline-block");
////        $("#updateRoleDiv").css("display","inline-block");
//    }
});

/**
 * 进入数据录入界面
 */
function load(){
    window.location.href="/record/index";
}