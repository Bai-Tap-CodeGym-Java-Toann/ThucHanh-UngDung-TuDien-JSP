<%--
  Created by IntelliJ IDEA.
  User: Surface Pro 4
  Date: 2018/10/19
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Reslut</title>
</head>
<body>
<%
    String reslut = (String) request.getAttribute("reslut");
    if (reslut == (null)) {
        reslut = "chưa có dữ liệu";
    }
    String search = request.getParameter("txtSearch");
%>
<h2>từ <%=search%> tìm kiếm là: <%=reslut%>
</h2>
</body>
</html>
