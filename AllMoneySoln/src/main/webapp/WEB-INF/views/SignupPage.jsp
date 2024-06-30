<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>SignUp Part I</title>
<style>

/* Reset some default browser styles */
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}

body {
background-image: url("img/signbg1.jpg");
background-position:center;
 background-size: cover;
position: relative;
  font-family: Arial, sans-serif;
  background-color: #f0f0f0;
  display: flex;
  justify-content: center;
  align-items: center;
  width:100%;
  height: auto;
}

.container {
position:relative;
	top:8px;
  width: 100%;
  border: solid 5px grey;
  max-width: 800px;
  padding: 20px;
  background-color: #ffffff;
  background-image: linear-gradient(white, grey);
  border-radius: 8px;
  box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
}

.registration-form {
  display: flex;
  flex-direction: column;
}

h2 {
  text-align: center;
  margin-bottom: 20px;
  color: #333333;
}

.form-group {
  margin-bottom: 15px;
}

label {
  font-weight: bold;
  display: block;
  margin-bottom: 5px;
  color: #555555;
}

input[type="text"],
input[type="email"],
input[type="password"] {
  width: 100%;
  padding: 10px;
  font-size: 16px;
  border: 1px solid #dddddd;
  border-radius: 4px;
}

button {
  background-color: #4CAF50;
  color: white;
  border: none;
  padding: 12px 20px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  border-radius: 4px;
  cursor: pointer;
  transition: background-color 0.3s ease;
}

button:hover {
  background-color: #45a049;
}

@media (max-width: 480px) {
  .container {
    max-width: 100%;
    border-radius: 0;
    box-shadow: none;
  }
}

</style>
</head>

<body>
	
   <div class="container">
    <form action="register" method="get" class="registration-form">
      <h2>Personal Information</h2>
      <div class="form-group">
        <label for="username"> First Name</label>
        <input type="text" id="username" name="firstname" >
      </div>
            <div class="form-group">
        <label for="username">Last Name</label>
        <input type="text" id="username" name="lastname" >
      </div>
            <div class="form-group">
        <label for="username">Father's Name</label>
        <input type="text" id="username" name="fathername" >
      </div>
       
            <div class="form-group">
        <label for="username">Mother's Name</label>
        <input type="text" id="username" name="mothername" >
      </div>
            <div class="form-group">
        <label for="username">Age</label>
        <input type="number" id="username" name="age">
      </div>
                  <div class="form-group">
        <label for="username">Date of Birth</label>
        <input type="number" id="username" name="dob" >
      </div>
            <div class="form-group" style="position:in-line;">
        <label for="username">Gender</label>
        <label>Male</label>
        <input type="radio"  name="username" >
        <label>Female</label>
        <input type="radio"  name="username" >
        <label>Others</label>
        <input type="radio"  name="username" >
      </div>
      <div class="form-group">
            <label for="username">Account Type</label>
            <select >
                    <option value="1" >Choose Option</option>
                    <option value="2">Savings Account</option>
                    <option value="3">Current Account</option>
                    <option value="4">Zero Balance Acc.</option>
                  </select>     
      </div>
            <div class="form-group">
        <label for="username">Occupation</label>
        <input type="text" id="username" name="occupation">
      </div>
            <div class="form-group">
            <label for="username">Blood Group</label>
            <select >
                    <option value="1" >Choose option</option>
                    <option value="2">A+</option>
                    <option value="3">B+</option>
                    <option value="4">O</option>
                  </select>
                 
        
        
      </div>
            <div class="form-group">
        <label for="username"> Current State and City</label>
        <input type="text" id="username" name="city" >
      </div>
     
            <div class="form-group">
        <label for="username">Pin Code</label>
        <input type="number" id="username" name="pincode">
      </div>
      <div class="form-group">
        <label for="email">Email</label>
        <input type="email" id="email" name="email" >
      </div>
      <div class="form-group">
        <label for="password">Password</label>
        <input type="password" id="password" name="password" required>
      </div>
      <div class="form-group">
        <button type="submit"> Next </button>
      </div>
    </form>
  </div>
</body>

</html>
    