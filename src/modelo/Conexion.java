
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    
    Connection con;
    String url = "jdbc:mysql://localhost:3306/bd_ventas2";
    String user="root";
    String pass = "1002778599";
    public Connection Conectar()
    {
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            con = DriverManager.getConnection(url,user,pass);
        }catch(Exception e){
            
            
            
        }
        
        return con;
    }
    
}
