/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jhosselyn
 */
public class conexion {
    public String db="reserva";
    public String url="jdbc:mysql://127.0.0.1/" + db;
    public String user="root";
    public String pass="";

    public conexion() {
    }
    public Connection connectar(){
        Connection link=null;
        try{
            Class.forName("org.gjt.mm.mysql.Driver");
            link=DriverManager.getConnection(this.url, this.user, this.pass);
        }catch(ClassNotFoundException | SQLException e){
            
        }
        return link;
        
    }
}
