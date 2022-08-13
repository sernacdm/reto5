/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.casacampestre.view;

import com.mycompany.casacampestre.controller.RequerimientoController;
import com.mycompany.casacampestre.model.vo.AsesorPorCiudadVo;
import com.mycompany.casacampestre.model.vo.CompraPorProveedorVo;
import com.mycompany.casacampestre.model.vo.ProyectoCasaCampestreVo;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pc
 */
public class FrmRequerimientos extends javax.swing.JFrame {

    /**
     * Creates new form FrmRequerimientos
     */
    public FrmRequerimientos() {
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

        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        miTabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn1.setText("Primer Informe");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setText("Segundo Informe");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setText("Tercer Informe");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        miTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(miTabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn1)
                        .addGap(18, 18, 18)
                        .addComponent(btn2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn3)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1)
                    .addComponent(btn2)
                    .addComponent(btn3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        String[] columNombre= {"ID_Lider","Nombre","Primer Apellido","Residencia"};
        RequerimientoController  controlador = new RequerimientoController();
        
        ArrayList<AsesorPorCiudadVo> listaA;
        
        try{
            listaA = controlador.consultarAsesorPorCiudad();
            Object[][] datos = new Object[listaA.size()][4];
            int index = 0;
            
            for(AsesorPorCiudadVo lista:listaA){
                datos[index][0]=lista.getIdLider();
                datos[index][1]=lista.getNombre();
                datos[index][2]=lista.getPrimerApellido();
                datos[index][3]=lista.getCiudadResidencia();
                index++;
            }
            DefaultTableModel model = new DefaultTableModel(datos,columNombre);
            miTabla.setModel(model);
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        String[] columNombre= {"ID_Proyecto","Constructora","Nùmero_Habitaciones"," Ciudad"};
        RequerimientoController  controlador = new RequerimientoController();
        
        ArrayList<ProyectoCasaCampestreVo> listaA;
        
        try{
            listaA = controlador.consultarProyectoCasaCampreste();
            Object[][] datos = new Object[listaA.size()][4];
            int index = 0;
            
            for(ProyectoCasaCampestreVo lista:listaA){
                datos[index][0]=lista.getIdProyecto();
                datos[index][1]=lista.getConstructora();
                datos[index][2]=lista.getNumeroHabitaciones();
                datos[index][3]=lista.getCiudad();
                index++;
            }
            DefaultTableModel model = new DefaultTableModel(datos,columNombre);
            miTabla.setModel(model);
            }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        System.out.println("le distes al boton 3");
        String[] columNombre= {"ID_Compra","Constructora"," Banco_Vinculado"};
        RequerimientoController  controlador = new RequerimientoController();
        
        ArrayList<CompraPorProveedorVo> listaA;
        try{
            listaA = controlador.consultarComprarPorProveedor();
            Object[][] datos = new Object[listaA.size()][3];
            int index = 0;
            
            for(CompraPorProveedorVo lista:listaA){
                datos[index][0]=lista.getIdCompra();
                datos[index][1]=lista.getConstructora();
                datos[index][2]=lista.getBancoVinculado();
                index++;
            }
            DefaultTableModel model = new DefaultTableModel(datos,columNombre);
            miTabla.setModel(model);
            }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btn3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmRequerimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRequerimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRequerimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRequerimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRequerimientos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable miTabla;
    // End of variables declaration//GEN-END:variables
}