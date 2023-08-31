package frame;

import class_.Button_design;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Cursor;
import java.security.Principal;
import javax.swing.JFrame;

public class Options extends javax.swing.JFrame {

    public Button_design controller;

    public Options() {
        initComponents();
        //centrar el jframe
        this.setLocationRelativeTo(null);
        //llamamos la clase Button_desing
        controller = new Button_design(this);
        //forzar el tamaño del jframe
        this.setSize(1000, 600);
        
        //tipo de cursor
        button_add_employee.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgound = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        tittle = new javax.swing.JLabel();
        line = new javax.swing.JPanel();
        panel_add_employe = new javax.swing.JPanel();
        button_add_employee = new javax.swing.JButton();
        panel_eliminated_employee = new javax.swing.JPanel();
        button_eliminate_employee = new javax.swing.JButton();
        panel_add_sale = new javax.swing.JPanel();
        button_add_sale = new javax.swing.JButton();
        panel_see = new javax.swing.JPanel();
        button_eliminate_sale = new javax.swing.JButton();
        sub_panel = new javax.swing.JPanel();
        content = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backgound.setBackground(new java.awt.Color(255, 255, 255));
        backgound.setEnabled(false);
        backgound.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(11, 61, 138));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tittle.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        tittle.setForeground(new java.awt.Color(255, 255, 255));
        tittle.setText("Menú");
        menu.add(tittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        line.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout lineLayout = new javax.swing.GroupLayout(line);
        line.setLayout(lineLayout);
        lineLayout.setHorizontalGroup(
            lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        lineLayout.setVerticalGroup(
            lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        menu.add(line, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 71, 170, 2));

        panel_add_employe.setBackground(new java.awt.Color(23, 93, 163));
        panel_add_employe.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        panel_add_employe.setLayout(new java.awt.BorderLayout());

        button_add_employee.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        button_add_employee.setForeground(new java.awt.Color(255, 255, 255));
        button_add_employee.setText("Agregar empleado");
        button_add_employee.setBorderPainted(false);
        button_add_employee.setContentAreaFilled(false);
        button_add_employee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_add_employee.setFocusPainted(false);
        button_add_employee.setRequestFocusEnabled(false);
        button_add_employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_add_employeeActionPerformed(evt);
            }
        });
        panel_add_employe.add(button_add_employee, java.awt.BorderLayout.CENTER);

        menu.add(panel_add_employe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 250, 40));

        panel_eliminated_employee.setBackground(new java.awt.Color(23, 93, 163));
        panel_eliminated_employee.setLayout(new java.awt.BorderLayout());

        button_eliminate_employee.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        button_eliminate_employee.setForeground(new java.awt.Color(255, 255, 255));
        button_eliminate_employee.setText("Eliminar empleado");
        button_eliminate_employee.setBorderPainted(false);
        button_eliminate_employee.setContentAreaFilled(false);
        button_eliminate_employee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_eliminate_employee.setDefaultCapable(false);
        button_eliminate_employee.setFocusPainted(false);
        button_eliminate_employee.setRequestFocusEnabled(false);
        button_eliminate_employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_eliminate_employeeActionPerformed(evt);
            }
        });
        panel_eliminated_employee.add(button_eliminate_employee, java.awt.BorderLayout.CENTER);

        menu.add(panel_eliminated_employee, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 250, 40));

        panel_add_sale.setBackground(new java.awt.Color(23, 93, 163));
        panel_add_sale.setLayout(new java.awt.BorderLayout());

        button_add_sale.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        button_add_sale.setForeground(new java.awt.Color(255, 255, 255));
        button_add_sale.setText("Agregar venta");
        button_add_sale.setBorderPainted(false);
        button_add_sale.setContentAreaFilled(false);
        button_add_sale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_add_sale.setDefaultCapable(false);
        button_add_sale.setFocusPainted(false);
        button_add_sale.setRequestFocusEnabled(false);
        button_add_sale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_add_saleActionPerformed(evt);
            }
        });
        panel_add_sale.add(button_add_sale, java.awt.BorderLayout.CENTER);

        menu.add(panel_add_sale, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 250, 40));

        panel_see.setBackground(new java.awt.Color(23, 93, 163));
        panel_see.setLayout(new java.awt.BorderLayout());

        button_eliminate_sale.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        button_eliminate_sale.setForeground(new java.awt.Color(255, 255, 255));
        button_eliminate_sale.setText("Eliminar venta");
        button_eliminate_sale.setBorderPainted(false);
        button_eliminate_sale.setContentAreaFilled(false);
        button_eliminate_sale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_eliminate_sale.setDefaultCapable(false);
        button_eliminate_sale.setFocusPainted(false);
        button_eliminate_sale.setRequestFocusEnabled(false);
        button_eliminate_sale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_eliminate_saleActionPerformed(evt);
            }
        });
        panel_see.add(button_eliminate_sale, java.awt.BorderLayout.CENTER);

        menu.add(panel_see, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 250, 40));

        backgound.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 600));

        sub_panel.setBackground(new java.awt.Color(33, 122, 204));

        javax.swing.GroupLayout sub_panelLayout = new javax.swing.GroupLayout(sub_panel);
        sub_panel.setLayout(sub_panelLayout);
        sub_panelLayout.setHorizontalGroup(
            sub_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        sub_panelLayout.setVerticalGroup(
            sub_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        backgound.add(sub_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 750, 150));

        content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        backgound.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 750, 420));

        getContentPane().add(backgound, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_add_employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_add_employeeActionPerformed
        add_employee window = new add_employee();
        showPanel(window.get_panel(), window);
    }//GEN-LAST:event_button_add_employeeActionPerformed

    private void button_eliminate_employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_eliminate_employeeActionPerformed
        eliminate_employee window = new eliminate_employee();
        showPanel(window.get_panel(), window);
    }//GEN-LAST:event_button_eliminate_employeeActionPerformed

    private void button_add_saleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_add_saleActionPerformed
        add_sale window = new add_sale();
        showPanel(window.get_panel(), window);
    }//GEN-LAST:event_button_add_saleActionPerformed

    private void button_eliminate_saleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_eliminate_saleActionPerformed
        eliminate_sale window = new eliminate_sale();
        showPanel(window.get_panel(), window);
    }//GEN-LAST:event_button_eliminate_saleActionPerformed

    public static void showPanel(JPanel panel, JFrame frame) {
        frame.setSize(750, 420);
        frame.setLocation(0, 0);
        content.removeAll();

        try {
            content.add(panel, BorderLayout.CENTER);
        } catch (Exception e) {
            System.out.println("error");
        }
        content.revalidate();
        content.repaint();
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
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Options().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgound;
    public javax.swing.JButton button_add_employee;
    public javax.swing.JButton button_add_sale;
    public javax.swing.JButton button_eliminate_employee;
    public javax.swing.JButton button_eliminate_sale;
    public static javax.swing.JPanel content;
    private javax.swing.JPanel line;
    private javax.swing.JPanel menu;
    public javax.swing.JPanel panel_add_employe;
    public javax.swing.JPanel panel_add_sale;
    public javax.swing.JPanel panel_eliminated_employee;
    public javax.swing.JPanel panel_see;
    private javax.swing.JPanel sub_panel;
    private javax.swing.JLabel tittle;
    // End of variables declaration//GEN-END:variables

}
