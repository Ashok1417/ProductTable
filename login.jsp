<%@ page language="java" contentType="text/html" pageEncoding="ISO-8859-1"%>


<%@ include file="WebPage.jsp" %>

<body bgcolor="Grey">

<form class="modal-content" action="login" method="post">
    <div class="container">
      <h1>Login</h1>
      <p>Please Login</p>
      <hr>
    
      <label for="UserName"><b>UserName</b></label>
      <input type="text" placeholder="UserName" name="UserName" required>
      
      <label for="Passwrd"><b>Password</b></label>
      <input type="text" placeholder="Passwrd" name="Passwrd" required>
      
      <button type="Reset" class="Reset">Reset</button>
      <button type="submit" class="Submit">Submit</button>
</div>
</form>
</body>
</html>