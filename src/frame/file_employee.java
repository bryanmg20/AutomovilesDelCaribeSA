/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frame;

import static class_.File_sub.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author bryan
 */
public class file_employee extends javax.swing.JFrame {

    /**
     * Creates new form file_employee
     */
    public file_employee() {
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

        panel_file_employee = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_file_employee.setBackground(new java.awt.Color(255, 255, 255));
        panel_file_employee.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("empleado");
        panel_file_employee.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 160, -1, -1));

        jButton1.setText("Ordenar por Nombre");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel_file_employee.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 41, -1, -1));

        jButton2.setText("Ordenar por Salario");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel_file_employee.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 76, -1, -1));

        actualizar.setText("Actualizar");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });
        panel_file_employee.add(actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_file_employee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_file_employee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String[][] registre_employee = ObtenerArchivo("Empleados.txt");
        //recorro la matriz
        int indice=0;
        for (int i = 0; i < registre_employee.length - 1; i++) {
            for (int j = 0; j < registre_employee.length - 1; j++) {    
                //compara si los dos nombres son distintos o iguales, si son distintos obtiene el indice
                if (!registre_employee[j][0].equals(registre_employee[j + 1][0])){
                    indice = 0;
                }else{
                    if(!registre_employee[j][1].equals(registre_employee[j + 1][1])){
                        indice = 1;
                    }
                }              
//                if (!registre_employee[j][indice].equals(registre_employee[j + 1][indice])) {
                    int menor = 0;
                    //verifico que cadena de texto es mayor para saber el recorrido maximo
                    if (registre_employee[j][indice].length() < registre_employee[j + 1][indice].length() || registre_employee[j][indice].length() == registre_employee[j + 1][indice].length()) {
                        menor = registre_employee[j][0].length();
                    } else {
                        if (registre_employee[j][indice].length() > registre_employee[j + 1][indice].length()) {
                            menor = registre_employee[j + 1][0].length();
                        }
                    }
                    boolean pin = true;
                    boolean order = false;
                    int k = 0;
                    while (pin && !order) {
                  
                        int aux_1 = registre_employee[j][indice].substring(k, k + 1).charAt(0);
                        int aux_2 = registre_employee[j + 1][indice].substring(k, k + 1).charAt(0);
                        if (aux_1 > aux_2) {
                          
                            order = true;
                            //guardo la fila anterior que voy a cambiar por la fila superior
                            String[] aux = new String[registre_employee[0].length];

                            System.arraycopy(registre_employee[j], 0,aux, 0, registre_employee[0].length);
                            System.arraycopy(registre_employee[j + 1], 0, registre_employee[j], 0, registre_employee[0].length);
                            System.arraycopy(aux, 0, registre_employee[j + 1],0, registre_employee[0].length);
                        }else{
                            if (aux_1<aux_2) {
                                order = true;
                            }
                        }
                        k++;
                        //recorrido maximo
                        if (k >= menor) {
                            pin = false;
                        }
                    }           
                }
            }
        for (int i = 0; i < registre_employee.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < registre_employee[0].length; j++) {
                System.out.print(registre_employee[i][j] + " ");
            }

        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String[][] registre_employee = ObtenerArchivo("Empleados.txt");
        //recorro la matriz
        for (int i = 0; i < registre_employee.length - 1; i++) {
            for (int j = 0; j < registre_employee.length - 1; j++) {
                if(Integer.parseInt(registre_employee[j][6])>Integer.parseInt(registre_employee[j+1][6])){
                    String[] aux = new String[registre_employee[0].length];

                            System.arraycopy(registre_employee[j], 0,aux, 0, registre_employee[0].length);
                            System.arraycopy(registre_employee[j + 1], 0, registre_employee[j], 0, registre_employee[0].length);
                            System.arraycopy(aux, 0, registre_employee[j + 1],0, registre_employee[0].length);
                }
            }
        }
        for (int i = 0; i < registre_employee.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < registre_employee[0].length; j++) {
                System.out.print(registre_employee[i][j] + " ");
            }

        }
    }//GEN-LAST:event_jButton2ActionPerformed
    float contador = 0;
    float acumulador = 0;
    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        System.out.println("hola");
        try {
            BufferedReader br_prueba = new BufferedReader(new FileReader("Empleados.txt"));
            String linea_sep = br_prueba.readLine();
            while (linea_sep != null) {
                String[] campos_prueba = linea_sep.split(";");
                BufferedReader br_prueba2 = new BufferedReader(new FileReader("Ventas.txt"));
                String venta = br_prueba2.readLine();
                while (venta != null) {
                    String[] campos = venta.split(";");
                    if (campos_prueba[2].equals(campos[3])) {
                        if (Integer.parseInt(campos[5]) >= 30000000) {
                            contador++;
                            acumulador = acumulador + Float.parseFloat(campos[5]);
                        }
                    }
                    venta = br_prueba2.readLine();
                }
                if (contador != 0) {
                    float numero = Float.parseFloat(campos_prueba[6]) + ((acumulador / 100) * 2);
                    campos_prueba[7] = numero + "";
                    agregarArchivo("aux_1.txt", campos_prueba, 10);
                    contador = 0;
                    acumulador = 0;
                } else {
                    agregarArchivo("aux_1.txt", campos_prueba, 0);
                }

                linea_sep = br_prueba.readLine();
            }
            br_prueba.close();
            eliminarArchivo("Empleados.txt");
            renombrarArchivo("aux_1.txt", "Empleados.txt");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }//GEN-LAST:event_actualizarActionPerformed

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
            java.util.logging.Logger.getLogger(file_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(file_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(file_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(file_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new file_employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JPanel panel_file_employee;
    // End of variables declaration//GEN-END:variables
}
