
package tagihan.page;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;


public class config {
    public static Connection mysqlconfig;
    public static Connection configDB()throws SQLException{
        try{
            String url = "jdbc:mysql://localhost:3307/simko";//url database
            String user = "root";//user database
            String pass = "";//password database
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, user, pass);
        } catch (Exception e){
            System.err.println("Koneksi Gagal "+e.getMessage());
            //perintah meanmpilkan error pada koneksi
        }
        return mysqlconfig;
    }

    static Object GetConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}