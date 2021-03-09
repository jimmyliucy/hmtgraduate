/**
 * 菜单栏
 */
//获取当前窗口的路径uri
var pathUri=window.location.href;

console.log("配置菜单的当前pathUrl:"+pathUri);
$(function(){
    layui.use('element', function(){
        var element = layui.element;
        // 左侧导航区域（可配合layui已有的垂直导航）
        $.get("/auth/getUserPerms",function(data){
            if(data != null){
                getMenus(data);
                element.render('nav');
            }else{
                layer.alert("权限不足，请联系管理员",function () {
                    //退出
                    window.location.href = "/logout";
                });
            }
        });
    });
})

/**
 * 创建左边的菜单
*/
var getMenus = function(data){
    //回显选中
    var ul = $("<ul class='layui-nav layui-nav-tree' lay-filter='test'></ul>");
    for(var i = 0;i < data.length;i++){
        var node = data[i];
        if( node.istype==0){
            if(node.pId==0){
                var li = $("<li class='layui-nav-item' flag='"+node.id+"'></li>");
                //父级无page
                var a = $("<a class='' href='javascript:;'>"+node.name+"</a>");
                //设置不同的图标icon
                if (node.name == '系统管理') {
                    a = $("<a class='' href='javascript:;'><i class='layui-icon'>&#xe614;</i>&nbsp;" + node.name + "</a>");
                } else if (node.name == '手术认知管理') {
                    a = $("<a class='' href='javascript:;'><i class='layui-icon'>&#xe63c;</i>&nbsp;" + node.name + "</a>");
                }
                li.append(a);
                //获取子节点
                var childArry = getParentArry(node.id, data);
                if(childArry.length>0){
                    a.append("<span class='layui-nav-more'></span>");
                    var dl = $("<dl class='layui-nav-child'></dl>");
                    for (var y in childArry) {
                        var dd = $("<dd><a href='"+childArry[y].page+"'  target='mainFrame'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+childArry[y].name+"</a></dd>");
                        dl.append(dd);
                    }
                    li.append(dl);
                }
                ul.append(li);
            }
        }
    }
    $(".layui-side-scroll").append(ul);
}
//根据菜单主键id获取下级菜单
//id：菜单主键id
//arry：菜单数组信息
function getParentArry(id, arry) {
    var newArry = new Array();
    for (var x in arry) {
        if (arry[x].pId == id && arry[x].istype == '0')
            newArry.push(arry[x]);
    }
    return newArry;
}
function updateUsePwd(){
    layer.open({
        type:1,
        title: "修改密码",
        fixed:false,
        resize :false,
        shadeClose: true,
        area: ['450px'],
        content:$('#useDetail')
    });
}


