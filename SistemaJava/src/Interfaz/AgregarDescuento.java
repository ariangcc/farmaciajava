/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import javax.swing.JOptionPane;


/**
 *
 * @author alulab14
 */
public class AgregarDescuento extends javax.swing.JFrame {

    /**
     * Creates new form EliminarCliente
     */
    public AgregarDescuento() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botonRegresar = new javax.swing.JButton();
        campoCodigo = new javax.swing.JTextField();
        campoPuntos = new javax.swing.JTextField();
        campoDistrito1 = new javax.swing.JTextField();
        campoProducto = new javax.swing.JTextField();
        botonModificar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        tabAgregar = new javax.swing.JMenu();
        tabBuscar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titulo.setText("Agregar Descuento");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Complete los campos del descuento a agregar:");

        botonRegresar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonRegresar.setText("< Regresar");
        botonRegresar.setContentAreaFilled(false);
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });

        campoCodigo.setText("Código");
        campoCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCodigoActionPerformed(evt);
            }
        });

        campoPuntos.setText("Puntos");
        campoPuntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPuntosActionPerformed(evt);
            }
        });

        campoDistrito1.setText("Descripción");
        campoDistrito1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDistrito1ActionPerformed(evt);
            }
        });

        campoProducto.setText("Cod. Producto");
        campoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoProductoActionPerformed(evt);
            }
        });

        botonModificar.setText("Agregar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        tabAgregar.setText("Agregar");
        tabAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabAgregarMouseClicked(evt);
            }
        });
        jMenuBar1.add(tabAgregar);

        tabBuscar.setText("Modificar/Eliminar");
        tabBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabBuscarMouseClicked(evt);
            }
        });
        jMenuBar1.add(tabBuscar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campoDistrito1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(titulo)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(campoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(campoPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(campoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(23, 23, 23)
                                    .addComponent(botonModificar))
                                .addComponent(botonRegresar)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(campoDistrito1, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonRegresar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        this.dispose();
        PantallaAdmin atras = new PantallaAdmin();
        atras.setVisible(true);
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void tabBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabBuscarMouseClicked
        this.dispose();
        GestionarDescuentos pantallaGestionar = new GestionarDescuentos();
        pantallaGestionar.setVisible(true);
    }//GEN-LAST:event_tabBuscarMouseClicked

    private void tabAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabAgregarMouseClicked
 
    }//GEN-LAST:event_tabAgregarMouseClicked

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        if (!campoCodigo.getText().equals("") && !campoPuntos.getText().equals("") && !campoProducto.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Se agregó correctamente el descuento.", "Operación Exitosa", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los datos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonModificarActionPerformed

    private void campoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoProductoActionPerformed

    private void campoPuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPuntosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPuntosActionPerformed

    private void campoDistrito1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDistrito1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDistrito1ActionPerformed

    private void campoCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCodigoActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarDescuento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarDescuento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarDescuento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarDescuento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarDescuento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JTextField campoCodigo;
    private javax.swing.JTextField campoDistrito1;
    private javax.swing.JTextField campoProducto;
    private javax.swing.JTextField campoPuntos;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu tabAgregar;
    private javax.swing.JMenu tabBuscar;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
