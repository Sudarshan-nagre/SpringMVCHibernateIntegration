<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
   	<%@include file="csscdn.html" %>
      <title>Save Student form</title>
      <%@ include file="navbar.html" %>
   </head>

   <body>
      <h2>Student Information</h2>
      <form:form method = "post" action = "../student">
         <table class="table table-striped" style="width: 50%;">
            <tr>
               <td><form:label path = "name">Name</form:label></td>
               <td><form:input path = "name" /></td>
            </tr>
            <tr>
               <td><form:label path = "email">Email</form:label></td>
               <td><form:input path = "email" /></td>
            </tr>
            <tr>
               <td><form:label path = "mobile">Mobile</form:label></td>
               <td><form:input path = "mobile" /></td>
            </tr>
              <tr>
               <td><form:label path = "pwd">pwd</form:label></td>
               <td><form:input type="text" path = "pwd" /></td>
            </tr><form:input type="hidden" path = "id"/>
            <tr>
               <td colspan = "2">
                  <input type = "submit" value = "Submit"/>
               </td>
            </tr>
         </table>  
      </form:form>
   </body>
   
</html>