package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.ResultSet;
import java.sql.SQLException;

import Model.ProductDetails;
import Utility.DbConn;

public class RegistDao {
	
	Connection Conn;
	public RegistDao()throws Exception 
	{
		
		Conn=DbConn.getMySqlConnection();
	}
	
	public boolean registerCustomer(ProductDetails product)throws SQLException
	{
		PreparedStatement psmt=Conn.prepareStatement("insert into productdetails values(?,?,?,?,?,?,?,?,?)");
		
		psmt.setString(1, product.getProductId());
		psmt.setString(2, product.getProductName());
		psmt.setString(3, product.getProductDesc());
		psmt.setString(4, product.getPrice());
		psmt.setString(5, product.getStock());
		psmt.setString(6, product.getCategory());
		psmt.setString(7, product.getSupplier());
		psmt.setString(8, product.getUserName());
		psmt.setString(9, product.getPasswrd());
	
		int row_eff=psmt.executeUpdate();
		
		//ResultSet executeQuery = psmt.executeQuery();
		
		//executeQuery.next()
		
		//executeQuery.getString(row_eff)
		
		if(row_eff>0)
			return true;
		else
			return false;
	}
	
	public ProductDetails checkCredential(ProductDetails product)throws SQLException
	{
		PreparedStatement psmt=Conn.prepareStatement("select * from productdetails where Username=? and Passwrd=?");
		
		psmt.setString(1, product.getUserName());
		psmt.setString(2, product.getPasswrd());
		
		ResultSet rs=psmt.executeQuery();
		
		if(rs.next())
		{
			product.setUserName(rs.getString(8));
		}
		else
		{
			product=null;
		}
		
		return product;
	}

}
