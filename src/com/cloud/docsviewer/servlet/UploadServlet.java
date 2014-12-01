
package com.cloud.docsviewer.servlet;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class UploadServlet extends HttpServlet {
    private String UPLOAD_DIRECTORY = "";
  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
    	String s=getServletContext().getRealPath("/");
    	UPLOAD_DIRECTORY=s+"uploads";
    	File f=new File(UPLOAD_DIRECTORY);
    	if(!f.exists())
    	{
    		f.mkdir();
    		//System.out.println(f.mkdir());
    	}
    	//System.out.println("path i s:"+UPLOAD_DIRECTORY);
        //process only if its multipart content
        if(ServletFileUpload.isMultipartContent(request)){
            try {
                List<FileItem> multiparts = new ServletFileUpload(
                                         new DiskFileItemFactory()).parseRequest(request);
              
                String name="";
                for(FileItem item : multiparts){
                    if(!item.isFormField()){
                         name = new File(item.getName()).getName();
                        item.write( new File(UPLOAD_DIRECTORY + File.separator + name));
                    }
                }
                
                int i = name.lastIndexOf('.');
                String extension="";
                if (i > 0) {
                    extension = name.substring(i+1);
                }
               //File uploaded successfully
               request.setAttribute("message", "File Uploaded Successfully");
               request.setAttribute("filename", name);
               request.setAttribute("type",extension);
               
            } catch (Exception ex) {
               request.setAttribute("message", "File Upload Failed due to " + ex);
            }          
         
        }else{
            request.setAttribute("message",
                                 "Sorry this Servlet only handles file upload request");
        }
    
        request.getRequestDispatcher("/result.jsp").forward(request, response);
     
    }
  
}