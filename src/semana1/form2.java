/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana1;

import javax.swing.JOptionPane;

/**
 *
 * @author jeffo
 */
public class form2 extends javax.swing.JFrame {

    /**
     * Creates new form form2
     */
    public form2() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblTitulo = new javax.swing.JLabel();
        rbFacebook = new javax.swing.JRadioButton();
        rbTwiter = new javax.swing.JRadioButton();
        rbYoutube = new javax.swing.JRadioButton();
        btnmostrar = new javax.swing.JButton();
        chopcion1 = new javax.swing.JCheckBox();
        chopcion2 = new javax.swing.JCheckBox();
        chopcion3 = new javax.swing.JCheckBox();
        btmostrarch = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setText("Controles de Interfaz");

        buttonGroup1.add(rbFacebook);
        rbFacebook.setText("Facebook");
        rbFacebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFacebookActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbTwiter);
        rbTwiter.setText("Twitter");

        buttonGroup1.add(rbYoutube);
        rbYoutube.setText("Youtube");

        btnmostrar.setText("Mostrar RadioButon");
        btnmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrarActionPerformed(evt);
            }
        });

        chopcion1.setText("Facebook");
        chopcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chopcion1ActionPerformed(evt);
            }
        });

        chopcion2.setText("Twitter");

        chopcion3.setSelected(true);
        chopcion3.setText("Youtube");

        btmostrarch.setText("Mostrarch");
        btmostrarch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmostrarchActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Amarillo", "Azul", "Rojo" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbFacebook)
                            .addComponent(rbYoutube)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbTwiter)
                                    .addComponent(btmostrarch))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnmostrar)
                                    .addComponent(chopcion2)
                                    .addComponent(chopcion3)
                                    .addComponent(chopcion1)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(57, 57, 57)
                .addComponent(rbFacebook)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbTwiter)
                    .addComponent(btnmostrar)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbYoutube)
                .addGap(28, 28, 28)
                .addComponent(chopcion1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chopcion2)
                    .addComponent(btmostrarch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chopcion3)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbFacebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFacebookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbFacebookActionPerformed

    private void btnmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrarActionPerformed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_btnmostrarActionPerformed

    private void chopcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chopcion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chopcion1ActionPerformed

    private void btmostrarchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmostrarchActionPerformed
        // TODO add your handling code here:
        if(chopcion3.isSelected()){
            JOptionPane.showMessageDialog(null, "Sellección"+chopcion3.getText());
        }
        
    }//GEN-LAST:event_btmostrarchActionPerformed

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
            java.util.logging.Logger.getLogger(form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmostrarch;
    private javax.swing.JButton btnmostrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chopcion1;
    private javax.swing.JCheckBox chopcion2;
    private javax.swing.JCheckBox chopcion3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rbFacebook;
    private javax.swing.JRadioButton rbTwiter;
    private javax.swing.JRadioButton rbYoutube;
    // End of variables declaration//GEN-END:variables
}
