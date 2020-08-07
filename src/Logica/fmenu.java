/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Jhosselyn
 */
public class fmenu {
   
    private conexion mysql=new conexion();
    private Connection cn=mysql.conectar();
    private String sSQL="";
    public Integer totalregistros;
    
    
    public DefaultTableModel mostrar(String buscar){
        DefaultTableModel modelo;
        
        String [] titulos = {"id","nombre","descripcion", "precio" };
        
        String [] registros =new String [4];
        totalregistros=0;
        modelo = new DefaultTableModel (null,titulos);
        sSQL="select *from .......... where piso like '%"+buscar + "%' order by .....";
        
        try{
            Statenment st=cn.createStatement();
            ResultSet rs=st.executeQuery(sSQL);
            
            while(rs.next()){
                registro []=rs.getString("....");
                registro []=rs.getString("  ");
                registro []=rs.getString("  ");
                registro []=rs.getString("  ");
                      
                totalregistros=totalregistros+1;
                modelo.addRow(registro);
            }
            return modelo;
            
        } catch (Exception e){
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

                }
    public boolean insertar (vmenu dts){
        sSQL="insert into ...... (nombre,descripcion, precio)"+ "values (3,3,3)";
        try{
            PrepareStatement pst=cn.prepareStatement(sSQL);
            pst.setString(1, dts.getNombre_menu());
            pst.setString(2, dts.getDescripcion_menu());
            pst.setString(3, dts.getPrecio_menu());
            
            int n=pst.executeUpdate();
            
            if(n!=0){
                return true;
            }
            else{
                return false;
            }
            
      
        } catch (Exception e){
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    
     public boolean editar (vmenu dts){
        sSQL="update ...... set nombre=?,descripcion=?, precio=?)"+ "where Id_menu=?";
        
        try{
            PrepareStatement pst=cn.prepareStatement(sSQL);
            pst.setString(1, dts.getNombre_menu());
            pst.setString(2, dts.getDescripcion_menu());
            pst.setString(3, dts.getPrecio_menu());
            pst.setInt(4, dts.getId_menu());
            
            int n=pst.executeUpdate();
            
            if(n!=0){
                return true;
            }
            else{
                return false;
            }
            
        } catch (Exception e){
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
     
     
     }
     
          public boolean eliminar (vmenu dts){
        sSQL="delete from ... where Id_menu=?";
        
        try{
            
            PrepareStatement pst=cn.prepareStatement(sSQL);
           
            pst.setInt(1, dts.getId_menu());
            
            int n=pst.executeUpdate();
            
            if(n!=0){
                return true;
            }
            else{
                return false;
            }
            
        } catch (Exception e){
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
     
     
     }
     
     
    
}
