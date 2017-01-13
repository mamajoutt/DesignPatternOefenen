package observerpattern;
import java.sql.*;
import java.util.Observable;
import java.util.Observer;

public class JDBConnection extends Observable{

	static Connection conn = null;
	private String SQL;

	public static Connection getJDBConnection() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		    String url = "jdbc:mysql://127.0.0.1/TI";
		    conn = DriverManager.getConnection (url, "root", "");
		}
		catch (Exception e) {
			System.out.println("Error: " + e);
		}

		return conn;
	}

	public ResultSet executeSelect(String SQL) {

		this.SQL = SQL;
		ResultSet rs = null;
		try {

		}
		catch(Exception ex) {
			System.out.println("Error: " + ex);
		}

		return rs;
	}

	public void executeUpdate(String SQL) {

		this.SQL = SQL;
		try {
                    
                    
                setChanged();
                notifyObservers();

		}
		catch(Exception ex) {}
	}

	public String getSQL() {
		return SQL;
	}

	public void close() {

		if (conn != null) {
			try {
				conn.close();
		     }
		     catch (SQLException ex) {
		    	 System.out.println("Error: " + ex);
		     }
		}
	}
}
