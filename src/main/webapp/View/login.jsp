<%--
  Created by IntelliJ IDEA.
  User: Fujitsu
  Date: 3/1/2023
  Time: 09:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Login Page</title>
  <link rel="stylesheet" type="text/css" href="../css/style1.css">
</head>
<body>
<div class="form">
  <p>Login</p>
  <form action="<%=request.getContextPath()%>/LoginServlet" method="post">
    <input type="text" name="username" placeholder="username">
    <input type="password" name="password" placeholder="password">
    <button>login</button>
    <p class="message">Not registered? <a href="inscription.jsp">Create an account</a></p>
  </form>
</div>
</body>
</html>
