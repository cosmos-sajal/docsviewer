<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
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
      <h1>Docs Viewer</h1>
    </div>
    <img src="images/bg/header_left.jpg" style="margin-left: 10%;"/></div>

  <div id="mainMenu">
    <ul class="floatLeft">
      <li><a href="UploadFile.jsp" class="here">Home</a></li>
      <li><a href="AboutUs.jsp" class="here">About Us</a></li>
     </ul>
     </div>
     

  <div id="page">

   

  <center>  <div class="">
     <center> <div class="">

        <%
int pageNo=1;
if(request.getParameter("curr_page")!=null)
{

pageNo=Integer.parseInt(request.getParameter("curr_page"));
}

int total_pages=0;

if(request.getAttribute("total_pages")!=null)
	total_pages=(Integer)request.getAttribute("total_pages");
else
	total_pages=Integer.parseInt(request.getParameter("total_pages"));


if(pageNo==0)
{
	pageNo=1;
}

if(pageNo>total_pages)
{
	pageNo=total_pages;
}
String filename=null;
if(request.getAttribute("total_pages")!=null)
	filename=(String)request.getAttribute("filename");
else
	filename=request.getParameter("filename");

if(request.getParameter("jump")!=null)
{
	try
	{
		pageNo=Integer.parseInt(request.getParameter("jump"));
		if(pageNo<=0)
		{
			pageNo=1;
		}

		if(pageNo>total_pages)
		{
			pageNo=total_pages;
		}
	}
	catch(Exception e)
	{
		
	}
}

String UPLOAD_DIRECTORY="/com.cloud.docsviewer/uploads/";
String page_image="";
if(!filename.endsWith(".pdf"))
	page_image=UPLOAD_DIRECTORY+filename+".pdf-"+pageNo+".jpg";
else
	page_image=UPLOAD_DIRECTORY+filename+"-"+pageNo+".jpg";
%>

<img src="<%=page_image%>" height="80%" width="80%"/>
<table align="center">
<tr>
<td>
<form action="/com.cloud.docsviewer/image.jsp" method="post">
<input type="image" src="images/bg/prev.jpg" style="width:40px;height:30px;">
<input type="hidden" name="filename" value=<%=filename%>>
<input type="hidden" name="total_pages" value=<%=total_pages%>>
<input type="hidden" name="curr_page" value=<%=pageNo-1%>>

</form>
</td>
<td>

<form action="/com.cloud.docsviewer/image.jsp" method="post">

<input type="hidden" name="filename" value=<%=filename%>>
<input type="hidden" name="total_pages" value=<%=total_pages%>>
<input type="hidden" name="curr_page" value=<%=pageNo+1%>>
<input type="image" src="images/bg/next.ico" style="width:40px;height:30px;">

</form>
</td>

<td></td><td></td><td><h4><%=pageNo%>/<%=total_pages%></h4></td><td></td><td style="color:khaki;position:absoulte;top:0px;">
<form action="/com.cloud.docsviewer/image.jsp" method="post">
jump to page:<input type="text" name="jump" style="width:30px;height:10px;" value=<%=pageNo%>></input>
<input type="hidden" name="filename" value=<%=filename%>>
<input type="hidden" name="total_pages" value=<%=total_pages%>>
<input type="hidden" name="curr_page" value=<%=pageNo%>>
<input type="image" src="images/bg/jump.jpg" style="width:40px;height:30px;">

</form></td>
</tr>
</table>







      </div>
</center>
      

    </div>
</center>
  </div>

</div>
<div id="footer">

  <div id="width"> <span class="floatLeft"><pre><H3>					D		O		C		S				V		I		E		W		E		R</H3></pre></span> <span class="floatRight"> 
   
</div>

</body>

</html>