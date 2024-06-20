<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

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
  height: 700px;
  margin:60px;
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
  margin: 50px 40px 40px;
}
.eula {
  color: #999;
  font-size: 14px;
  line-height: 1.5;
  margin: 40px;
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
  height:90%;
}

path {
  fill: none;
  stroke: url(#linearGradient);;
  stroke-width: 4;
  stroke-dasharray: 240 1386;
}
.form {
  margin: 40px;
  position: absolute;
  width:100%;
  height:100%;
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
  color: #f2f2f2;
  font-size: 10px;
  height: 30px;
  line-height: 30px;
  outline: none !important;
  width: 25%;
}
.tt{
  
  border: 0;
  color: #f2f2f2;
  font-size: 10px;
  height: 30px;
  line-height: 30px;
  outline: none !important;
  width: 25%;
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
      
      <div class="form">
        <label for="email">Aadhar Card No.</label>
        <input type="email" id="email">
        <label for="email">Aadhar Card No.</label>
        <input type="email" id="email">
        <label for="password">PAN Card No.</label>
        <input  id="password">
        <label for="email">Full Address: </label>
        <textarea class="tt"></textarea>
        <label for="email">Annual Income</label>
        <input type="number" id="email">
        <label for="email">Unique Mark</label>
        <input type="email" id="email">
        <input type="submit" id="submit" value="Submit">
      </div>
    </div>
  </div>
</div>




</body>
</html>