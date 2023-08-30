package frame;


import java.awt.BorderLayout;
import javax.swing.JPanel;
import static frame.employee.*;
import javax.swing.JFrame;
public class Options extends javax.swing.JFrame {

    public Options() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(1000,600);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgound = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        employee = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        sub_panel = new javax.swing.JPanel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backgound.setBackground(new java.awt.Color(255, 255, 255));
        backgound.setEnabled(false);
        backgound.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(11, 61, 138));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        employee.setText("Empleado");
        employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeActionPerformed(evt);
            }
        });
        menu.add(employee, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 250, 40));

        jButton2.setText("Ventas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        menu.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 250, 40));

        jButton3.setText("Graficas");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        menu.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 250, 40));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menú");
        menu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        sales window = new sales();
        showPanel(window.get_panel(),window);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Graphiques window = new Graphiques();
        showPanel(window.get_panel(),window);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeActionPerformed
        employee window = new employee();
        showPanel(window.get_panel(),window);
    }//GEN-LAST:event_employeeActionPerformed
    
    private void showPanel(JPanel panel, JFrame frame){
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
    public static javax.swing.JPanel content;
    private javax.swing.JButton employee;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel sub_panel;
    // End of variables declaration//GEN-END:variables
}
