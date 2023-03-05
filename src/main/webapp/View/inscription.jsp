<%--
  Created by IntelliJ IDEA.
  User: Fujitsu
  Date: 3/1/2023
  Time: 09:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!--<title> Registration or Sign Up form in HTML CSS | CodingLab </title>-->
    <link rel="stylesheet" href="../css/style.css">
</head>
<body>

<div class="wrapper">

    <h2>Registration</h2>
    <form action="<%=request.getContextPath()%>/InsciptionServlet" method="post">
        <div class="input-box">
            <input type="text"  name="firstName" placeholder="Enter your name" required>
        </div>
        <div class="input-box">
            <input type="text" name="Email" placeholder="Enter your email" required>
        </div>
        <div class="input-box">
            <input type="password" name="password" placeholder="Create password" required>
        </div>

        <div class="policy">
            <input type="checkbox">
            <h3>I accept all terms & condition</h3>
        </div>
        <div class="input-box button">
            <input type="Submit" value="Register Now">
        </div>
        <div class="text">
            <h3>Already have an account? <a href="login.jsp">Login now</a></h3>
        </div>
    </form>
</div>
</body>
</html>