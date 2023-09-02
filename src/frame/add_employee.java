/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frame;

import static class_.File_sub.agregarRegistro;
import javax.swing.JPanel;

/**
 *
 * @author bryan
 */
public class add_employee extends javax.swing.JFrame {

    /**
     * Creates new form add_employee
     */
    public add_employee() {
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

        panel_add_employee = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        apellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        cargo = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        fecha = new javax.swing.JTextField();
        salario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        add = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_add_employee.setBackground(new java.awt.Color(255, 255, 255));
        panel_add_employee.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre");
        panel_add_employee.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));
        panel_add_employee.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 110, -1));

        jLabel2.setText("Apellido");
        panel_add_employee.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));
        panel_add_employee.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 110, -1));

        jLabel3.setText("Cedula");
        panel_add_employee.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));
        panel_add_employee.add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 110, -1));
        panel_add_employee.add(cargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 110, -1));
        panel_add_employee.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 110, -1));
        panel_add_employee.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 110, -1));
        panel_add_employee.add(salario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 110, -1));

        jLabel4.setText("Cargo");
        panel_add_employee.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel5.setText("Telefono");
        panel_add_employee.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel6.setText("Fecha");
        panel_add_employee.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel7.setText("Salario");
        panel_add_employee.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        add.setText("Agregar empleado");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        panel_add_employee.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_add_employee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_add_employee, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        String aux[] = new String[100];
        aux[0] = nombre.getText();
        aux[1] = apellido.getText();
        aux[2] = cedula.getText();
        aux[3] = cargo.getText();
        aux[4] = telefono.getText();
        aux[5] = fecha.getText();
        aux[6] = salario.getText();
        agregarRegistro(aux, "Empleados.txt");
    }//GEN-LAST:event_addActionPerformed

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
            java.util.logging.Logger.getLogger(add_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_employee().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField apellido;
    private javax.swing.JTextField cargo;
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nombre;
    public javax.swing.JPanel panel_add_employee;
    private javax.swing.JTextField salario;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
