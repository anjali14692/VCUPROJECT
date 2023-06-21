<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored = "false" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="forms" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.error{
color:red;
font-size:20px;
font-family:verdana;
}

body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            padding: 20px;
        }

        form {
            background-color: #fff;
            max-width: 400px;
            margin: 0 auto;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        }

        label {
            display: block;
            margin-bottom: 8px;
            font-weight: bold;
        }

</style>


</head>

<body>

<forms:form action="processform2"  method="post">
<table>
<tr><td><forms:label path="username">Username</forms:label></td>
<td><forms:input path="username"/>
<br>
<forms:errors path="username" cssClass="error"></forms:errors>
</td></tr>
<tr><td><forms:label path="password">Password</forms:label></td>
<td><forms:input path="password" placeholder="Password must have special Charcter and digit"/>
 <br>
<forms:errors path="password" cssClass="error"></forms:errors>
</td></tr>

<tr><td><forms:label path="fname">First Name</forms:label></td>
<td><forms:input path="fname"/>
<forms:errors path="fname" cssClass="error"></forms:errors>
 
</td></tr>

<tr><td><forms:label path="lname">Last Name</forms:label></td>
<td><forms:input path="lname"/>
<forms:errors path="lname" cssClass="error"></forms:errors>
 
</td></tr>

<tr><td><forms:label path="email">Email</forms:label></td>
<td><forms:input path="email" placeholder="Enter your email"/>
<br>
<forms:errors path="email" cssClass="error"></forms:errors>
 
</td></tr>

<tr><td><forms:label path="mobile_no">Mobile No</forms:label></td>
<td><forms:input path="mobile_no" pattern="[0-9]{10}" placeholder="Enter 10-digit mobile number"/>
<br>
<forms:errors path="mobile_no" cssClass="error"></forms:errors>
 
</td></tr>

<tr><td><forms:label path="address">Address</forms:label></td>
<td><forms:input path="address"/>
<br>
<forms:errors path="address" cssClass="error"></forms:errors>
 
</td></tr>



<tr><td><Input type="submit" value="Submit"></td></tr>
</table>
</forms:form>

</body>
</html>