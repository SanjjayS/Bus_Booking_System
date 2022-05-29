package dbms;

import java.sql.*;
public class table {
	table()
	{
		
		try
		{
			Connection connection;
			Statement statement;
			connection= DriverManager.getConnection("jdbc:derby:dbm;create=true"); 
			System.out.println("Connection done Successfully");
			
			//String sql = "SELECT * FROM KPF7" ;
			statement = connection.createStatement();
			String s ="create table student_details(Sname varchar(20),email varchar(20),phnno int,gender varchar(7),seattype varchar(20),psno int,destaddr varchar(20))";
			System.out.println(s);
			statement.executeUpdate(s);
			
			
            System.out.println("HIT");
			statement.close();
			connection.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args)
	{
		new table();
	}
}
