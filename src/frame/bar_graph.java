/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author bryan
 */
public class bar_graph extends javax.swing.JFrame {

    /**
     * Creates new form bar_graph
     */
    public bar_graph() {
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

        panel_bard = new javax.swing.JPanel();
        gra = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_bard.setBackground(new java.awt.Color(255, 255, 255));
        panel_bard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout graLayout = new javax.swing.GroupLayout(gra);
        gra.setLayout(graLayout);
        graLayout.setHorizontalGroup(
            graLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        graLayout.setVerticalGroup(
            graLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        panel_bard.add(gra, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 25, 600, 380));

        getContentPane().add(panel_bard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Se hace una subrutina publica para importarla en el Jframe Options
    void diagrama_barras (int[] precio){
        //Se le asigna valores a cada posicion del vector para que funcionen como acumuladores
        precio[0] = 0;
        precio[1] = 0; 
        precio[2] = 0;
        precio[3] = 0;
        precio[4] = 0;
        precio[5] = 0;
        
        //Se lee el archivo de Ventas
        try {
            BufferedReader br_ventas = new BufferedReader(new FileReader("Ventas.txt"));
            String linea_v = br_ventas.readLine();
            //Hasta que no se lea todo el archivo
            while (linea_v != null) {
                String[] campos_prueba = linea_v.split(";");
                //Se suma el acumulador dependiendo de las marcas de vehiculos
                switch (campos_prueba[3]) {
                    case "CHEVROLET" -> {
                        precio[0] = precio[0] + Integer.parseInt(campos_prueba[5]);
                        break; 
                    }
                    case "KIA" -> {
                        precio[1] = precio[1] + Integer.parseInt(campos_prueba[5]);
                        break; 
                    }
                    case "BMW" -> {
                        precio[2] = precio[2] + Integer.parseInt(campos_prueba[5]);
                        break; 
                    }
                    case "MAZDA" -> {
                        precio[3] = precio[3] + Integer.parseInt(campos_prueba[5]);
                        break; 
                    }
                    case "TOYOTA" -> {
                        precio[4] = precio[4] + Integer.parseInt(campos_prueba[5]);
                        break; 
                    }
                    case "MERCEDES-BENZ" -> {
                        precio[5] = precio[5] + Integer.parseInt(campos_prueba[5]);
                        break; 
                    }
                }

                linea_v = br_ventas.readLine();
            } br_ventas.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        
        //Se crea un objeto DefaultCategoryDataset para almacenar los datos 
        DefaultCategoryDataset datos_pre = new DefaultCategoryDataset(); 
        //Se utiliza una manera de ordenar los datos propia del diagrama de barras
        //Se divien entre 1,000,000 para que se observen los numeros con claridad, es decir en la grafica 30 es igual a 30,000,000
        datos_pre.setValue(precio[0]/1000000, "Precios", "CHEVROLET");
        datos_pre.setValue(precio[1]/1000000, "Precios", "KIA"); 
        datos_pre.setValue(precio[2]/1000000, "Precios", "BMW");
        datos_pre.setValue(precio[3]/1000000, "Precios", "MAZDA");
        datos_pre.setValue(precio[4]/1000000, "Precios", "TOYOTA");
        datos_pre.setValue(precio[5]/1000000, "Precios", "MERCEDES-BENZ");
        
        //Se crea un objeto JFreeChart y se especifica que es un diagrama de barras
        //Ademas se introducen todos los datos necesarios para crearlo
        JFreeChart grafico_barras = ChartFactory.createBarChart("Precios Automoviles", "Marcas", "Precios", datos_pre,PlotOrientation.VERTICAL, true, true, false);
        ChartPanel panel = new ChartPanel(grafico_barras);
        
        //Se cambia el color de las barras a azul
        CategoryPlot plot = grafico_barras.getCategoryPlot();
        plot.getRenderer().setSeriesPaint(0, new Color(11, 61, 138));
        //Se establece las dimenciones y la posibilidad de hacerle zoom a la grafica
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(600,380));
        
        //Se añade la grafica a un JPanel de la interfaz
        gra.setLayout(new BorderLayout());
        gra.add(panel,BorderLayout.NORTH);
        
        //Se actualiza la interfaz para que no haya error mostrando la grafica
        pack();
        repaint();
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
            java.util.logging.Logger.getLogger(bar_graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bar_graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bar_graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bar_graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bar_graph().setVisible(true);
            }
        });
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel gra;
    public javax.swing.JPanel panel_bard;
    // End of variables declaration//GEN-END:variables
}
