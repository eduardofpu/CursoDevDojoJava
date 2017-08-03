package JDBC.COM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {
	//java.sql , connection , statement , ResultSet

	public Connection getConexao(){
		String url="jdbc:mysql://localhost:3306/agencia?useSSL=false";
		String user="root";
		String password="1234";

		try {
			Connection connection = DriverManager.getConnection(url,user,password);

			System.out.println(connection);
			return connection;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



		return null;

	}

}
