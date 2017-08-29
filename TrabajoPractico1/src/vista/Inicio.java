/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import interfaces.IInicio;
import java.util.ArrayList;
import modelo.Ciudad;
import presetador.PresentadorInicio;

/**
 *
 * @author Carlos
 */
public class Inicio extends javax.swing.JFrame implements IInicio{

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        this.setControlador(new PresentadorInicio(this));
         
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu1 = new javax.swing.JMenu();
        itemNuevoPaquete = new javax.swing.JMenuItem();
        itemListarPaquete = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itemNuevoSalida = new javax.swing.JMenuItem();
        itemListarSalida = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menu1.setText("Paquetes");

        itemNuevoPaquete.setText("Nuevo");
        itemNuevoPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNuevoPaqueteActionPerformed(evt);
            }
        });
        menu1.add(itemNuevoPaquete);

        itemListarPaquete.setText("Listar");
        menu1.add(itemListarPaquete);

        jMenuBar1.add(menu1);

        jMenu2.setText("Salidas");

        itemNuevoSalida.setText("Nuevo");
        itemNuevoSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNuevoSalidaActionPerformed(evt);
            }
        });
        jMenu2.add(itemNuevoSalida);

        itemListarSalida.setText("Listar");
        itemListarSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemListarSalidaActionPerformed(evt);
            }
        });
        jMenu2.add(itemListarSalida);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 283, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemNuevoSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNuevoSalidaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_itemNuevoSalidaActionPerformed

    private void itemNuevoPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNuevoPaqueteActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_itemNuevoPaqueteActionPerformed

    private void itemListarSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemListarSalidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemListarSalidaActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemListarPaquete;
    private javax.swing.JMenuItem itemListarSalida;
    private javax.swing.JMenuItem itemNuevoPaquete;
    private javax.swing.JMenuItem itemNuevoSalida;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JMenu menu1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void MostrarCrearPaquete(ArrayList<Ciudad> ciudades) {
       AgregarPaquete vista = new AgregarPaquete(this,true);

    }

    @Override
    public void MostrarListarPaquete() {
         ListarPaquetes vista= new ListarPaquetes(this, true);
    }

    @Override
    public void MostrarCrearSalida() {
       AgregarSalidas vista= new AgregarSalidas(this, true);
    }    

    @Override
    public void MostrarListarSalida() {
        ListarSalidas vista= new ListarSalidas(this, true);
    }

 
    private void setControlador(PresentadorInicio c) {
        itemListarPaquete.addActionListener(c);
        itemListarPaquete.setActionCommand("LISTAR PAQUETE");
        itemNuevoPaquete.addActionListener(c);
        itemNuevoPaquete.setActionCommand("NUEVO PAQUETE");
        itemListarSalida.addActionListener(c);
        itemListarSalida.setActionCommand("LISTAR SALIDA");
        itemNuevoSalida.addActionListener(c);
        itemNuevoSalida.setActionCommand("NUEVO SALIDA");
        configurar();
    }
    
    private void configurar()
    {
        setLocationRelativeTo(this);
        setVisible(true);
    }
    
}
