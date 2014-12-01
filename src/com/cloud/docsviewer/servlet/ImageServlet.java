package com.cloud.docsviewer.servlet;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class ImageServlet extends HttpServlet {  
	private  String UPLOAD_DIRECTORY = "";
    public void doGet(HttpServletRequest request,HttpServletResponse response)  
             throws IOException  
    {  
    
    	String s=getServletContext().getRealPath("/");
    	UPLOAD_DIRECTORY=s+"uploads";
    	
    response.setContentType("text/html");  
        //ServletOutputStream out;  
        //out = response.getOutputStream();
        PrintWriter out1=response.getWriter();
        String fname=request.getParameter("filename");
        //FileInputStream fin = new FileInputStream(fname+".pdf"+"-1.jpg");  
        out1.println("<html><body>");
        out1.println("<img src='/home/kk/proj/com.cloud.docsviewer/uploads/demo.docx.pdf-1.jpg' height=100 width=100/>");
        out1.println("<form>");
        out1.println("<input type=submit value=prev>");
        out1.println("</form>");
        
        out1.println("<form>");
        out1.println("<input type=submit value=next>");
        out1.println("</form>");
        out1.println("</body></html>");
    
    /*
    
    response.setContentType("text/html");  
    ServletOutputStream out;  
    out = response.getOutputStream();
    PrintWriter out1=response.getWriter();
    String fname=request.getParameter("filename");
    FileInputStream fin = new FileInputStream(fname+".pdf"+"-1.jpg");  
    out1.println("<div>");
    out1.println("<form>");
    out1.println("<input type=submit value=prev>");
    out1.println("</form>");
    
    out1.println("<form>");
    out1.println("<input type=submit value=next>");
    out1.println("</form>");
    out1.println("</div>");
    BufferedInputStream bin = new BufferedInputStream(fin);  
    BufferedOutputStream bout = new BufferedOutputStream(out); 
    //PrintWriter out=response.getWriter();
    int ch =0; ;  
    while((ch=bin.read())!=-1)  
    {  
    bout.write(ch);  
    }  
      
    bin.close();  
    fin.close();  
    bout.close(); 
    
    out.close();  
    */
    } 
    public void doPost(HttpServletRequest request,HttpServletResponse response)  
            throws IOException  
   { 
    	String s=getServletContext().getRealPath("/");
    	UPLOAD_DIRECTORY=s+"uploads";
    	
    	
    	   response.setContentType("image/jpeg");  
    	   ServletOutputStream out;  
    	   out = response.getOutputStream(); 
    	   String fname=""+request.getAttribute("filename");
    	   System.out.println(fname);
    	   FileInputStream fin = new FileInputStream(UPLOAD_DIRECTORY + File.separator + fname+".pdf"+"-1.jpg");  
    	     
    	   BufferedInputStream bin = new BufferedInputStream(fin);  
    	   BufferedOutputStream bout = new BufferedOutputStream(out);  
    	   int ch =0; ;  
    	   while((ch=bin.read())!=-1)  
    	   {  
    	   bout.write(ch);  
    	   }  
    	     
    	   bin.close();  
    	   fin.close();  
    	   bout.close();
    	   //out.close();
    	   response.setContentType("text/html");
    	   //PrintWriter out1=response.getWriter();
    	   out.println("<html><body>");
           out.println("<img src='/home/kk/proj/com.cloud.docsviewer/uploads/demo.docx.pdf-1.jpg' height=100 width=100/>");
           out.println("<form>");
           out.println("<input type=submit value=prev>");
           out.println("</form>");
           
           out.println("<form>");
           out.println("<input type=submit value=next>");
           out.println("</form>");
           out.println("</body></html>");
    	   
    	   out.close();
    	     
    	 
    	
    	/*
    	response.setContentType("text/html");  
        //ServletOutputStream out;  
        //out = response.getOutputStream();
        PrintWriter out1=response.getWriter();
        String fname=request.getParameter("filename");
        //FileInputStream fin = new FileInputStream(fname+".pdf"+"-1.jpg");  
        out1.println("<html><body>");
        out1.println("<img src='/home/kk/proj/com.cloud.docsviewer/uploads/demo.docx.pdf-1.jpg' height=100 width=100/>");
        out1.println("<form>");
        out1.println("<input type=submit value=prev>");
        out1.println("</form>");
        
        out1.println("<form>");
        out1.println("<input type=submit value=next>");
        out1.println("</form>");
        out1.println("</body></html>");
        //BufferedInputStream bin = new BufferedInputStream(fin);  
        //BufferedOutputStream bout = new BufferedOutputStream(out); 
        //PrintWriter out=response.getWriter();
        //int ch =0; ;  
        //while((ch=bin.read())!=-1)  
        //{  
        //bout.write(ch);  
        //}  
          
        //bin.close();  
        //fin.close();  
        //bout.close(); 
        
        //out.close();
         * 
         *   
         *   
         *   /
         */
   /*response.setContentType("image/jpeg");  
   ServletOutputStream out;  
   out = response.getOutputStream(); 
   String fname=""+request.getAttribute("filename");
   System.out.println(fname);
   FileInputStream fin = new FileInputStream(UPLOAD_DIRECTORY + File.separator + fname+".pdf"+"-1.jpg");  
     
   BufferedInputStream bin = new BufferedInputStream(fin);  
   BufferedOutputStream bout = new BufferedOutputStream(out);  
   int ch =0; ;  
   while((ch=bin.read())!=-1)  
   {  
   bout.write(ch);  
   }  
     
   bin.close();  
   fin.close();  
   bout.close();  
   out.close();  
  */
   }
 
}  