<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Home | City Club</title>
    <link rel="stylesheet" href="../css/styleee.css" />
    <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css"
    />
    <link rel="icon" href="../images/iconcityclup.PNG" />
</head>
<body>
<div class="container">
<nav>
        <h1 class="logo"><a href="index.html">CITY CLUB</a></h1>
        <div class="menu">
            <ul>
                <li class="where"><a href="index.jsp">Home</a></li>
                <li>
                    <a href="réserver séance gratuit.jsp">Réserver Séance</a>
                </li>
                <li><a href="">CRUD</a></li>
                <li><a href="Contact us.jsp">Contact</a></li>
            </ul>
        </div>
</nav>
    <div class="wrapper">
<%--        <img style="background-image: linear-gradient(rgba(0,0,0,0.75),rgba(0,0,0,0.75)),url(../images/City-Club.jpg)" alt="" />--%>
        <div>
            <span>Pratical Informations</span>
            <p>
                Une salle de sport (aussi appelé centre de remise en forme, centre de fitness ou centre de gym)
                est un lieu où sont rassemblés des équipements permettant la pratique d'exercices d'activité physique.
            </p>
            <button>Explore Now</button>
        </div>
    </div>
    <div class="featured-catagories">
        <h2>Featured Activity</h2>
    </div>
        <div class="products">

            <div class="product-item">
                <img src="../images/11.PNG" alt="" />
                <div class="description">
                    <h3 class="title">AQUAGYM
                    </h3>
                    <p class="desc"> <i class="fas fa-check"></i> Accès aux cours VIRTUAL TRAINING </p>
                    <p class="desc"> <i class="fas fa-check"></i> Accès aux cités des sports </p>
                    <p class="desc"> <i class="fas fa-check"></i> diet plans </p>
                    <p class="desc"> <i class="fas fa-check"></i> overall results </p>
                    <div class="stars-price">
                        <label class="price">150 MAD</label>
                    </div>
                </div>
                <a href="detail_produit.jsp"><input type="submit" id="abonner1" name="abn1" value="S'abonner"/></a>

            </div>
            <div class="product-item">
                <img src="../images/13.PNG" alt="" />
                <div class="description">
                    <h3 class="title">DANCE AFRO</h3>
                    <p class="desc"> <i class="fas fa-check"></i> Accès aux cours VIRTUAL TRAINING</p>
                    <p class="desc"> <i class="fas fa-check"></i> weight lifting </p>
                    <p class="desc"> <i class="fas fa-check"></i> diet plans </p>
                    <p class="desc"> <i class="fas fa-check"></i> overall results </p>
                    <div class="stars-price">
                        <label class="price">300 MAD</label>
                    </div>
                </div>
                <a href="detail_produit.jsp"><input type="submit" id="abonner2" name="abn1" value="S'abonner"/></a>
            </div>
            <div class="product-item">
                <img src="../images/14.PNG" alt="" />
                <div class="description">
                    <h3 class="title"> FUNCTIONAL ARMY</h3>
                    <p class="desc"> <i class="fas fa-check"></i> Accès à toutes les activités du club</p>
                    <p class="desc"> <i class="fas fa-check"></i> Accès aux cours VIRTUAL TRAINING</p>
                    <p class="desc"> <i class="fas fa-check"></i> diet plans </p>
                    <p class="desc"> <i class="fas fa-check"></i> overall results </p>
                    <div class="stars-price">
                        <label class="price">1500 MAD</label>
                    </div>
                </div>
                <a href="detail_produit.jsp"><input type="submit" id="abonner3" name="abn1" value="S'abonner"/></a>
            </div>
        </div>
</div>
    <div class="argan-desc">
        <div>
            <span>Qu est -qu un CLUB CITY LADY ?</span>
            <p>
                Les clubs CITYLADY représentent l’espace 100% femmes du réseau CityClub.
                Ils ont été étudiés pour répondre aux besoins et aux attentes des femmes sur 3 générations
                qui souhaitent mincir, se tonifier et se détendre en toute intimité, avec des résultats durables
            </p>
            <span>Qu est -ce qu un CLUB CITE DES SPORTS ?</span>
            <p>
                Les clubs CITÉS DES SPORTS sont des MÉGA CLUBS d’une grande superficie allant jusqu’à 6000m²,
                et qui disposent de toutes les activités ainsi que des espaces Football, Basketball et MMA,
                avec des espaces CITYLADY 100% femmes.
            </p>
        </div>
    </div>
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
                <li class="where"><a href="Contact us.jsp">Contact Us</a></li>
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
                    ><i class="fab fa-facebook-square"></i>CityClub_facebook.com</a
                    >
                </li>
                <li>
                    <a href=""
                    ><i class="fab fa-instagram-square"></i>CityClub_instagram.com</a
                    >
                </li>
                <li>
                    <a href=""
                    ><i class="fas fa-envelope-square"></i>CityClub_gmail.com</a
                    >
                </li>
            </ul>
        </div>
    </div>
    <div class="copyright">
        Copyright © 2023, City Clup, All rights reserved
    </div>
</footer>
</body>
</html>