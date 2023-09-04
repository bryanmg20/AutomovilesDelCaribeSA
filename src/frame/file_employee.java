package frame;

import static class_.File_sub.*;
import class_.file;
import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;

public class file_employee extends javax.swing.JFrame {

    String[][] registre_employee;
    file controller;
    public file_employee() {
        initComponents();
        controller = new file(this);
        color();
        fuente();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_file_employee = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panel_c = new javax.swing.JPanel();
        c = new javax.swing.JButton();
        panel_n_min = new javax.swing.JPanel();
        n_min = new javax.swing.JButton();
        panel_n_max = new javax.swing.JPanel();
        n_max = new javax.swing.JButton();
        panel_s_min = new javax.swing.JPanel();
        s_min = new javax.swing.JButton();
        panel_s_max = new javax.swing.JPanel();
        s_max = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_file_employee.setBackground(new java.awt.Color(255, 255, 255));
        panel_file_employee.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scroll.setMaximumSize(new java.awt.Dimension(670, 350));
        scroll.setPreferredSize(new java.awt.Dimension(670, 350));

        table.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        table.setColumnSelectionAllowed(true);
        table.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        table.setDragEnabled(true);
        table.setDropMode(javax.swing.DropMode.ON);
        table.setEnabled(false);
        table.setFocusable(false);
        table.setGridColor(new java.awt.Color(23, 93, 163));
        table.setOpaque(false);
        table.setRowHeight(30);
        table.setSelectionBackground(new java.awt.Color(23, 93, 163));
        table.getTableHeader().setReorderingAllowed(false);
        scroll.setViewportView(table);
        table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        panel_file_employee.add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 680, 300));

        jLabel1.setText("Ordenar por Salario:");
        panel_file_employee.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        jLabel2.setText("Ordenar por Nombre:");
        panel_file_employee.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel3.setText("Comisiones:");
        panel_file_employee.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, -1, -1));

        panel_c.setBackground(new java.awt.Color(23, 93, 163));
        panel_c.setForeground(new java.awt.Color(255, 255, 255));
        panel_c.setLayout(new java.awt.BorderLayout());

        c.setForeground(new java.awt.Color(255, 255, 255));
        c.setText("Actualizar");
        c.setBorderPainted(false);
        c.setContentAreaFilled(false);
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });
        panel_c.add(c, java.awt.BorderLayout.CENTER);

        panel_file_employee.add(panel_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 90, 25));

        panel_n_min.setBackground(new java.awt.Color(23, 93, 163));
        panel_n_min.setForeground(new java.awt.Color(255, 255, 255));
        panel_n_min.setLayout(new java.awt.BorderLayout());

        n_min.setForeground(new java.awt.Color(255, 255, 255));
        n_min.setText("Menor");
        n_min.setBorderPainted(false);
        n_min.setContentAreaFilled(false);
        n_min.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n_minActionPerformed(evt);
            }
        });
        panel_n_min.add(n_min, java.awt.BorderLayout.CENTER);

        panel_file_employee.add(panel_n_min, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 80, 25));

        panel_n_max.setBackground(new java.awt.Color(23, 93, 163));
        panel_n_max.setForeground(new java.awt.Color(255, 255, 255));
        panel_n_max.setLayout(new java.awt.BorderLayout());

        n_max.setForeground(new java.awt.Color(255, 255, 255));
        n_max.setText("Mayor");
        n_max.setBorderPainted(false);
        n_max.setContentAreaFilled(false);
        n_max.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n_maxActionPerformed(evt);
            }
        });
        panel_n_max.add(n_max, java.awt.BorderLayout.CENTER);

        panel_file_employee.add(panel_n_max, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 80, 25));

        panel_s_min.setBackground(new java.awt.Color(23, 93, 163));
        panel_s_min.setForeground(new java.awt.Color(255, 255, 255));
        panel_s_min.setLayout(new java.awt.BorderLayout());

        s_min.setForeground(new java.awt.Color(255, 255, 255));
        s_min.setText("Menor");
        s_min.setBorderPainted(false);
        s_min.setContentAreaFilled(false);
        s_min.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_minActionPerformed(evt);
            }
        });
        panel_s_min.add(s_min, java.awt.BorderLayout.CENTER);

        panel_file_employee.add(panel_s_min, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 80, 25));

        panel_s_max.setBackground(new java.awt.Color(23, 93, 163));
        panel_s_max.setForeground(new java.awt.Color(255, 255, 255));
        panel_s_max.setLayout(new java.awt.BorderLayout());

        s_max.setForeground(new java.awt.Color(255, 255, 255));
        s_max.setText("Mayor");
        s_max.setBorderPainted(false);
        s_max.setContentAreaFilled(false);
        s_max.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_maxActionPerformed(evt);
            }
        });
        panel_s_max.add(s_max, java.awt.BorderLayout.CENTER);

        panel_file_employee.add(panel_s_max, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 80, 25));

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
    
    private int indice(String[][] matriz, int j, int n) {
        int indice = 0;
        //verifica si el nombre o a pellido de dos cadenas son iguales, devuelve el indice 
        //del nombre o apellido que sean distintos
        if (!matriz[j][n].equals(matriz[j + 1][n])) {
            indice = 0;
        } else {
            if (!matriz[j][n + 1].equals(matriz[j + 1][n + 1])) {
                indice = 1;
            }
        }

        return indice;
    }

    private int menor(String[][] matriz, int j, int n) {
        int menor = 0;
        //compara el tamaño de dos cadenas
        if (matriz[j][n].length() < matriz[j + 1][n].length() || matriz[j][n].length() == matriz[j + 1][n].length()) {
            menor = matriz[j][0].length();
        } else {
            if (matriz[j][n].length() > matriz[j + 1][n].length()) {
                menor = matriz[j + 1][n].length();
            }
        }
        //devuelve el tamaño mas pequeño
        return menor;
    }

    private void exchange(int j) {
        String[] aux = new String[registre_employee[0].length];
        //intercambia fila j con fila j+1
        System.arraycopy(registre_employee[j], 0, aux, 0, registre_employee[0].length);
        System.arraycopy(registre_employee[j + 1], 0, registre_employee[j], 0, registre_employee[0].length);
        System.arraycopy(aux, 0, registre_employee[j + 1], 0, registre_employee[0].length);
    }
    private void new_file(){
        for (String[] registre_employee1 : registre_employee) {
            agregarArchivo("aux_1.txt", registre_employee1, 10);
        }
        eliminarArchivo("Empleados.txt");
        renombrarArchivo("aux_1.txt", "Empleados.txt");
        String[][] aux = ObtenerArchivo("Empleados.txt");
        //imprime registros en tabla
        table(aux);
    }
    private void n_minActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n_minActionPerformed
        registre_employee = ObtenerArchivo("Empleados.txt");
        int indice;
        //recorro la matriz
        for (int i = 0; i < registre_employee.length - 1; i++) {
            for (int j = 0; j < registre_employee.length - 1; j++) {
                //obtiene el indice del nombre o apellido que al comparar sean distintos
                indice = indice(registre_employee, j, 0);
                //tamaño de la cadena menor
                int menor = menor(registre_employee, j, indice);

                boolean pin = true;
                boolean order = false;
                int k = 0;
                while (pin && !order) {
                    //Obtiene el valor numerico de el caracter
                    int aux_1 = registre_employee[j][indice].substring(k, k + 1).charAt(0);
                    int aux_2 = registre_employee[j + 1][indice].substring(k, k + 1).charAt(0);
                    //compara los valores numerico de los caracteres
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
                    //recorrido maximo segun el tamaño de la cadena menor
                    if (k >= menor) {
                        pin = false;
                    }
                }
            }
        }
        //Crea nuevo archivo con los registros ordenados
        new_file();

    }//GEN-LAST:event_n_minActionPerformed

    private void s_minActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_minActionPerformed
        registre_employee = ObtenerArchivo("Empleados.txt");
        //recorro la matriz
        for (int i = 0; i < registre_employee.length - 1; i++) {
            for (int j = 0; j < registre_employee.length - 1; j++) {
                //si fila j es mayor a fila j+1
                //intercambia filas
                if (Integer.parseInt(registre_employee[j][6]) > Integer.parseInt(registre_employee[j + 1][6])) {
                    String[] aux = new String[registre_employee[0].length];
                    //intercambio las filas
                    System.arraycopy(registre_employee[j], 0, aux, 0, registre_employee[0].length);
                    System.arraycopy(registre_employee[j + 1], 0, registre_employee[j], 0, registre_employee[0].length);
                    System.arraycopy(aux, 0, registre_employee[j + 1], 0, registre_employee[0].length);
                }
            }
        }
        new_file();
    }//GEN-LAST:event_s_minActionPerformed
    //Se declara un acumulador y un contador en 0
    float contador = 0;
    float acumulador = 0;
    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
        //Se lee el archivo de empleados
        try {
            BufferedReader br_emp = new BufferedReader(new FileReader("Empleados.txt"));
            String linea_emp = br_emp.readLine();
            while (linea_emp != null) {
                String[] campos_emp = linea_emp.split(";");
                //Se lee el archivo de ventas
                BufferedReader br_ven = new BufferedReader(new FileReader("Ventas.txt"));
                String lenea_venta = br_ven.readLine();
                while (lenea_venta != null) {
                    String[] campos_ven = lenea_venta.split(";");
                    //Compara si las cedulas son iguales
                    if (campos_emp[2].equals(campos_ven[3])) {
                        //Si el costo del vehiculo es mayor o igual a 30,000,000 entra a este condicional
                        if (Integer.parseInt(campos_ven[5]) >= 30000000) {
                            //Se suma 1 al contador y se acumula el total de ventas con el costo requerido
                            contador++;
                            acumulador = acumulador + Float.parseFloat(campos_ven[5]);
                        }
                    }
                    lenea_venta = br_ven.readLine();
                }
                br_ven.close();
                //Si hubo almenos una venta superior al valor entra en el condicional
                if (contador != 0) {
                    //Se utiliza la logica: numero1*0,02 + numero2*0,02 = (numero1 + numero2)*0,02
                    float numero = Float.parseFloat(campos_emp[6]) + ((acumulador / 100) * 2);
                    campos_emp[7] = numero + "";
                    //Se llama la agregarArchivosubrutina para escribir el registro con el ultimo campo actualizado
                    //Y se reinician las variables de apoyo
                    agregarArchivo("aux_1.txt", campos_emp, 10);
                    contador = 0;
                    acumulador = 0;
                } else {
                    //Sino tuvo ninguna venta superior al requerido se imprime sin cambios
                    agregarArchivo("aux_1.txt", campos_emp, 0);
                }

                linea_emp = br_emp.readLine();
            }
            br_emp.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        //elimino el archivo original y renombro la copia como este
        eliminarArchivo("Empleados.txt");
        renombrarArchivo("aux_1.txt", "Empleados.txt");
        //Se muestra la tabla con los datos actualizados
        String[][] registre_employee = ObtenerArchivo("Empleados.txt");
        table(registre_employee);
    }//GEN-LAST:event_cActionPerformed

    private void s_maxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_maxActionPerformed

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
        new_file();
    }//GEN-LAST:event_s_maxActionPerformed

    private void n_maxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n_maxActionPerformed
        registre_employee = ObtenerArchivo("Empleados.txt");
        //recorro la matriz
        int indice = 0;
        for (int i = 0; i < registre_employee.length - 1; i++) {
            for (int j = 0; j < registre_employee.length - 1; j++) {

                indice = indice(registre_employee, j, 0);

                int menor = menor(registre_employee, j, indice);

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
        new_file();
    }//GEN-LAST:event_n_maxActionPerformed
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
        table.getTableHeader().setForeground(Color.BLACK);
    }
    void color() {
        jLabel1.setForeground(new Color(11, 61, 138));
        jLabel2.setForeground(new Color(11, 61, 138));
        jLabel3.setForeground(new Color(11, 61, 138));
    }
    //La subrutina fuete modifica la fuente de las jLabels
    void fuente() {
        jLabel1.setFont(new Font("verdana", Font.BOLD, 14));
        jLabel2.setFont(new Font("verdana", Font.BOLD, 14));
        jLabel3.setFont(new Font("verdana", Font.BOLD, 14));
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
    public javax.swing.JButton c;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JButton n_max;
    public javax.swing.JButton n_min;
    public javax.swing.JPanel panel_c;
    public javax.swing.JPanel panel_file_employee;
    public javax.swing.JPanel panel_n_max;
    public javax.swing.JPanel panel_n_min;
    public javax.swing.JPanel panel_s_max;
    public javax.swing.JPanel panel_s_min;
    public javax.swing.JButton s_max;
    public javax.swing.JButton s_min;
    private javax.swing.JScrollPane scroll;
    public javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
