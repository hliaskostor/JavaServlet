<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>

<style>
input[type=text] {
 width: 80%;
  background-color: Gray;
  color: white;
  padding: 10px;
  margin: 5px ;
  border: 6px;
  border-radius: 10px;
 
}
  h1 {
color: #999999;
font-family: arial, sans-serif;
font-size: 20px;
font-weight: bold;
margin-top: 0px;
margin-bottom: 200px;
}

input[type=submit] {
  background-color: Gray;
  
}
button[type=create] {
   background-color: grey;
  border-radius: 8px;
  border-width: 0;
  color: white;
  cursor: pointer;
   font-size: 14px;
  font-weight: 500;
  line-height: 20px;
  margin: 0;
  padding: 10px 12px;
  text-align: center;
}
button[type=back] {
   background-color: grey;
  border-radius: 10px;
  border-width: 0;
  color: white;
  cursor: pointer;
   font-size: 14px;
  font-weight: 500;
  line-height: 20px;
  margin: 0;
  padding: 10px 12px;
  text-align: center;
}
.center{
display: flex;
  justify-content: center;
  align-items: center;
  height: 400px;
  border: 400px solid grey;}
  
 option{
 font-family: arial, sans-serif;
font-size: 20px;
font-weight: bold;
margin-top: 0px;
margin-bottom: 1px
 }
 label{
 font-family: arial, sans-serif;
font-size: 20px;
font-weight: bold;
margin-top: 0px;
margin-bottom: 1px}
</style>


<div class="center">
<body>



<br><br><br>

<form action="AssignServlet" method="post"> 
  <label for="Course">Choose a course:</label>
  
  <select name="course" id="course">
    <option value="Comp. Science">Comp.Science</option>
    <option value="Music">Music</option>
    <option value="Biology">Biology</option>
    <option value="Art">Art</option>
    <option value="Nursing">Nursing</option>
    <option value="Mathematics">Mathematics</option>
    <option value="M. Engineering">M. Engineering</option>
    <option value="Marketing">Marketing</option>
    <option value="Law">Law</option>
    <option value="Accounting">Accounting</option>
    <option value="Architecture">Architecture</option>
    <option value="Medicine">Medicine</option>
  </select> 

	<br><br><br>




  <label for="name">Name:</label><br>
  <input type="text" id="name" name="name"><br>
    
  <label for="Surname">Surname:</label><br>
  <input type="text" id="surname" name="surname"><br><br>
  
  <button type="create" name="assign" value="assign">Assign Course to Professor</button> 
     <button type="back" value="back" formaction="SecretaryServlet.html">Back</button> 
</div>
</form> 

<button onclick="window.location.href = 'logout.jsp';"> Logout</button>

</body>
</html>