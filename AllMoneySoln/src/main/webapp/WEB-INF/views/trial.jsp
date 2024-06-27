<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" class="antialiased">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Tailwind Starter Template - Multi Section Form / Scrollspy: Tailwind Toolbox</title>
    <meta name="description" content="">
    <meta name="keywords" content="">
    <link rel="stylesheet" href="https://unpkg.com/tailwindcss@2.2.19/dist/tailwind.min.css"/>
    <link href="https://unpkg.com/@tailwindcss/custom-forms/dist/custom-forms.min.css" rel="stylesheet">
    <!--Replace with your tailwind.css once created-->
 

</head>

<body >
<form>
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputPassword4">Password</label>
      <input type="text" class="form-control" id="inputPassword4" placeholder="Password">
    </div>
  </div>
    <div class="form-group col-md-2">
      <label for="inputZip">Zip</label>
      <input type="text" class="form-control" id="inputZip">
    </div>
  </div>

  <button type="submit" class="btn-primary">Sign in</button>
</form>



</body>
</html>    