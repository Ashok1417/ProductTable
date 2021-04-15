package Utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConn {
	
	static Connection conn;
	public static Connection getMySqlConnection()throws Exception
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/account","root","Ashok@1417");
		return conn;
		
	}

}
