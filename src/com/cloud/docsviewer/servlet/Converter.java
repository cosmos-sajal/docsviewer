package com.cloud.docsviewer.servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */

public class Converter extends HttpServlet {
	 private String UPLOAD_DIRECTORY = "";
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		String s=getServletContext().getRealPath("/");
    	UPLOAD_DIRECTORY=s+"uploads";
    	System.out.println(UPLOAD_DIRECTORY);
		String fname=""+request.getParameter("file");
		//System.out.println("f"+fname);
		String type=""+request.getParameter("type");
		//System.out.println("f"+type);
		
		int pages=0;
		
		if(type.equals("pdf"))
		{
			ConvertPDF c=new ConvertPDF();
			try
			{
			pages=c.convert(UPLOAD_DIRECTORY + File.separator + fname);	
			}
			catch(Exception e)
			{
				e.printStackTrace();	
				
			}
			/*MainClass mc=new MainClass();
			String a[]={"-i",UPLOAD_DIRECTORY + File.separator + fname,"-o",UPLOAD_DIRECTORY + File.separator +fname};
			mc.main(a);
			*/
		}
		else 
		{
			/*ConvertPPT c=new ConvertPPT();
			try
			{
				c.convert(UPLOAD_DIRECTORY + File.separator + fname);	
			}
			catch(Exception e)
			{
				e.printStackTrace();	
				
			}*/
			
			MainClass mc=new MainClass();
			String a[]={"-i",UPLOAD_DIRECTORY + File.separator + fname,"-o",UPLOAD_DIRECTORY + File.separator +fname+".pdf"};
			mc.main(a);
			ConvertPDF c=new ConvertPDF();
			try
			{
				pages=c.convert(UPLOAD_DIRECTORY + File.separator +fname+".pdf");	
			}
			catch(Exception e)
			{
				e.printStackTrace();	
				
			}
			
			
		}
		request.setAttribute("filename", fname);
		request.setAttribute("total_pages", pages);
		request.setAttribute("curr_page", 1);
		
		System.out.println("total pajds="+pages);
		
		request.getRequestDispatcher("/image.jsp").forward(request, response);

	}
}
