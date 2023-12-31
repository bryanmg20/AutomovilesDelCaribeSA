/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frame;

import static class_.File_sub.eliminarRegistro;
import class_.button_eliminate_employee;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;

/**
 *
 * @author bryan
 */
public class eliminate_employee extends javax.swing.JFrame {

    public button_eliminate_employee controller;

    public eliminate_employee() {
        initComponents();
        controller = new button_eliminate_employee(this);
        color();
        b_eliminar.setEnabled(false);
        num.setVisible(false);
        mensajeemp.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_eliminate_employee = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        eliminar = new javax.swing.JTextField();
        mensajeemp = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        num = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        b_eliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_eliminate_employee.setBackground(new java.awt.Color(255, 255, 255));
        panel_eliminate_employee.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Swis721 BlkEx BT", 1, 18)); // NOI18N
        jLabel1.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        jLabel1.setText("Cedula Empleado:");
        panel_eliminate_employee.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        eliminar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        eliminar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                eliminarKeyTyped(evt);
            }
        });
        panel_eliminate_employee.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 210, 30));

        mensajeemp.setText("¡Ingrese un empleado existente!");
        panel_eliminate_employee.add(mensajeemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jLabel3.setText("___________________________________________");
        panel_eliminate_employee.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        num.setText("¡Ingresar unicamente numeros en este campo!");
        panel_eliminate_employee.add(num, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        panel.setBackground(new java.awt.Color(23, 93, 163));
        panel.setLayout(new java.awt.BorderLayout());

        b_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        b_eliminar.setText("Eliminar Empleado");
        b_eliminar.setBorderPainted(false);
        b_eliminar.setContentAreaFilled(false);
        b_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_eliminarActionPerformed(evt);
            }
        });
        panel.add(b_eliminar, java.awt.BorderLayout.PAGE_START);

        panel_eliminate_employee.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 140, 28));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cpu (1).png"))); // NOI18N
        panel_eliminate_employee.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, -1));

        jLabel4.setText("¡Cedula debe contener 10 digitos!");
        panel_eliminate_employee.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_eliminate_employee, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_eliminate_employee, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //La funcion color se encarga de cambiar el color del texto del jLabel
    void color() {
        jLabel1.setForeground(new Color(11, 61, 138));
    }
    
    //La subrutina fuete modifica la fuente del jLabel
    void fuente() {
        jLabel1.setFont(new Font("verdana", Font.BOLD, 18));
    }

    //Se encarga de eliminar un registro en funcion de la cedula ingresada por el usuario
    private void b_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_eliminarActionPerformed
        //Se obtiene el texto ingresado por el usuario y se almacena en la variable cedula
        String cedula = eliminar.getText();
        //se llama a la funcion eliminarRegistro y se elimina el registro del archivo empleadostxt
        eliminarRegistro(cedula, "Empleados.txt", mensajeemp);
        eliminar.setText(null); //Se borra el contenido del campo de texto para limpiarlo y permitir al usuario ingresar una nueva cedula
        num.setVisible(false);
    }//GEN-LAST:event_b_eliminarActionPerformed

    private void eliminarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eliminarKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57; //Se verifica si lo ingresado son numeros
        boolean carac = Character.isISOControl(key); //Se verifica si lo ingresado es una tecla de control
        if (!(numeros || carac)) {
            num.setVisible(true);
            evt.consume();
        } else {
            num.setVisible(false);
        }
        String textoActual = eliminar.getText();
        if (textoActual.length() == 9) {
            b_eliminar.setEnabled(true);
        } else if (textoActual.length() >= 10) {
            evt.consume();
        } else {
            b_eliminar.setEnabled(false);
        }
    }//GEN-LAST:event_eliminarKeyTyped

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
            java.util.logging.Logger.getLogger(eliminate_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(eliminate_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(eliminate_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(eliminate_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new eliminate_employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton b_eliminar;
    private javax.swing.JTextField eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel mensajeemp;
    private javax.swing.JLabel num;
    public javax.swing.JPanel panel;
    public javax.swing.JPanel panel_eliminate_employee;
    // End of variables declaration//GEN-END:variables
}
