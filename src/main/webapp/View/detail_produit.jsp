<%--
  Created by IntelliJ IDEA.
  User: asmao
  Date: 3/2/2023
  Time: 8:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Réserver Séance | City Club</title>
    <link rel="stylesheet" href="../css/style3.css" />
    <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css"
    />
    <link rel="icon" href="../images/iconcityclup.PNG" />
</head>
<body>
<nav>
    <div class="container">
        <h1 class="logo"><a href="index.jsp">City Club</a></h1>
        <div class="menu">
            <ul>
                <li><a href="index.jsp">Home</a></li>
                <li>
                    <a  href="réserver séance gratuit.jsp">Réserver Séance</a>
                </li>
                <li ><a href="Contact us.jsp">Contact Us</a></li>
            </ul>
        </div>
    </div>
</nav>
<section>
    <div class="container">
        <div class="details">
            <h2>RÉSERVER MA CARTE</h2>
            <h3>Indiquez vos coordonnées, on vous rappelle !</h3>
            <form class="frm" action="<%=request.getContextPath()%>/AbonnementServlet" method="post">
                <%--@declare id="name"--%><%--@declare id="email"--%><%--@declare id="ville"--%>
                <label for="nom">Name</label>
                <input type="text" name="nom" id="nom"/>
                <label for="email">Email</label>
                <input type="email" name="email" />
                <label for="ville">Ville</label>
                <select name="ville" id="ville">
                    <option value="Rabat">Rabat</option>
                    <option value="Agadir">Agadir</option>
                    <option value="Tanger">Tanger</option>
                    <option value="Casa Blanca">Casa Blanca</option>
                </select>
                <button class="submit-btn">RÉSERVER</button>
            </form>
        </div>
    </div>
</section>
<footer>
    <div class="footer-content">
        <div class="menu">
            <span>Menu</span>
            <ul>
                <li><a href="index.jsp">Home</a></li>
                <li>
                    <a href="réserver séance gratuit.jsp">Réserver Séance</a>
                </li>
                <li><a href="">CRUD</a></li>
                <li><a href="Contact us.jsp">Contact Us</a></li>
            </ul>
        </div>
        <div class="newlister">
            <span>NEWSLETTER</span>
            <input type="email" placeholder="Enter your Email..." />
            <button>SIGN UP</button>
        </div>
        <div class="social-media">
            <span>FOLLOW US</span>
            <ul>
                <li>
                    <a href=""
                    ><i class="fab fa-facebook-square"></i>aCity Club_facebook.com</a
                    >
                </li>
                <li>
                    <a href=""
                    ><i class="fab fa-instagram-square"></i>City Club_instagram.com</a
                    >
                </li>
                <li>
                    <a href=""
                    ><i class="fas fa-envelope-square"></i>City Club_gmail.com</a>
                </li>
            </ul>
        </div>
    </div>
    <div class="copyright">
        Copyright © 2023, City Club, All rights reserved
    </div>
</footer>
</body>
</html>
