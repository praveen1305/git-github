import java.sql.*;

/*
 * import 
 * load & register the Drivers
 * create a connection object
 * create a statement
 * execute the query
 * process the result  
 * close the connection
 */
public class SampleJDBC{
	
	public static void main (String[] args) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/world";
		String uName = "root";
		String pass = "praveen";
		String query = "select studentname from student where studentid = 1";
		
		//Class.forName("com.mysql.cj.jdbc.Driver");// to load the mysql driver
		Connection con = DriverManager.getConnection(url, uName, pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String name = rs.getString("studentname");
		
		System.out.print(name);
		
		
	}
}
