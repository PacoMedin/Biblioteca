/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;


import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author paco
 */
public class controlBiblioteca {
    
    
    public DefaultTableModel repG(Usuario a[]){
        DefaultTableModel dtm = new DefaultTableModel();
        Object obj[]=new  Object[5];
        
        dtm.addColumn("Id usuario");
        dtm.addColumn("Nombre");
        dtm.addColumn("Dirección");
        dtm.addColumn("Telefono");
        dtm.addColumn("Edad");
        for(int i=0;i<a.length;i++){
            
            obj[1]=a[i].getNombre();
            obj[2]=a[i].getDireccion();
            obj[3]=a[i].getTelefono();
            obj[4]=a[i].getEdad();
            dtm.addRow(obj);
        }
        return dtm;
    }
   
}
