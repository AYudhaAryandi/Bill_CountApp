package billcounting.Interface;

//import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    
    private static final String URL = "jdbc:mysql://localhost:3306/bill_counting";
    private static final String USERNAME = "root";
    private static final String PASSWORD = ""; 
    
    
    public static Connection getConnection() throws SQLException {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Koneksi sukses!");
        } catch (SQLException e) {
            System.out.println("Koneksi gagal! Error: " + e.getMessage());
            throw e;
        }
        return conn;
    }
    

    public static void main(String[] args) {
        Connection conn = null;
        try {
            conn = Koneksi.getConnection();
        } catch (SQLException e) {
            e.printStackTrace(); 
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace(); 
            }
        }
        
    }

    void executeUpdate() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void close() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
