<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en-AU">

<head>
  <title>Docs Viewer</title>
  <meta http-equiv="content-type" content="application/xhtml+xml; charset=UTF-8" />
  <link rel="stylesheet" type="text/css" href="css/style.css" />

</head>

<body>
<div id="content">

  <div id="header"> 
    <div id="title"> 
      <h1>DocsViewer</h1>
    </div>
    <img src="images/bg/header_left.jpg" style="margin-left: 10%;"/></div>

   <div id="mainMenu">
    <ul class="floatLeft">
      <li><a href="UploadFile.jsp" class="here">Home</a></li>
      <li><a href="AboutUs.jsp" class="here">About Us</a></li>
     </ul>
     </div>

  <div id="page">
<center>
    <div class="width25 floatRight leftColumn">
<center>
      

<h2>UPLOAD THE DOC</h2>
      <p>
       
<form action="upload" method="post"
                        enctype="multipart/form-data">
<input type="file" name="file" size="50" />
<br />
<br/>
<input type="image" style="width:80px;height:70px;" src="images/bg/upload.jpg" />
</form> </p>
</center>
    </div>
    </center>

    <div class="width75 floatLeft">
      <div class="gradient">

        <h1>Welcome!</h1>
        <h2>DocsViewer</h2>

        <p style="color:khaki">
        Docsviewer lets you view your files even if your system doesn't support the file format!!! Just Upload it and you are done.<br>
       	</br>
       	File formats supported by Docsviewer : <br>
       	1> .doc </br>
       	2> .docx </br>
       	3> .ppt </br>
       	4> .pptx </br>
       	5> .pdf </br>
       	6> .odt </br>
		</p>       
</p>

      </div>

      

    </div>

  </div>

</div>
<div id="footer">

  <div id="width"> <span class="floatLeft"><pre><H3>					D		O		C		S				V		I		E		W		E		R</H3></pre></span> <span class="floatRight"> 
    
</div>


</body>

</html>