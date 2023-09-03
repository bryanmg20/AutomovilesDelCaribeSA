
package frame;

import static class_.File_sub.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;

public class file_employee extends javax.swing.JFrame {
    String[][] registre_employee;
    public file_employee() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_file_employee = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_file_employee.setBackground(new java.awt.Color(255, 255, 255));
        panel_file_employee.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Menor");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel_file_employee.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jButton2.setText("Menor");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel_file_employee.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, -1));

        actualizar.setText("Actualizar");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });
        panel_file_employee.add(actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, -1, -1));

        jScrollPane1.setMaximumSize(new java.awt.Dimension(670, 350));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(670, 350));

        table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(table);

        panel_file_employee.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 670, 300));

        jLabel1.setText("Ordenar por Salario:");
        panel_file_employee.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        jLabel2.setText("Ordenar por Nombre:");
        panel_file_employee.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jButton3.setText("Mayor");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panel_file_employee.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, -1));

        jButton4.setText("Mayor");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panel_file_employee.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        jLabel3.setText("Comisiones:");
        panel_file_employee.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_file_employee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_file_employee, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private int indice(String[][] matriz, int j, int n){
        int indice=0;
        //verifica si el nombre o a pellido de dos cadenas son iguales, devuelve el indice
        //del nombre o apellido que sean distintos
        if (!matriz[j][n].equals(matriz[j + 1][n])) {
                    indice = 0;
                } else {
                    if (!matriz[j][n+1].equals(matriz[j + 1][n+1])) {
                        indice = 1;
                    }
                }
        
        return indice;
    }
    private int menor(String[][] matriz, int j, int n){
        int menor=0;
        //compara el tamaño de dos cadenas
        if (matriz[j][n].length() < matriz[j + 1][n].length() || matriz[j][n].length() == matriz[j + 1][n].length()) {
                    menor =matriz[j][0].length();
                } else {
                    if (matriz[j][n].length() > matriz[j + 1][n].length()) {
                        menor = matriz[j + 1][n].length();
                    }
                }
        
        return menor;
    }
    private void exchange(int j){
        String[] aux = new String[registre_employee[0].length];

        System.arraycopy(registre_employee[j], 0, aux, 0, registre_employee[0].length);
        System.arraycopy(registre_employee[j + 1], 0, registre_employee[j], 0, registre_employee[0].length);
        System.arraycopy(aux, 0, registre_employee[j + 1], 0, registre_employee[0].length);
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        registre_employee = ObtenerArchivo("Empleados.txt");
        //recorro la matriz
        int indice = 0;
        for (int i = 0; i < registre_employee.length - 1; i++) {
            for (int j = 0; j < registre_employee.length - 1; j++) {
                //obtiene el indice del nombre o apellido
                indice = indice(registre_employee,j,0); 
                //tamaño de la cadena menor
                int menor = menor(registre_employee,j,indice);
               
                boolean pin = true;
                boolean order = false;
                int k = 0;
                while (pin && !order) {

                    int aux_1 = registre_employee[j][indice].substring(k, k + 1).charAt(0);
                    int aux_2 = registre_employee[j + 1][indice].substring(k, k + 1).charAt(0);
                    if (aux_1 > aux_2) {
                        order = true;
                        //guardo la fila anterior que voy a cambiar por la fila superior
                        exchange(j);
                    } else {
                        if (aux_1 < aux_2) {
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
            agregarArchivo("aux_1.txt", registre_employee[i], 10);
        }
        eliminarArchivo("Empleados.txt");
        renombrarArchivo("aux_1.txt", "Empleados.txt");
        String[][] aux = ObtenerArchivo("Empleados.txt");
        table(aux);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        registre_employee = ObtenerArchivo("Empleados.txt");
        //recorro la matriz
        for (int i = 0; i < registre_employee.length - 1; i++) {
            for (int j = 0; j < registre_employee.length - 1; j++) {
                if (Integer.parseInt(registre_employee[j][6]) > Integer.parseInt(registre_employee[j + 1][6])) {
                    String[] aux = new String[registre_employee[0].length];
                    //intercambio las filas
                    System.arraycopy(registre_employee[j], 0, aux, 0, registre_employee[0].length);
                    System.arraycopy(registre_employee[j + 1], 0, registre_employee[j], 0, registre_employee[0].length);
                    System.arraycopy(aux, 0, registre_employee[j + 1], 0, registre_employee[0].length);
                }
            }
        }
        for (int i = 0; i < registre_employee.length; i++) {
            agregarArchivo("aux_1.txt", registre_employee[i], 10);
        }
        eliminarArchivo("Empleados.txt");
        renombrarArchivo("aux_1.txt", "Empleados.txt");
        String[][] aux = ObtenerArchivo("Empleados.txt");
        table(aux);
    }//GEN-LAST:event_jButton2ActionPerformed
    float contador = 0;
    float acumulador = 0;
    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed

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
        String[][] registre_employee = ObtenerArchivo("Empleados.txt");
        table(registre_employee);
    }//GEN-LAST:event_actualizarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        registre_employee = ObtenerArchivo("Empleados.txt");
        //recorro la matriz
        for (int i = 0; i < registre_employee.length - 1; i++) {
            for (int j = 0; j < registre_employee.length - 1; j++) {
                if (Integer.parseInt(registre_employee[j][6]) < Integer.parseInt(registre_employee[j + 1][6])) {
                    String[] aux = new String[registre_employee[0].length];
                    //intercambio las filas
                    System.arraycopy(registre_employee[j], 0, aux, 0, registre_employee[0].length);
                    System.arraycopy(registre_employee[j + 1], 0, registre_employee[j], 0, registre_employee[0].length);
                    System.arraycopy(aux, 0, registre_employee[j + 1], 0, registre_employee[0].length);
                }
            }
        }
        for (int i = 0; i < registre_employee.length; i++) {
            agregarArchivo("aux_1.txt", registre_employee[i], 10);
        }
        eliminarArchivo("Empleados.txt");
        renombrarArchivo("aux_1.txt", "Empleados.txt");
        String[][] aux = ObtenerArchivo("Empleados.txt");
        table(aux);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        registre_employee = ObtenerArchivo("Empleados.txt");
        //recorro la matriz
        int indice = 0;
        for (int i = 0; i < registre_employee.length - 1; i++) {
            for (int j = 0; j < registre_employee.length - 1; j++) {
            
                indice = indice(registre_employee,j,0);
                
                int menor = menor(registre_employee,j,indice);
               
                boolean pin = true;
                boolean order = false;
                int k = 0;
                while (pin && !order) {

                    int aux_1 = registre_employee[j][indice].substring(k, k + 1).charAt(0);
                    int aux_2 = registre_employee[j + 1][indice].substring(k, k + 1).charAt(0);
                    if (aux_1 < aux_2) {
                        order = true;
                        //guardo la fila anterior que voy a cambiar por la fila superior
                        exchange(j);
                    } else {
                        if (aux_1 > aux_2) {
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
            agregarArchivo("aux_1.txt", registre_employee[i], 10);
        }
        eliminarArchivo("Empleados.txt");
        renombrarArchivo("aux_1.txt", "Empleados.txt");
        String[][] aux = ObtenerArchivo("Empleados.txt");
        table(aux);
    }//GEN-LAST:event_jButton4ActionPerformed
    public void table(String[][] matriz) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("Cedula");
        model.addColumn("Cargo");
        model.addColumn("Telefono");
        model.addColumn("Fecha");
        model.addColumn("Salario");
        model.addColumn("Salario Total");
        for (int i = 0; i < matriz.length; i++) {

            model.addRow(new Object[]{matriz[i][0], matriz[i][1], matriz[i][2], matriz[i][3], matriz[i][4], matriz[i][5], matriz[i][6], matriz[i][7]});

        }

        table.setModel(model);
    }
 

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
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JPanel panel_file_employee;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
