/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frame;

import static class_.File_sub.agregarRegistro;
import java.awt.Color;
import java.util.Date;
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
        b_agregar.setEnabled(false);
        mensaje1.setVisible(false);
        mensaje2.setVisible(false);
        color(); 
        mensaje3.setVisible(false);
        mensaje4.setVisible(false);
        mensajet.setVisible(false);
        mensajesal.setVisible(false);
        datosinv.setVisible(false);
        mensajecedula.setVisible(false);
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
        jLabel8 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        mensaje2 = new javax.swing.JLabel();
        apellido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        mensaje3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        mensaje4 = new javax.swing.JLabel();
        cargo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        mensaje1 = new javax.swing.JLabel();
        mensajet = new javax.swing.JLabel();
        salario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        mensajesal = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fecha = new com.toedter.calendar.JDateChooser();
        datosinv = new javax.swing.JLabel();
        mensajecedula = new javax.swing.JLabel();
        b_agregar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_add_employee.setBackground(new java.awt.Color(255, 255, 255));
        panel_add_employee.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Swis721 BlkEx BT", 1, 14)); // NOI18N
        jLabel1.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        jLabel1.setText("Nombre: ");
        panel_add_employee.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, 31));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("_________________________________");
        panel_add_employee.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, 20));

        nombre.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });
        panel_add_employee.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 160, 20));

        mensaje2.setText("¡Ingresar unicamente letras en este campo!");
        panel_add_employee.add(mensaje2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 240, -1));

        apellido.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                apellidoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidoKeyTyped(evt);
            }
        });
        panel_add_employee.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 32, 160, -1));

        jLabel2.setFont(new java.awt.Font("Swis721 BlkEx BT", 1, 14)); // NOI18N
        jLabel2.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        jLabel2.setText("Apellido:");
        panel_add_employee.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 270, 31));

        mensaje3.setText("¡Ingresar unicamente letras en este campo!");
        panel_add_employee.add(mensaje3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 290, 30));

        jLabel3.setFont(new java.awt.Font("Swis721 BlkEx BT", 1, 14)); // NOI18N
        jLabel3.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        jLabel3.setText("Cedula:");
        panel_add_employee.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 90, 31));

        cedula.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cedulaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaKeyTyped(evt);
            }
        });
        panel_add_employee.add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 160, 20));

        mensaje4.setText("¡Ingresar unicamente numeros en este campo!");
        panel_add_employee.add(mensaje4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 260, -1));

        cargo.setBackground(new java.awt.Color(203, 229, 250));
        cargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VENDEDOR", "ASESOR DE VENTAS", "GERENTE DE VENTAS" }));
        cargo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargoActionPerformed(evt);
            }
        });
        cargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cargoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cargoKeyTyped(evt);
            }
        });
        panel_add_employee.add(cargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 200, 30));

        jLabel4.setFont(new java.awt.Font("Swis721 BlkEx BT", 1, 14)); // NOI18N
        jLabel4.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        jLabel4.setText("Cargo:");
        panel_add_employee.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 290, 31));

        jLabel5.setFont(new java.awt.Font("Swis721 BlkEx BT", 1, 14)); // NOI18N
        jLabel5.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        jLabel5.setText("Telefono:");
        panel_add_employee.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 160, 31));

        telefono.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                telefonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonoKeyTyped(evt);
            }
        });
        panel_add_employee.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 160, 20));

        mensaje1.setText("El telefono debe comenzar por 3");
        panel_add_employee.add(mensaje1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 180, -1));

        mensajet.setText("¡Ingresar unicamente numeros en este campo!");
        panel_add_employee.add(mensajet, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 280, -1));

        salario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        salario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salarioActionPerformed(evt);
            }
        });
        salario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                salarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                salarioKeyTyped(evt);
            }
        });
        panel_add_employee.add(salario, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 160, 20));

        jLabel7.setFont(new java.awt.Font("Swis721 BlkEx BT", 1, 14)); // NOI18N
        jLabel7.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        jLabel7.setText("Salario:");
        panel_add_employee.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 290, 31));

        mensajesal.setText("¡Ingresar unicamente numeros en este campo!");
        panel_add_employee.add(mensajesal, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 280, -1));

        jLabel6.setFont(new java.awt.Font("Swis721 BlkEx BT", 1, 14)); // NOI18N
        jLabel6.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        jLabel6.setText("Fecha de ingreso:");
        panel_add_employee.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 200, 31));
        panel_add_employee.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 160, 30));

        datosinv.setText("¡DATOS INVALIDOS!");
        panel_add_employee.add(datosinv, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, -1, 20));

        mensajecedula.setText("!YA EXISTE EL EMPLEADO!");
        panel_add_employee.add(mensajecedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, -1, -1));

        b_agregar.setText("Agregar empleado");
        b_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_agregarActionPerformed(evt);
            }
        });
        panel_add_employee.add(b_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 160, 31));

        jLabel9.setText("_________________________________");
        panel_add_employee.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel10.setText("_________________________________");
        panel_add_employee.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jLabel11.setText("_________________________________");
        panel_add_employee.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 260, 20));

        jLabel12.setText("_________________________________");
        jLabel12.setToolTipText("");
        panel_add_employee.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 270, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_add_employee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_add_employee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void botonagregar() {
        if (!nombre.getText().isEmpty() && !apellido.getText().isEmpty() && !cedula.getText().isEmpty() && !telefono.getText().isEmpty() && !salario.getText().isEmpty()) {
            b_agregar.setEnabled(true);
        } else {
            b_agregar.setEnabled(false);
        }
    }
    void color() {
        jLabel1.setForeground(new Color(11,61,138));
        jLabel2.setForeground(new Color(11,61,138));
        jLabel3.setForeground(new Color(11,61,138));
        jLabel4.setForeground(new Color(11,61,138));
        jLabel5.setForeground(new Color(11,61,138));
        jLabel6.setForeground(new Color(11,61,138));
        jLabel7.setForeground(new Color(11,61,138));
    }
    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void nombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyReleased
        botonagregar();
    }//GEN-LAST:event_nombreKeyReleased

    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped
        int key = evt.getKeyChar();
        boolean minusculas = key >= 97 && key <= 122;
        boolean mayusculas = key >= 65 && key <= 90;
        if (!(minusculas || mayusculas)) {
            mensaje2.setVisible(true);
            evt.consume();
        } else {
            mensaje2.setVisible(false);
        }
    }//GEN-LAST:event_nombreKeyTyped

    private void apellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidoKeyReleased
        botonagregar();
    }//GEN-LAST:event_apellidoKeyReleased

    private void apellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidoKeyTyped
        int key = evt.getKeyChar();
        boolean minusculas = key >= 97 && key <= 122;
        boolean mayusculas = key >= 65 && key <= 90;
        if (!(minusculas || mayusculas)) {
            mensaje3.setVisible(true);
            evt.consume();
        } else {
            mensaje3.setVisible(false);
        }
    }//GEN-LAST:event_apellidoKeyTyped

    private void cedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaKeyReleased
        botonagregar();
    }//GEN-LAST:event_cedulaKeyReleased

    private void cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!(numeros)) {
            mensaje4.setVisible(true);
            evt.consume();
        } else {
            mensaje4.setVisible(false);
        }
        String textoActual = cedula.getText();
        if (textoActual.length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_cedulaKeyTyped

    private void cargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cargoActionPerformed

    private void cargoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cargoKeyReleased
        botonagregar();
    }//GEN-LAST:event_cargoKeyReleased

    private void cargoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cargoKeyTyped

    }//GEN-LAST:event_cargoKeyTyped

    private void telefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoKeyReleased
        botonagregar();
    }//GEN-LAST:event_telefonoKeyReleased

    private void telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        String textoActual = telefono.getText();
        if (textoActual.length() == 0 && key != '3') {
            mensaje1.setVisible(true);
            evt.consume();
        } else {
            mensaje1.setVisible(false);
            if (!(numeros)) {
                mensajet.setVisible(true);
                evt.consume();
            } else {
                mensajet.setVisible(false);
            }
        }
        if (textoActual.length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_telefonoKeyTyped

    private void salarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salarioActionPerformed

    }//GEN-LAST:event_salarioActionPerformed

    private void salarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_salarioKeyReleased
        botonagregar();
    }//GEN-LAST:event_salarioKeyReleased

    private void salarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_salarioKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!(numeros)) {
            mensajesal.setVisible(true);
            evt.consume();
        } else {
            mensajesal.setVisible(false);
        }
        String textoact = salario.getText();
        if (textoact.length() >= 9) {
            evt.consume();
        }
    }//GEN-LAST:event_salarioKeyTyped

    private void b_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_agregarActionPerformed
        //campos
        String aux[] = new String[100];
        aux[0] = nombre.getText().toUpperCase();
        aux[1] = apellido.getText().toUpperCase();
        aux[2] = cedula.getText();
        aux[3] = cargo.getSelectedItem().toString();
        aux[4] = telefono.getText();
        Date pr = fecha.getDate();
        aux[6] = salario.getText();
        System.out.println(cedula.getText().length());
        System.out.println(telefono.getText().length());
        System.out.println(salario.getText().length());
        System.out.println(pr);
        if (pr == null || cedula.getText().length() != 10 || telefono.getText().length() != 10 || salario.getText().length() < 7) {
            datosinv.setVisible(true);

        } else {
            datosinv.setVisible(false);
            mensaje1.setVisible(false);
            mensaje2.setVisible(false);
            mensaje3.setVisible(false);
            mensaje4.setVisible(false);
            mensajet.setVisible(false);
            mensajesal.setVisible(false);
            cedula.setText(null);
            apellido.setText(null);
            cedula.setText(null);
            telefono.setText(null);
            salario.setText(null);
            nombre.setText(null);
            fecha.setDate(null);
            aux[5] = String.valueOf(pr);
            String[] campos_fecha = aux[5].split(" ");
            aux[5] = campos_fecha[2] + "-" + campos_fecha[1].toUpperCase() + "-" + campos_fecha[5];
            agregarRegistro(aux, "Empleados.txt", mensajecedula);

        }
    }//GEN-LAST:event_b_agregarActionPerformed

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
    private javax.swing.JTextField apellido;
    private javax.swing.JButton b_agregar;
    private javax.swing.JComboBox<String> cargo;
    private javax.swing.JTextField cedula;
    private javax.swing.JLabel datosinv;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel mensaje1;
    private javax.swing.JLabel mensaje2;
    private javax.swing.JLabel mensaje3;
    private javax.swing.JLabel mensaje4;
    private javax.swing.JLabel mensajecedula;
    private javax.swing.JLabel mensajesal;
    private javax.swing.JLabel mensajet;
    private javax.swing.JTextField nombre;
    public javax.swing.JPanel panel_add_employee;
    private javax.swing.JTextField salario;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
