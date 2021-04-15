<%@ page language="java" contentType="text/html" pageEncoding="ISO-8859-1"%>

<%@ include file="WebPage.jsp" %>

<body bgcolor="White">

<form action="Register" method="post">
    <div class="container">
      <h1>Sign Up</h1>
      <p>Please fill in this form to create an Product.</p>
      <hr>
      <label for="ProductId"><b>Product ID</b></label>
      <input type="text" placeholder="Product ID" name="ProductId" required>
      
      <label for="ProductName"><b>Product Name</b></label>
      <input type="text" placeholder="Product Name" name="ProductName" required>
      
      <label for="ProductDesc"><b>Product Desc</b></label>
      <input type="text" placeholder="Product Desc" name="ProductDesc" required>
      
      <label for="Price"><b>Price</b></label>
      <input type="text" placeholder="Price" name="Price" required>
      
      <label for="Stock"><b>Stock</b></label>
      <input type="text" placeholder="Stock" name="Stock" required>
      
      <label for="Category"><b>Category</b></label>
      <input type="text" placeholder="Category" name="Category" required>
      
      <label for="Supplier"><b>Supplier</b></label>
      <input type="text" placeholder="Supplier" name="Supplier" required>
      
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