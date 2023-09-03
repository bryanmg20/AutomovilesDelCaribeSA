package frame;

import java.awt.Image;
import java.io.*;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;

public class Main extends javax.swing.JFrame {

    Timer timer;
    TimerTask tarea;
    public int aux;
    public Main() {
        initComponents();
        

//        //temporizador para abrir Options automaticamente
//        timer = new Timer();
//        tarea = new TimerTask() {
//            public int c=0;
//            @Override
//            public void run() {
//                c++;
//                aux=c;
//                if (c == 3) {
//                    Options frame = new Options();
//                    frame.setVisible(true);
//                    timer.cancel();
//                }             
////                    
//            }
//
//        };
//        timer.schedule(tarea, 0, 1000);
        
        

        this.setLocationRelativeTo(null);
        this.setSize(600, 300);

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
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        tittle = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        start = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new java.awt.GridLayout(2, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        background.add(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tittle.setBackground(new java.awt.Color(0, 0, 0));
        tittle.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        tittle.setText("Automoviles Del Caribe SA");
        jPanel2.add(tittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 440, 75));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        start.setText("Iniciar");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });
        jPanel3.add(start);

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 75, 600, 75));

        background.add(jPanel2);

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        this.setVisible(false);
        Options window = new Options();
        window.setVisible(true);
    }//GEN-LAST:event_startActionPerformed

    /**
     * @param args the command line arguments
     */
    //prueba
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
                //Hola bryan, gracias por lo de hoy
                //de nada pa
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton start;
    private javax.swing.JLabel tittle;
    // End of variables declaration//GEN-END:variables
}
