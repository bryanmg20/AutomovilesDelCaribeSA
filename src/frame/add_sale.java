/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frame;

import static class_.File_sub.agregarRegistro;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JPanel;

/**
 *
 * @author bryan
 */
public class add_sale extends javax.swing.JFrame {

    /**
     * Creates new form add_sale
     */
    public add_sale() {
        initComponents();
        mensajenom.setVisible(false); 
        color();
        mensajecos.setVisible(false);
        mensajeap.setVisible(false);
        mensajenum.setVisible(false);
        mensajecodigo.setVisible(false);
        empleadoex.setVisible(false);
        agregar_ventas.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_add_sale = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        agregar_ventas = new javax.swing.JButton();
        nombre_v = new javax.swing.JTextField();
        apellido_v = new javax.swing.JTextField();
        cedula_v = new javax.swing.JTextField();
        marca = new javax.swing.JComboBox<>();
        codigo = new javax.swing.JTextField();
        costo = new javax.swing.JTextField();
        mensajenom = new javax.swing.JLabel();
        mensajenum = new javax.swing.JLabel();
        mensajeap = new javax.swing.JLabel();
        mensajecod = new javax.swing.JLabel();
        mensajecos = new javax.swing.JLabel();
        mensajecodigo = new javax.swing.JLabel();
        empleadoex = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_add_sale.setBackground(new java.awt.Color(255, 255, 255));
        panel_add_sale.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Swis721 BlkEx BT", 1, 14)); // NOI18N
        jLabel1.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        jLabel1.setText("Apellido Empleado:");
        panel_add_sale.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 130, 370, -1));

        jLabel2.setFont(new java.awt.Font("Swis721 BlkEx BT", 1, 14)); // NOI18N
        jLabel2.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        jLabel2.setText("Cedula Empleado:");
        panel_add_sale.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 210, -1));

        jLabel3.setFont(new java.awt.Font("Swis721 BlkEx BT", 1, 14)); // NOI18N
        jLabel3.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        jLabel3.setText("Marca del vehiculo:");
        panel_add_sale.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 280, -1));

        jLabel4.setFont(new java.awt.Font("Swis721 BlkEx BT", 1, 14)); // NOI18N
        jLabel4.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        jLabel4.setText("Codigo del vehiculo");
        panel_add_sale.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 270, -1));

        jLabel5.setFont(new java.awt.Font("Swis721 BlkEx BT", 1, 14)); // NOI18N
        jLabel5.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        jLabel5.setText("Costo del vehiculo:");
        panel_add_sale.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 340, -1));

        jLabel6.setFont(new java.awt.Font("Swis721 BlkEx BT", 1, 14)); // NOI18N
        jLabel6.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        jLabel6.setText("Nombre Empleado:");
        panel_add_sale.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 30, 370, -1));

        agregar_ventas.setText("Agregar Venta");
        agregar_ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_ventasActionPerformed(evt);
            }
        });
        panel_add_sale.add(agregar_ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, -1, -1));

        nombre_v.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        nombre_v.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nombre_vKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombre_vKeyTyped(evt);
            }
        });
        panel_add_sale.add(nombre_v, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 170, 20));

        apellido_v.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        apellido_v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellido_vActionPerformed(evt);
            }
        });
        apellido_v.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                apellido_vKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellido_vKeyTyped(evt);
            }
        });
        panel_add_sale.add(apellido_v, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 170, -1));

        cedula_v.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cedula_v.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cedula_vKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedula_vKeyTyped(evt);
            }
        });
        panel_add_sale.add(cedula_v, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 180, 20));

        marca.setBackground(new java.awt.Color(153, 204, 255));
        marca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CHEVROLET", "KIA", "BMW", "MAZDA", "TOYOTA", "MERCEDES-BENZ" }));
        marca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                marcaKeyTyped(evt);
            }
        });
        panel_add_sale.add(marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 170, -1));

        codigo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActionPerformed(evt);
            }
        });
        codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                codigoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codigoKeyTyped(evt);
            }
        });
        panel_add_sale.add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 210, -1));

        costo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        costo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                costoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                costoKeyTyped(evt);
            }
        });
        panel_add_sale.add(costo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 190, -1));

        mensajenom.setText("¡Ingresar unicamente letras en este campo!");
        panel_add_sale.add(mensajenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        mensajenum.setText("¡Ingresar unicamente numeros en este campo!");
        panel_add_sale.add(mensajenum, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 300, 250, -1));

        mensajeap.setText("¡Ingresar unicamente letras en este campo!");
        panel_add_sale.add(mensajeap, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 180, 240, -1));

        mensajecod.setText("¡Código unicamente contiene 6 digitos!");
        panel_add_sale.add(mensajecod, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, -1, -1));

        mensajecos.setText("¡Ingresar unicamente numeros en este campo!");
        panel_add_sale.add(mensajecos, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, -1, -1));

        mensajecodigo.setText("¡CODIGO YA EXISTENTE!");
        panel_add_sale.add(mensajecodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, -1, -1));

        empleadoex.setText("¡No existe el empleado!");
        panel_add_sale.add(empleadoex, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, -1, -1));

        jLabel8.setText("_________________________________");
        panel_add_sale.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 200, 20));

        jLabel9.setText("_________________________________");
        panel_add_sale.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 280, 210, -1));

        jLabel10.setText("_________________________________");
        panel_add_sale.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 240, -1));

        jLabel11.setText("_________________________________");
        panel_add_sale.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, -1, -1));

        jLabel12.setText("_________________________________");
        panel_add_sale.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 200, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_add_sale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_add_sale, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregar_ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_ventasActionPerformed
        String aux[] = new String[100];
        boolean existe = false;
        aux[0] = nombre_v.getText().toUpperCase();
        aux[1] = apellido_v.getText().toUpperCase();
        aux[2] = codigo.getText();
        aux[3] = cedula_v.getText();
        aux[4] = marca.getSelectedItem().toString();
        aux[5] = costo.getText();
        try {
            BufferedReader br_prueba = new BufferedReader(new FileReader("Empleados.txt"));
            String linea_sep = br_prueba.readLine();
            while (linea_sep != null) {
                String[] campos_prueba = linea_sep.split(";");
                if (campos_prueba[0].equals(aux[0]) && campos_prueba[1].equals(aux[1]) && campos_prueba[2].equals(aux[3])) {
                    existe = true;
                }
                linea_sep = br_prueba.readLine();
            }
            br_prueba.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        if (existe == true) {
            mensajenom.setVisible(false);
            mensajecos.setVisible(false);
            mensajeap.setVisible(false);
            mensajenum.setVisible(false);
            mensajecodigo.setVisible(false);
            empleadoex.setVisible(false);
            nombre_v.setText(null);
            apellido_v.setText(null);
            cedula_v.setText(null);
            codigo.setText(null);
            costo.setText(null);
            agregarRegistro(aux, "Ventas.txt", mensajecodigo);
        } else {
            empleadoex.setVisible(true);
        }
    }//GEN-LAST:event_agregar_ventasActionPerformed

    private void nombre_vKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombre_vKeyReleased
        botonagregarventas();
    }//GEN-LAST:event_nombre_vKeyReleased

    private void nombre_vKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombre_vKeyTyped
        int key = evt.getKeyChar();
        boolean minusculas = key >= 97 && key <= 122;
        boolean mayusculas = key >= 65 && key <= 90;
        if (!(minusculas || mayusculas)) {
            mensajenom.setVisible(true);
            evt.consume();
        } else {
            mensajenom.setVisible(false);
        }
    }//GEN-LAST:event_nombre_vKeyTyped

    private void apellido_vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellido_vActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellido_vActionPerformed

    private void apellido_vKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellido_vKeyReleased
        botonagregarventas();
    }//GEN-LAST:event_apellido_vKeyReleased

    private void apellido_vKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellido_vKeyTyped
        int key = evt.getKeyChar();
        boolean minusculas = key >= 97 && key <= 122;
        boolean mayusculas = key >= 65 && key <= 90;
        if (!(minusculas || mayusculas)) {
            mensajeap.setVisible(true);
            evt.consume();
        } else {
            mensajeap.setVisible(false);
        }
    }//GEN-LAST:event_apellido_vKeyTyped

    private void cedula_vKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedula_vKeyReleased
        botonagregarventas();
    }//GEN-LAST:event_cedula_vKeyReleased

    private void cedula_vKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedula_vKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!(numeros)) {
            mensajenum.setVisible(true);
            evt.consume();
        } else {
            mensajenum.setVisible(false);
        }
        String textoActual = cedula_v.getText();
        if (textoActual.length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_cedula_vKeyTyped

    private void marcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_marcaKeyTyped

    }//GEN-LAST:event_marcaKeyTyped

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoActionPerformed

    private void codigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoKeyReleased
        botonagregarventas();
    }//GEN-LAST:event_codigoKeyReleased

    private void codigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!(numeros)) {
            evt.consume();
        }
        String textoActual = codigo.getText();
        if (textoActual.length() >= 6) {
            evt.consume();
        }
    }//GEN-LAST:event_codigoKeyTyped

    private void costoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_costoKeyReleased
        botonagregarventas();
    }//GEN-LAST:event_costoKeyReleased

    private void costoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_costoKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!(numeros)) {
            mensajecos.setVisible(true);
            evt.consume();
        } else {
            mensajecos.setVisible(false);
        }
    }//GEN-LAST:event_costoKeyTyped
    public void botonagregarventas() {
        if (!nombre_v.getText().isEmpty() && !apellido_v.getText().isEmpty() && !cedula_v.getText().isEmpty() && cedula_v.getText().length() == 10 && !codigo.getText().isEmpty() && codigo.getText().length() == 6 && !costo.getText().isEmpty() && costo.getText().length() >= 8) {
            agregar_ventas.setEnabled(true);
        } else {
            agregar_ventas.setEnabled(false);
        }
    }
    void color() {
        jLabel1.setForeground(new Color(11,61,138));
        jLabel2.setForeground(new Color(11,61,138));
        jLabel3.setForeground(new Color(11,61,138));
        jLabel4.setForeground(new Color(11,61,138));
        jLabel5.setForeground(new Color(11,61,138));
        jLabel6.setForeground(new Color(11,61,138));
    }
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
            java.util.logging.Logger.getLogger(add_sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_sale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar_ventas;
    private javax.swing.JTextField apellido_v;
    private javax.swing.JTextField cedula_v;
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField costo;
    private javax.swing.JLabel empleadoex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> marca;
    private javax.swing.JLabel mensajeap;
    private javax.swing.JLabel mensajecod;
    private javax.swing.JLabel mensajecodigo;
    private javax.swing.JLabel mensajecos;
    private javax.swing.JLabel mensajenom;
    private javax.swing.JLabel mensajenum;
    private javax.swing.JTextField nombre_v;
    public javax.swing.JPanel panel_add_sale;
    // End of variables declaration//GEN-END:variables
}
