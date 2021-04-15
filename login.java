package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.ProductDetails;
import dao.RegistDao;


@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		try
		{
			String UserName1=request.getParameter("UserName");
			String Password=request.getParameter("Passwrd");
			
			ProductDetails product = new ProductDetails();
			product.setUserName(UserName1);
			product.setPasswrd(Password);
			
			RegistDao register = new RegistDao();
			
			ProductDetails Product = register.checkCredential(product);
			
			if(Product != null)
			{
				request.setAttribute("username", Product.getUserName());
				request.setAttribute("productname", Product.getProductName());
				RequestDispatcher dispatch=request.getRequestDispatcher("UserHome.jsp");
				dispatch.forward(request, response);
			}
			else
			{
				request.setAttribute("errorInfo","Error Occured During Logging");
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
