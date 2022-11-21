package Day10;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

	public class Jdbcpreparedex
	{

		 
		
		public static void main(String[] args) throws ClassNotFoundException, SQLException 
		{
		
			PreparedStatement pmt=null;
			
			Connection con =JdbcManagement.createConnection();
			JdbcManagement.Select(con,pmt);
			JdbcManagement.delete(con,pmt);
			JdbcManagement.update(con,pmt);
			
			
			
			
			
			
			
			
			
			
		}
		
	}


