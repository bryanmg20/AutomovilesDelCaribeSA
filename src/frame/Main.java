package frame;


import java.awt.Color;
import java.io.*;
import javax.swing.ImageIcon;
import javax.swing.UIManager;


public class Main extends javax.swing.JFrame {

    public int aux;

    public Main() {
        initComponents();
        //icon
        setIconImage(new ImageIcon(getClass().getResource("/logo.png")).getImage());
        //Color de la barra de progreso
        UIManager.put("nimbusOrange", new Color(11, 61, 138));
        //valores predeterminados del jframe
        this.setLocationRelativeTo(null);
        this.setSize(400, 230);
        //Crea archivo Ventas al iniciar el programa
        File archivo = new File("Ventas.txt");
        if (archivo.exists() == false) {
            try {
                PrintWriter pw = new PrintWriter(archivo);
                pw.close();
            } catch (FileNotFoundException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        bar = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();

        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(400, 300));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bar.setPreferredSize(new java.awt.Dimension(500, 10));
        jPanel2.add(bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, -1, 20));

        background.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 400, 10));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, -20, 460, 240));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 230));

        setSize(new java.awt.Dimension(400, 230));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        Main frame = new Main();
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                frame.setVisible(true);
            }
        });
        Options next = new Options();
        try {
            for (int i = 0; i <= 100; i++) {
                //reelentalizacion de la barra de progreso
                Thread.sleep(15);
                frame.bar.setValue(i);
            }
        } catch (Exception e) {

        }
        //Cierra este jframe y abre Options al llenarse la barra de progreso
        new Main().setVisible(false);
        next.setVisible(true);
        frame.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JProgressBar bar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
