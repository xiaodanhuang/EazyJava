<%--
  Created by IntelliJ IDEA.
  User: xiaodanhuang
  Date: 2017/10/29
  Time: 下午8:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询</title>
</head>
<body>
<form action="/api/upLoadFile" method="post" enctype="multipart/form-data">
    选择文件：<input type="file" name="file"/>
    <input type="submit" value="提交"/>
</form>
<input type="text" id='ns'name="id" placeholder="idddd">
<input type="text" id='dd'name="password" placeholder="idddd">
<button type="button" id="submitBtn" onclick="submit()">sumit</button>
<a href="/api/downLoad?filename=12011毕业设计答辩.pptx">下载</a>
</body>
</html>
<script type="text/javascript" src="/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
    function submit() {
        var id=$('#ns').val();
        var password=$('#dd').val();
        $.ajax({
            url:"api/downLoad",
            type:'post',
            data:{
                filename:'12011毕业设计答辩.pptx'
            },
            dataType: 'json',

            success:function(data){
                console.log(data)
            },
            error:function(){
                console.log('error');
            }

        })
    }
</script>
