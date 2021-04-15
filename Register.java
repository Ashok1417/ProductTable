package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import Model.ProductDetails;
import dao.RegistDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;   
import javax.servlet.http.*;

@WebServlet("/Register")
public class Register extends HttpServlet 
{
	
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		try 
		{
			
		String Product_id=request.getParameter("ProductId");
		String Product_Name=request.getParameter("ProductName");
		String Product_Desc=request.getParameter("ProductDesc");
		String Price1=request.getParameter("Price");
		String Stock1 =request.getParameter("Stock");
		String Category1=request.getParameter("Category");
		String Supplier1=request.getParameter("Supplier");
		String UserName1=request.getParameter("UserName");
		String Password=request.getParameter("Passwrd");
		
		out.println("Product ID"+Product_id);
		out.println("Product Name"+Product_Name);
		out.println("Product Desc"+Product_Desc);
		out.println("Price"+Price1);
		out.println("Stock"+Stock1);
		out.println("Category"+Category1);
		out.println("Supplier"+Supplier1);
		out.println("User Name"+UserName1);
		out.println("Password"+Password);
		
		ProductDetails Product = new ProductDetails(Product_id,Product_Name,Product_Desc,Price1,Stock1,Category1,Supplier1,UserName1,Password);
		
		RegistDao registdao = new RegistDao();
		

		if(registdao.registerCustomer(Product))
		{
			request.setAttribute("username", Product.getUserName());
			request.setAttribute("productname", Product.getProductName());
			RequestDispatcher dispatch=request.getRequestDispatcher("UserHome.jsp");
			dispatch.forward(request, response);
		}
		
		else
			
		{
			request.setAttribute("errorInfo","Error Occured During Registering");
			RequestDispatcher dispatch=request.getRequestDispatcher("ErrorPage.jsp");
			dispatch.forward(request, response);
		}
	
	}
	catch(Exception e)
	{
		e.printStackTrace();
		request.setAttribute("errorInfo","Error Occured During Registering::::"+e.getMessage());
		RequestDispatcher dispatch=request.getRequestDispatcher("ErrorPage.jsp");
		dispatch.forward(request, response);
		
		}
	}

}
