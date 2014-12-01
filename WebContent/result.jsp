 <%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en-AU">

<head>
  <title>DOCS</title>
  <meta http-equiv="content-type" content="application/xhtml+xml; charset=UTF-8" />
  <link rel="stylesheet" type="text/css" href="css/style.css" />

</head>

<body>
<div id="content">

  <div id="header"> 
    <div id="title"> 
      <h1>DOCS VIEWER</h1>
    </div>
    <img src="images/bg/header_left.jpg" style="margin-left: 10%;"/></div>

   <div id="mainMenu">
    <ul class="floatLeft">
      <li><a href="UploadFile.jsp" class="here">Home</a></li>
      <li><a href="AboutUs.jsp" class="here">About Us</a></li>
     </ul>
     </div>

  <div id="page">

    <div class="width75 floatLeft">
      <div class="gradient">

        <h1>Success!!!</h1>
        <h2></h2>
	<center>
		<form action="convert" method="post">
			<h2>You are just one click away from viewing your doc</br><input type="hidden" name="file" value=${requestScope["filename"]} size="50" />
			<input type="hidden" name="type" value=${requestScope["type"]} size="50" />
			<input type="image" style="width:80px;height:35px;" src="images/bg/view.png" /></h2>
			</form>
		
           	</center>

      

    </div>

  </div>

</div>
</body>

</html>