<%--
  Created by IntelliJ IDEA.
  User: Mars Tan
  Date: 2/26/2017
  Time: 6:11 PM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<script type="text/javascript">
    function dosubmit() {
        var th = document.form1;
        th.action = "<%=path%>/servlet/RegisterAction";
        th.submit();
    }
</script>
<head>
    <title>Test</title>
</head>
<body>
Hello World!
<form name="form1">
    <button type="button" onclick="dosubmit()">GENERATE</button>
</form>
</body>
</html>
