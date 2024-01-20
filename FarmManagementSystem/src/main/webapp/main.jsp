<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
<style type="text/css">
*{
    padding: 0;
    margin: 0;
    box-sizing: border-box;
    list-style: none;
    scroll-behavior: smooth;
    text-decoration: none;
}

:root{
    --text-color:rgb(0, 0, 0);
    --hover-color:#25eaf5;
    --bg-color:#250821;
    --secon-bg-color:#292e33;
    --big-font:2.5rem;
    --normal--font:2rem;
    --neon-box-shadow:0 0 .5rem #12f7ff;
    --h2-font:3rem;
    --font-neon-text-shadow:0 0 10px rgba(18,247,255,0.3),
    0 0 20px rgba(18,247,255,0.3),
    0 0 30px rgba(18,247,255,0.3),
    0 0 40px rgba(18,247,255,0.3),
    0 0 70px rgba(18,247,255,0.3),
    0 0 80px rgba(18,247,255,0.3),
    0 0 100px rgba(18,247,255,0.3),
    0 0 150px rgba(18,247,255,0.3);
}
body{
    font-family:"Poppins",sans-serif;
    background-color:var(--bg-color);
    color:var(--text-color);
    background-image: url("homeimg.jpg");
    background-size: cover;
    background-repeat: no-repeat;
    background-attachment: fixed;
}



header {
  position: fixed;
  top: 0;
  left: 0;
  z-index: 1000;
  border-bottom: 1px solid transparent;
  display: flex;
  align-items: center;
  justify-content: space-between;
  width: 100%;
  padding: 20px 10%;
  font-family: "newone";
}

header.sticky{
    background: var(--bg-color);
    border-bottom: 1px solid var(--secon-bg-color);
    padding: 12px 10%;
}

.logo{
    font-size: 26px;
    font-weight: 700;
    letter-spacing:1px;  
    font-family:"new" ;
}

span{
    color: var(--hover-color);
}

.nav{
    display:flex;

}

.nav a{
    color:var(--text-color);
    font-weight: 500;
    padding: 10px 20px;
   
}
.nav a:hover{
    color:var(--hover-color);
    text-shadow:0 0 10px rgba(18,247,255,0.6),
    0 0 20px rgba(18,247,255,0.6),
    0 0 30px rgba(18,247,255,0.6),
    0 0 40px rgba(18,247,255,0.6),
    0 0 70px rgba(18,247,255,0.6),
    0 0 80px rgba(18,247,255,0.6),
    0 0 100px rgba(18,247,255,0.6),
    0 0 150px rgba(18,247,255,0.6);
}

.nav a.active{
    color: var(--hover-color);
}
img{
	width: 100%;
	height: 100vh;
	object-fit: cover;
}
</style>
</head>
<body>
<!-- contact html link -->
	<div class="home-img">
		<img src="homeimg.jpg">
	</div>
	<!-- Header Site-->
	<header>
		<div class="logo">
			<span>MSKA</span> FARM MANAGEMENT
		</div>
		<ul class="nav">
			<li><a href="home.html">Home</a></li>
			<li><a href="about.html">About</a></li>
			<li><a href="contact.html">Contact</a></li>
		</ul>
	</header>

	<section>
	
	</section>


</body>
</html>