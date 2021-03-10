/**
 * 题目管理
 */
$(function() {
    layui.use('table', function(){
        var table = layui.table;
        var tbody = $("#tbody");
        $.get("/patients/questions",function(data){
            if(data != null){
                tbody.empty();
                $.each(data, function (index, item) {
                    var td=$("<tr><td>"+item.questionId+"</td>"
                    +"<td>"+item.questionName+"</td>"
                    +"<td>"+item.score+"</td>");
                    tbody.append(td);
                });
            }
        });
    });
});
