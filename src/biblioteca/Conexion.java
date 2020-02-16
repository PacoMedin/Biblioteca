/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author paco
 */
public class Conexion {
    //?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
    public static final String URL = "jdbc:mysql://localhost:3306/biblioteca";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "321weisser123pac";
   
    public static Connection getConexion() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Conexion establecida");
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return con;
    }
    
}
