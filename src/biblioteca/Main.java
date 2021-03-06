/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.LinkedList;
import javax.swing.UIManager;


/**
 *
 * @author paco
 */
public class Main extends javax.swing.JFrame {

    LinkedList <Usuario> lu;
    public Main() {
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Altas = new javax.swing.JMenu();
        BajaU = new javax.swing.JMenu();
        Cambios = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        BajaL = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        Prestamo = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu14 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu15 = new javax.swing.JMenu();
        repLibro = new javax.swing.JMenu();
        infP = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.png"))); // NOI18N

        Escritorio.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1234, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
        );

        jMenu1.setText("Gestión Usuarios");

        Altas.setText("Altas ");
        Altas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AltasMouseClicked(evt);
            }
        });
        jMenu1.add(Altas);

        BajaU.setText("Bajas");
        BajaU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BajaUMouseClicked(evt);
            }
        });
        jMenu1.add(BajaU);

        Cambios.setText("Cambios");
        Cambios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CambiosMouseClicked(evt);
            }
        });
        jMenu1.add(Cambios);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Registro Libros");

        jMenu10.setText("Altas");
        jMenu10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu10MouseClicked(evt);
            }
        });
        jMenu2.add(jMenu10);

        BajaL.setText("Bajas");
        BajaL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BajaLMouseClicked(evt);
            }
        });
        jMenu2.add(BajaL);

        jMenu12.setText("Cambios");
        jMenu12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu12MouseClicked(evt);
            }
        });
        jMenu2.add(jMenu12);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Registro Prestamos");

        Prestamo.setText("Prestamo");
        Prestamo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrestamoMouseClicked(evt);
            }
        });
        jMenu3.add(Prestamo);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Devoluciones");

        jMenu14.setText("Devolución");
        jMenu14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu14MouseClicked(evt);
            }
        });
        jMenu4.add(jMenu14);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Consultar Informacion");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });

        jMenu15.setText("Usuarios");
        jMenu15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu15MouseClicked(evt);
            }
        });
        jMenu5.add(jMenu15);

        repLibro.setText("Libros");
        repLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                repLibroMouseClicked(evt);
            }
        });
        jMenu5.add(repLibro);

        infP.setText("Prestamos");
        infP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infPMouseClicked(evt);
            }
        });
        jMenu5.add(infP);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenu15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu15MouseClicked
       Reporte_Usuario rg=new Reporte_Usuario(lu);
        this.Escritorio.add(rg);
        rg.setVisible(true);
        rg.show();
    }//GEN-LAST:event_jMenu15MouseClicked

    private void AltasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AltasMouseClicked
       AltasU au=new AltasU(lu);
       this.Escritorio.add(au);
       au.setVisible(true);
       au.show();
    }//GEN-LAST:event_AltasMouseClicked

    private void jMenu10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu10MouseClicked
        AltasL al= new AltasL();
        this.Escritorio.add(al);
        al.setVisible(true);
        al.show();
    }//GEN-LAST:event_jMenu10MouseClicked

    private void repLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_repLibroMouseClicked
        Reporte_Libro rl=new Reporte_Libro();
        this.Escritorio.add(rl);
        rl.setVisible(true);
        rl.show();
    }//GEN-LAST:event_repLibroMouseClicked

    private void BajaUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BajaUMouseClicked
     Reporte_Usuario rg=new Reporte_Usuario(lu);
        this.Escritorio.add(rg);
        rg.setVisible(true);
        rg.show();
    }//GEN-LAST:event_BajaUMouseClicked

    private void BajaLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BajaLMouseClicked
       Reporte_Libro rl=new Reporte_Libro();
        this.Escritorio.add(rl);
        rl.setVisible(true);
        rl.show();
    }//GEN-LAST:event_BajaLMouseClicked

    private void CambiosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CambiosMouseClicked
        CambiosU cu=new CambiosU();
        this.Escritorio.add(cu);
        cu.setVisible(true);
        cu.show();
    }//GEN-LAST:event_CambiosMouseClicked

    private void jMenu12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu12MouseClicked
         CambiosL cu=new CambiosL();
        this.Escritorio.add(cu);
        cu.setVisible(true);
        cu.show();
    }//GEN-LAST:event_jMenu12MouseClicked

    private void PrestamoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrestamoMouseClicked
        Prestamo pr=new Prestamo();
        this.Escritorio.add(pr);
        pr.setVisible(true);
        pr.show(    );
    }//GEN-LAST:event_PrestamoMouseClicked

    private void jMenu14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu14MouseClicked
       Devolucion dv=new Devolucion();
       this.Escritorio.add(dv);
       dv.setVisible(true);
       dv.show();
       
    }//GEN-LAST:event_jMenu14MouseClicked

    private void infPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infPMouseClicked
          Reporte_Prestamo rp=new Reporte_Prestamo();
        this.Escritorio.add(rp);
        rp.setVisible(true);
        rp.show();
    }//GEN-LAST:event_infPMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Altas;
    private javax.swing.JMenu BajaL;
    private javax.swing.JMenu BajaU;
    private javax.swing.JMenu Cambios;
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenu Prestamo;
    private javax.swing.JMenu infP;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu repLibro;
    // End of variables declaration//GEN-END:variables
}
