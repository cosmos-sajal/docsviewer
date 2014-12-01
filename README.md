Functionality provided :-
----------------------
To let a user view documents(.pdf, .ppt, .doc, etc) online with our application.(No need of any document reader)
If the user doesn't have file formats supported on their system they can upload on our app and view the documents 
online.


Approach Implemented :-
--------------------
1. Converting each document into PDF using different Converters.
2. It may happen that PDF reader might not be present in the browser, so next step is to convert each PDF file into
   its corresponding images(int .jpg format) and hence it can be viewed via browser.
   

How to run the code :-
-------------------
1. Start your apache server and run the UploadFile.jsp.
2. Upload the file on the upload page.
3. Now the file will be uploaded, click the view button to view your document.
4. On the viewing page, you can view your document, there are three buttons available where you can go to previous 
   page, next page or you can jump to a particular page.
   

Formats Supported :-
-----------------
1. ppt
2. pptx
3. pdf
4. odt
5. doc
6. docx


Project Extension :-
-----------------
1. Support for more formats.
2. Login and storage functionality to access documents from anywhere
