package jdbcProc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCProcedureCall {

//	public static void main(String[] args) 
//	{
//		String url = "jdbc:postgresql://localhost:5432/postgres?user=postgres&password=root";
//		String sql = "call studentrecords (?,?,?,?,?,?,?)";
//		try {
//			Class.forName("org.postgresql.Driver");
//			
//			Connection conn = DriverManager.getConnection(url);
//			
//			CallableStatement cs = conn.prepareCall(sql);
//			
//			cs.setInt(1,1);
//			cs.setString(2,"Omkar");
//			cs.setString(3,"Male");
//			cs.setInt(4,23);
//			cs.setString(5,"omkarbalwade@gmail.com");
//			cs.setString(6,"+91-7057032909");
//			cs.setString(7,"B+");
//			
//			cs.execute();
//			
//			cs.close();
//			
//			System.out.println("Sucess");
//			
//			
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//
//	}

}
