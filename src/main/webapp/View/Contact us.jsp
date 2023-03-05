<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Contact Us | City Club</title>
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
                <li><a href="réserver séance gratuit.jsp">Réserver Séance</a></li>
                <li class="where"><a href="Contact us.jsp">Contact Us</a></li>
            </ul>
        </div>
    </div>
</nav>
<section>
    <div class="container">
        <div class="contact-us">
            <span>REMPLISSEZ LE FORMULAIRE</span>
            <h3>CITYCLUB est à l’écoute, nous serions très ravis d’être en contact avec vous.</h3>
            <form action="<%=request.getContextPath()%>/ContactServlet" method="post">
                <%--@declare id="name"--%><%--@declare id="email"--%><label for="Name">Name</label>
                <input type="text" name="Name" />
                <label for="Email">Email</label>
                <input type="email" name="Email" />
                <label for="Name">Phone Number</label>
                <input type="text" name="Phone Number" />
                <label for="Name">Message</label>
                <textarea

                        id=""
                        cols="30"
                        rows="10"
                        name="Message"
                ></textarea>
                <button class="submit-btn">Submit</button>
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
                <li><a href="commander.jsp">CRUD</a></li>
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
                    ><i class="fab fa-facebook-square"></i>City Club_facebook.com</a
                    >
                </li>
                <li>
                    <a href=""
                    ><i class="fab fa-instagram-square"></i>City Club_instagram.com</a
                    >
                </li>
                <li>
                    <a href=""
                    ><i class="fas fa-envelope-square"></i>City Club_gmail.com</a
                    >
                </li>
            </ul>
        </div>
    </div>
    <div class="copyright">
        Copyright © 2023, City Club, All rights reserved
    </div>
</footer>
</form>
</body>
</html>
