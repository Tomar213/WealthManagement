<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SignUp part II</title>

<style>




body {
  background: white;
  font-family: 'Inter UI', sans-serif;
  margin: 0;
  padding: 20px;
}
.page {
  background: #e2e2e5;
  display: flex;
  flex-direction: column;
  height: calc(100% - 40px);
  position: absolute;
  place-content: center;
  width: calc(100% - 40px);
}
.container {
  display: flex;
  height: 100%;
  margin:60px;
  margin-bottom: 60px;
  width: 1000px;
}

.left {
  background: white;
  height: calc(100% - 300px);
  top: 150px;
  position: relative;
  width: 50%;
}
.login {
  font-size: 20px;
  font-weight: 900;
  margin: 30px 40px 10px;
}
.eula {
  color: #999;
  font-size: 14px;
  line-height: 1.5;
  margin: 10px;
}
.right {
display:flex;
fex-direction:column;
flex-wrap:wrap;
  background: #474A59;
  box-shadow: 0px 0px 40px 16px rgba(0,0,0,0.22);
  color: #F1F1F2;
 top:20px;

  width: 100%;
  height:100%;
}

.form {
  margin: 8px;
  position: absolute;
  width:40%;
  height:80%;
  display:flex;
  flex-direction:column;
  flex-wrap:wrap;
  
}
label {
  color:  #c2c2c5;
  display: block;
  font-size: 14px;
  height: 16px;
  margin-top: 20px;
  margin-bottom: 5px;
}
input {
  
  border: 0;
  color: black;
  font-size: 10px;
  height: 30px;
  line-height: 30px;
  outline: none !important;
  width: 250px;
}
.tt{
  
  border: 0;
  color: #f2f2f2;
  font-size: 10px;
  height: 45px;
  line-height: 30px;
  outline: none !important;
  width: 250px;
}
.submit{
border:solid 2px grey;
padding:10px;
margin:10px;
}



</style>
</head>
<body>


<div class="page">
  <div class="container">
    <div class="left">
      <div class="login">OpenAccount</div>
      <div class="eula">By logging in you agree to the ridiculously long terms that you bother to read</div>
    </div>
    <div class="right">
      
      <div class="form" >
      <form action="register" method="post">
      
        <label for="email" aadharNo>Aadhar Card No.</label>
        <input type="Number" name="aadharNo" id="email" required>
        <label for="email">Any Other id (if not Aadhar)</label>
        <input type="email" id="email">
        <label for="password">PAN Card No.</label>
        <input  id="password" name="panNo" required>
        <label for="email">Full Address: </label>
        <textarea class="tt" name="address"></textarea>
        <label for="email">Annual Income</label>
        <input type="number" name="income" id="email">
        <label for="email">Set Your Password</label>
        <input type="password" name="password" id="email">
        <button  type="submit"  class="submit" >Submit</button>
        <button    class="submit"> <a href="#"  >Reset</a> </button>
        <button    class="submit"><a href="SignupPage"  >Previous Page</a></button>
        </form>
      </div>
    </div>
  </div>
</div>




</body>
</html>