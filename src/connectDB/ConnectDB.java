package connectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDB {
	public static Connection con = null;
	private static ConnectDB instance = new ConnectDB();

	public static ConnectDB getInstance() {
		return instance;
	}

	public void connect() throws SQLException {
		String dbURL = "jdbc:sqlserver://localhost:1433;databaseName = QLNT ;user = vnkaiser;password = 123";
		con = DriverManager.getConnection(dbURL);
	}

	public void disConnect() {
		if (con != null)
			try {
				con.close();
				System.out.println("Thành công");
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}

	public static Connection getConnection() {
		return con;
	}
}