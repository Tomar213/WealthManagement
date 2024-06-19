<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Login Page</title>
 	<style>
 	body {
  margin: 0;
  padding: 20px;
  height: 100vh;
  display: flex;
  flex-wrap:wrap;
  justify-content: center;
  justify-content:space-around;
  align-items: center;
  background-color: #BDB76B;
  font-family: Arial, sans-serif;
background: #30cfd0;
  
    /* Chrome 10-25, Safari 5.1-6 */
    background: -webkit-linear-gradient(to bottom, rgba(48,207,208,0.8), rgba(51,8,103,0.8));
  
    /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
    background: linear-gradient(to bottom, rgba(48,207,208,0.8), rgba(51,8,103,0.8))
}

.login-container {
  background-color: #9EA667BD;
  border-style: inset;
  border-width:5px;
  width: 350px;
  padding: 40px;
  border-radius: 8px;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
  
}
.gradient-custom {

    background: #d299c2;

    background: -webkit-linear-gradient(to left, rgba(210,153,194,0.5), rgba(254,249,215,0.5));
  
    background: linear-gradient(to left, rgba(210,153,194,0.5), rgba(254,249,215,0.5))
  }
.login-container2 {
 	margin:0px;
	display:flex;
	justify-content:center;
	flex-direction:column;
  border-style: onset;
  border-width:5px;
  width: 450px;
  height:450px;
  padding: 40px;
  border-radius: 10px;
  box-shadow: 0 0 10px rgba(0.1, 0, 0, 0.1);
 
 
}

.login-form {
  text-align: center;
}

.login-form h2 {
  margin-bottom: 20px;
  color: #333;
}

.input-group {
  margin-bottom: 20px;
}

.input-group label {
  display: block;
  text-align: left;
  margin-bottom: 8px;
  color: #666;
}

.input-group input {
  width: 100%;
  padding: 10px;
  font-size: 16px;
  border: 1px solid #ccc;
  border-radius: 4px;
}

button {
  display: block;
  width: 100%;
  padding: 10px;
  background-color: #4CAF50;
  color: white;
  border: none;
  border-radius: 4px;
  font-size: 16px;
  cursor: pointer;
  transition: background-color 0.3s ease;
}

button:hover {
  background-color: #45a049;
}
.logod{
position:relative;
left:15px;

}
.fancy-border-radius {
  border-radius: 57% 43% 25% 75% / 70% 70% 30% 30%;

  /* These are ADDITIONAL styles - add them if you want an object exactly like in the demo above */
  width: 400px;
  height: 400px;
  background: #ad5389;
  background: -webkit-linear-gradient(to right,
      #3c1053,
      #ad5389);
  background: linear-gradient(to right,
      #3c1053,
      #ad5389);
}
.item1{font-style:serif;}
.fancy-item{
position:relative;
left:60px;
top:90px;
color:magenta;
}
a{
color:yellow;}
 	
 	</style>
</head>
<body>

  <div class="login-container">
 
    <form class="login-form">
      <h2>Login</h2>
      <div class="input-group">
        <label for="account-number">User ID</label>
        <input type="text" id="account-number" name="account-number" required>
      </div>
      <div class="input-group">
        <label for="password">Password</label>
        <input type="password" id="password" name="password" required>
      </div>
      <button type="submit">Login</button>
    </form>
    <br>
	<a href="google.com">Forgot Password</a>
  </div>

   <div class="logod">
    <img src= "img/logo.png" alt="chandtare">
   </div>
  <div class="login-container2 gradient-custom">
 
     <h1  class="item1">All Money Solution</h1>
     <h3 class="item2">A way to manage all your wealth from one place</h3>
 	<div class="fancy-border-radius">
	 	<span class="fancy-item">Keep Track of your  money flow <br> control your expences <br> connect with several partners to grow <br> <br> Do not have an account? <br>Click <a href="SignupPage.jsp">SignUp</a> to register yourself </span>
 	</div>
  </div>
  
  
</body>
</html>
    