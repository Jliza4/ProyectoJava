

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Norman
 */
public class Conexion {
  Connection con=null;
  
  public Connection conexion() {
      try {
          Class.forName("com.mysql.jdbc.Driver");
          con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto1reserva","root","12345");
      } catch (ClassNotFoundException | SQLException e){
          System.err.println("Error: " +e);
      }
      return con;
  }
   /* public static void main(String[] args) {
       Conexion cn=new Conexion();
        Statement st;
       ResultSet rs;
        try {
            st=(Statement) cn.con.createStatement();
            rs=st.executeQuery("SELECT * FROM cliente");
            while (rs.next()){
                System.out.println(rs.getString("cedula_cliente")+" "+rs.getString("nombre_cliente")+" "+rs.getString("telefono_cliente")+" "+rs.getString("direccion_cliente"));
               }
            cn.con.close();
        } catch (SQLException e) {
            System.err.println(e);
        }*/
    }


