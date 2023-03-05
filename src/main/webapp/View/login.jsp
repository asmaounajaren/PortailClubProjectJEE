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
<%--  <%request.getContextPath()%>/View/index.jsp--%>

  <form action="" method="post">
    <input type="email" name="email_login" placeholder="email">
    <input type="password" name="password_login" placeholder="password">
    <input type="submit" name="btn" value="login"/>
    <p class="message">Not registered? <a href="inscription.jsp">Create an account</a></p>
  </form>
</div>
</body>
</html>
