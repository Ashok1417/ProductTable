package Model;

public class ProductDetails {
String ProductId;
String ProductName;
String ProductDesc;
String Price;
String Stock;
String Category;
String Supplier;
String userName;
String Passwrd;

public ProductDetails() {}

public ProductDetails(String pid,String pName,String pDesc,String Pri,String Sto,String Cate,String Supp,String Username,String Pass) 
{
	this.ProductId=pid;
	this.ProductName=pName;
	this.ProductDesc=pDesc;
	this.Price=Pri;
	this.Stock=Sto;
	this.Category=Cate;
	this.Supplier=Supp;
	this.userName=Username;
	this.Passwrd=Pass;
}
public String getProductId() {
	return ProductId;
}
public void setProductId(String productId) {
	ProductId = productId;
}
public String getProductName() {
	return ProductName;
}
public void setProductName(String productName) {
	ProductName = productName;
}
public String getProductDesc() {
	return ProductDesc;
}
public void setProductDesc(String productDesc) {
	ProductDesc = productDesc;
}
public String getPrice() {
	return Price;
}
public void setPrice(String price) {
	Price = price;
}
public String getStock() {
	return Stock;
}
public void setStock(String stock) {
	Stock = stock;
}
public String getCategory() {
	return Category;
}
public void setCategory(String category) {
	Category = category;
}
public String getSupplier() {
	return Supplier;
}
public void setSupplier(String supplier) {
	Supplier = supplier;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPasswrd() {
	return Passwrd;
}
public void setPasswrd(String passwrd) {
	Passwrd = passwrd;
}
}
