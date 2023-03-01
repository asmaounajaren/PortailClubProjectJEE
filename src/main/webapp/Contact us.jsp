<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Contact Us | Argan Store</title>
    <link rel="stylesheet" href="style.css" />
    <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css"
    />
    <link rel="icon" href="images/icon.png" />
</head>
<body>
<nav>
    <div class="container">
        <h1 class="logo"><a href="index.jsp">ARGAN STORE</a></h1>
        <div class="menu">
            <ul>
                <li><a href="index.jsp">Home</a></li>
                <li>
                    <a href="Foreign Distribution.jsp">Foreign Distribution</a>
                </li>
                <li><a href="commander.jsp">About Us</a></li>
                <li class="where"><a href="Contact us.jsp">Contact Us</a></li>
            </ul>
        </div>
    </div>
</nav>
<section>
    <div class="container">
        <div class="contact-us">
            <span>GET IN TOUCH TODAY</span>
            <h3>Write a comment</h3>
            <form action="">
                <%--@declare id="name"--%><%--@declare id="email"--%><label for="Name">Name</label>
                <input type="text" name="Name" />
                <label for="Email">Email</label>
                <input type="email" name="Email" />
                <label for="Name">Phone Number</label>
                <input type="text" name="Phone Number" />
                <label for="Name">Message</label>
                <textarea
                        name=""
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
                    <a href="Foreign Distribution.jsp">Foreign Distribution</a>
                </li>
                <li><a href="commander.jsp">About</a></li>
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
                    ><i class="fab fa-facebook-square"></i>arga_facebook.com</a
                    >
                </li>
                <li>
                    <a href=""
                    ><i class="fab fa-instagram-square"></i>arga_instagram.com</a
                    >
                </li>
                <li>
                    <a href=""
                    ><i class="fas fa-envelope-square"></i>arga_gmail.com</a
                    >
                </li>
            </ul>
        </div>
    </div>
    <div class="copyright">
        Copyright © 2023, Argan Store, All rights reserved
    </div>
</footer>
</body>
</html>
