package Day9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbc {
public static void main(String[] args) throws  SQLException, ClassNotFoundException { 
	Class.forName("com.mysql.cj.jdbc.driver");  
	Connection con=DriverManager.getConnection(  
	"jdbc:mysql://localhost:3307:dac_dbt","root","root123"); 
	System.out.println("shfdofoi nfd");
	
	
}
}
