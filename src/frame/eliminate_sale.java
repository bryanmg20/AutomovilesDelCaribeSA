/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frame;

import static class_.File_sub.eliminarRegistro;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author bryan
 */
public class eliminate_sale extends javax.swing.JFrame {

    /**
     * Creates new form eliminate_sale
     */
    public eliminate_sale() {
        initComponents();
        color();
        eliminar_ventas.setEnabled(false); 
        codin.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_eliminate_sale = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        eliminar_ventas = new javax.swing.JButton();
        eliminar_v = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        codin = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_eliminate_sale.setBackground(new java.awt.Color(255, 255, 255));
        panel_eliminate_sale.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Swis721 BlkEx BT", 1, 18)); // NOI18N
        jLabel1.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        jLabel1.setText("Codigo del vehiculo: ");
        panel_eliminate_sale.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        eliminar_ventas.setText("Eliminar Venta");
        eliminar_ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_ventasActionPerformed(evt);
            }
        });
        panel_eliminate_sale.add(eliminar_ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, -1, -1));

        eliminar_v.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        eliminar_v.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                eliminar_vKeyTyped(evt);
            }
        });
        panel_eliminate_sale.add(eliminar_v, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 250, -1));

        jLabel2.setText("____________________________________________");
        panel_eliminate_sale.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        codin.setText("¡CÓDIGO NO EXISTENTE!");
        panel_eliminate_sale.add(codin, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, -1, -1));

        jLabel3.setText("¡Código unicamente contiene 6 digitos!");
        panel_eliminate_sale.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_eliminate_sale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_eliminate_sale, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //La funcion color se encarga de cambiar el color del texto del jLabel
    void color() {
        jLabel1.setForeground(new Color(11, 61, 138));
    }
    //Se encarga de eliminar un registro en funcion de del codigo del vehiculo ingresada por el usuario
    private void eliminar_ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_ventasActionPerformed
        //Se obtiene el texto ingresado por el usuario y se almacena en la variable palabra
        String palabra = eliminar_v.getText();
        //se llama a la funcion eliminarRegistro y se elimina el registro de ventas
        eliminarRegistro(palabra, "Ventas.txt", codin);
        eliminar_v.setText(null);//Se borra el contenido del campo de texto para limpiarlo y permitir al usuario ingresar un nuevo codigo
    }//GEN-LAST:event_eliminar_ventasActionPerformed

    private void eliminar_vKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eliminar_vKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57; //Se verifica si lo ingresado son numeros
        if (!(numeros)) {
            evt.consume();
        }
        String textoActual = eliminar_v.getText();
        if (textoActual.length() == 5) {
            eliminar_ventas.setEnabled(true);
        } else if (textoActual.length() > 5) {
            evt.consume();
        } else {
            eliminar_ventas.setEnabled(false);
        }
    }//GEN-LAST:event_eliminar_vKeyTyped

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
            java.util.logging.Logger.getLogger(eliminate_sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(eliminate_sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(eliminate_sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(eliminate_sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new eliminate_sale().setVisible(true);
            }
        });
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel codin;
    private javax.swing.JTextField eliminar_v;
    private javax.swing.JButton eliminar_ventas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JPanel panel_eliminate_sale;
    // End of variables declaration//GEN-END:variables
}
