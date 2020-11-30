package GestorTienda;

import java.sql.*;

public class DataBase {
    
    private static final String USERNAME = "rootx";
    private static final String PASSWORD = "rootx";
    private static final String CONN_STRING = "jdbc:mysql://localhost:3306/gestor_tienda?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    
    public void conexion() {
       Connection conn = null;

       String email = "a";
       String myPass = "b";
       
        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            System.out.println("Connected!");
            Statement stmt = (Statement) conn.createStatement();
            String insert = "INSERT INTO 'gestor_tienda'.'users'('correo','password') VALUES ('"+email+"','"+myPass+"')";
            stmt.executeUpdate(insert);
        } catch (SQLException e){
            System.err.println(e);
        }
    }
}
