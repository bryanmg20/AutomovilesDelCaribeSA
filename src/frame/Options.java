package frame;

import class_.Button_design;
import static class_.File_sub.ObtenerArchivo;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.ImageIcon;

public class Options extends javax.swing.JFrame {

    public Button_design controller;

    public Options() {
        initComponents();
        color();
        fuente();
        //Icono
        setIconImage(new ImageIcon(getClass().getResource("/logo.png")).getImage());
        //centrar el jframe
        this.setLocationRelativeTo(null);
        //llamamos la clase Button_desing
        controller = new Button_design(this);
        //forzar el tamaño del jframe
        this.setSize(1000, 600);

        //desabilitamos sub menus
        menu_employee.setVisible(false);
        menu_sale.setVisible(false);
        menu_graph.setVisible(false);
        menu_file.setVisible(false);

        //tipo de cursor
        button_employee.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgound = new javax.swing.JPanel();
        sub_panel = new javax.swing.JPanel();
        sub_tittle = new javax.swing.JLabel();
        menu_employee = new javax.swing.JPanel();
        panel_add_employee = new javax.swing.JPanel();
        button_add_employee = new javax.swing.JButton();
        panel_eliminate_employee = new javax.swing.JPanel();
        button_eliminate_employee = new javax.swing.JButton();
        menu_sale = new javax.swing.JPanel();
        panel_add_sale = new javax.swing.JPanel();
        button_add_sale = new javax.swing.JButton();
        panel_eliminate_sale = new javax.swing.JPanel();
        button_eliminate_sale = new javax.swing.JButton();
        menu_graph = new javax.swing.JPanel();
        panel_add_bar = new javax.swing.JPanel();
        button_add_bar = new javax.swing.JButton();
        panel_add_circle = new javax.swing.JPanel();
        button_add_circle = new javax.swing.JButton();
        menu_file = new javax.swing.JPanel();
        panel_add_file_employee = new javax.swing.JPanel();
        button_add_file_employee = new javax.swing.JButton();
        panel_add_file_sale = new javax.swing.JPanel();
        button_add_file_sale = new javax.swing.JButton();
        content = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        line = new javax.swing.JPanel();
        panel_employee = new javax.swing.JPanel();
        button_employee = new javax.swing.JButton();
        panel_sale = new javax.swing.JPanel();
        button_sale = new javax.swing.JButton();
        panel_graphique = new javax.swing.JPanel();
        button_graphique = new javax.swing.JButton();
        panel_see = new javax.swing.JPanel();
        button_see = new javax.swing.JButton();
        content_menu = new javax.swing.JPanel();
        tittle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backgound.setBackground(new java.awt.Color(255, 255, 255));
        backgound.setEnabled(false);
        backgound.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sub_panel.setBackground(new java.awt.Color(23, 93, 163));
        sub_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sub_tittle.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        sub_tittle.setForeground(new java.awt.Color(255, 255, 255));
        sub_tittle.setText("AUTOMOVILES DEL CARIBE SA");
        sub_panel.add(sub_tittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 670, 90));

        menu_employee.setBackground(new java.awt.Color(33, 122, 204));
        menu_employee.setLayout(new java.awt.GridLayout(1, 0));

        panel_add_employee.setBackground(new java.awt.Color(11, 61, 138));
        panel_add_employee.setLayout(new java.awt.BorderLayout());

        button_add_employee.setBackground(new java.awt.Color(11, 61, 138));
        button_add_employee.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        button_add_employee.setForeground(new java.awt.Color(255, 255, 255));
        button_add_employee.setText("Agregar Empleado");
        button_add_employee.setBorderPainted(false);
        button_add_employee.setContentAreaFilled(false);
        button_add_employee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_add_employee.setDefaultCapable(false);
        button_add_employee.setFocusPainted(false);
        button_add_employee.setPreferredSize(new java.awt.Dimension(152, 30));
        button_add_employee.setRequestFocusEnabled(false);
        button_add_employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_add_employeeActionPerformed(evt);
            }
        });
        panel_add_employee.add(button_add_employee, java.awt.BorderLayout.CENTER);

        menu_employee.add(panel_add_employee);

        panel_eliminate_employee.setBackground(new java.awt.Color(23, 93, 163));
        panel_eliminate_employee.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        panel_eliminate_employee.setLayout(new java.awt.BorderLayout());

        button_eliminate_employee.setBackground(new java.awt.Color(11, 61, 138));
        button_eliminate_employee.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        button_eliminate_employee.setForeground(new java.awt.Color(255, 255, 255));
        button_eliminate_employee.setText("Eliminar Empleado");
        button_eliminate_employee.setBorderPainted(false);
        button_eliminate_employee.setContentAreaFilled(false);
        button_eliminate_employee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_eliminate_employee.setFocusPainted(false);
        button_eliminate_employee.setPreferredSize(new java.awt.Dimension(154, 30));
        button_eliminate_employee.setRequestFocusEnabled(false);
        button_eliminate_employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_eliminate_employeeActionPerformed(evt);
            }
        });
        panel_eliminate_employee.add(button_eliminate_employee, java.awt.BorderLayout.CENTER);

        menu_employee.add(panel_eliminate_employee);

        sub_panel.add(menu_employee, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 750, 30));

        menu_sale.setBackground(new java.awt.Color(33, 122, 204));
        menu_sale.setLayout(new java.awt.GridLayout(1, 0));

        panel_add_sale.setBackground(new java.awt.Color(11, 61, 138));
        panel_add_sale.setLayout(new java.awt.BorderLayout());

        button_add_sale.setBackground(new java.awt.Color(11, 61, 138));
        button_add_sale.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        button_add_sale.setForeground(new java.awt.Color(255, 255, 255));
        button_add_sale.setText("Agregar Venta");
        button_add_sale.setBorderPainted(false);
        button_add_sale.setContentAreaFilled(false);
        button_add_sale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_add_sale.setDefaultCapable(false);
        button_add_sale.setFocusPainted(false);
        button_add_sale.setPreferredSize(new java.awt.Dimension(152, 30));
        button_add_sale.setRequestFocusEnabled(false);
        button_add_sale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_add_saleActionPerformed(evt);
            }
        });
        panel_add_sale.add(button_add_sale, java.awt.BorderLayout.CENTER);

        menu_sale.add(panel_add_sale);

        panel_eliminate_sale.setBackground(new java.awt.Color(23, 93, 163));
        panel_eliminate_sale.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        panel_eliminate_sale.setLayout(new java.awt.BorderLayout());

        button_eliminate_sale.setBackground(new java.awt.Color(11, 61, 138));
        button_eliminate_sale.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        button_eliminate_sale.setForeground(new java.awt.Color(255, 255, 255));
        button_eliminate_sale.setText("Eliminar Venta");
        button_eliminate_sale.setBorderPainted(false);
        button_eliminate_sale.setContentAreaFilled(false);
        button_eliminate_sale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_eliminate_sale.setFocusPainted(false);
        button_eliminate_sale.setPreferredSize(new java.awt.Dimension(154, 30));
        button_eliminate_sale.setRequestFocusEnabled(false);
        button_eliminate_sale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_eliminate_saleActionPerformed(evt);
            }
        });
        panel_eliminate_sale.add(button_eliminate_sale, java.awt.BorderLayout.CENTER);

        menu_sale.add(panel_eliminate_sale);

        sub_panel.add(menu_sale, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 750, 30));

        menu_graph.setBackground(new java.awt.Color(33, 122, 204));
        menu_graph.setLayout(new java.awt.GridLayout(1, 0));

        panel_add_bar.setBackground(new java.awt.Color(11, 61, 138));
        panel_add_bar.setLayout(new java.awt.BorderLayout());

        button_add_bar.setBackground(new java.awt.Color(11, 61, 138));
        button_add_bar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        button_add_bar.setForeground(new java.awt.Color(255, 255, 255));
        button_add_bar.setText("Cantidad vendida/Marca de autos");
        button_add_bar.setBorderPainted(false);
        button_add_bar.setContentAreaFilled(false);
        button_add_bar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_add_bar.setDefaultCapable(false);
        button_add_bar.setFocusPainted(false);
        button_add_bar.setPreferredSize(new java.awt.Dimension(152, 30));
        button_add_bar.setRequestFocusEnabled(false);
        button_add_bar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_add_barActionPerformed(evt);
            }
        });
        panel_add_bar.add(button_add_bar, java.awt.BorderLayout.CENTER);

        menu_graph.add(panel_add_bar);

        panel_add_circle.setBackground(new java.awt.Color(23, 93, 163));
        panel_add_circle.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        panel_add_circle.setLayout(new java.awt.BorderLayout());

        button_add_circle.setBackground(new java.awt.Color(11, 61, 138));
        button_add_circle.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        button_add_circle.setForeground(new java.awt.Color(255, 255, 255));
        button_add_circle.setText("Total vendido/Marca de auto");
        button_add_circle.setBorderPainted(false);
        button_add_circle.setContentAreaFilled(false);
        button_add_circle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_add_circle.setFocusPainted(false);
        button_add_circle.setPreferredSize(new java.awt.Dimension(154, 30));
        button_add_circle.setRequestFocusEnabled(false);
        button_add_circle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_add_circleActionPerformed(evt);
            }
        });
        panel_add_circle.add(button_add_circle, java.awt.BorderLayout.CENTER);

        menu_graph.add(panel_add_circle);

        sub_panel.add(menu_graph, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 750, 30));

        menu_file.setBackground(new java.awt.Color(33, 122, 204));
        menu_file.setLayout(new java.awt.GridLayout(1, 0));

        panel_add_file_employee.setBackground(new java.awt.Color(11, 61, 138));
        panel_add_file_employee.setLayout(new java.awt.BorderLayout());

        button_add_file_employee.setBackground(new java.awt.Color(11, 61, 138));
        button_add_file_employee.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        button_add_file_employee.setForeground(new java.awt.Color(255, 255, 255));
        button_add_file_employee.setText("Registros de empleados");
        button_add_file_employee.setBorderPainted(false);
        button_add_file_employee.setContentAreaFilled(false);
        button_add_file_employee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_add_file_employee.setDefaultCapable(false);
        button_add_file_employee.setFocusPainted(false);
        button_add_file_employee.setPreferredSize(new java.awt.Dimension(152, 30));
        button_add_file_employee.setRequestFocusEnabled(false);
        button_add_file_employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_add_file_employeeActionPerformed(evt);
            }
        });
        panel_add_file_employee.add(button_add_file_employee, java.awt.BorderLayout.CENTER);

        menu_file.add(panel_add_file_employee);

        panel_add_file_sale.setBackground(new java.awt.Color(23, 93, 163));
        panel_add_file_sale.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        panel_add_file_sale.setLayout(new java.awt.BorderLayout());

        button_add_file_sale.setBackground(new java.awt.Color(11, 61, 138));
        button_add_file_sale.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        button_add_file_sale.setForeground(new java.awt.Color(255, 255, 255));
        button_add_file_sale.setText("Registros de ventas");
        button_add_file_sale.setBorderPainted(false);
        button_add_file_sale.setContentAreaFilled(false);
        button_add_file_sale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_add_file_sale.setFocusPainted(false);
        button_add_file_sale.setPreferredSize(new java.awt.Dimension(154, 30));
        button_add_file_sale.setRequestFocusEnabled(false);
        button_add_file_sale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_add_file_saleActionPerformed(evt);
            }
        });
        panel_add_file_sale.add(button_add_file_sale, java.awt.BorderLayout.CENTER);

        menu_file.add(panel_add_file_sale);

        sub_panel.add(menu_file, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 750, 30));

        backgound.add(sub_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 750, 120));

        content.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cpu (1).png"))); // NOI18N

        jLabel1.setText("IMPULSANDO TUS METAS"); // NOI18N

        jLabel3.setText("Y ASPIRACIONES, VEHICULOS");

        jLabel4.setText("DE CALIDAD QUE VAN MAS ALLA");

        jLabel5.setText("DE LA MOVILIDAD, SON LA ");

        jLabel6.setText("ESENCIA DE LO QUE HACEMOS");

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        backgound.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 750, 450));

        menu.setBackground(new java.awt.Color(11, 61, 138));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        panel_employee.setBackground(new java.awt.Color(23, 93, 163));
        panel_employee.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        panel_employee.setLayout(new java.awt.BorderLayout());

        button_employee.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        button_employee.setForeground(new java.awt.Color(255, 255, 255));
        button_employee.setText("Empleados");
        button_employee.setBorderPainted(false);
        button_employee.setContentAreaFilled(false);
        button_employee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_employee.setFocusPainted(false);
        button_employee.setRequestFocusEnabled(false);
        button_employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_employeeActionPerformed(evt);
            }
        });
        panel_employee.add(button_employee, java.awt.BorderLayout.CENTER);

        menu.add(panel_employee, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 250, 40));

        panel_sale.setBackground(new java.awt.Color(23, 93, 163));
        panel_sale.setLayout(new java.awt.BorderLayout());

        button_sale.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        button_sale.setForeground(new java.awt.Color(255, 255, 255));
        button_sale.setText("Ventas");
        button_sale.setBorderPainted(false);
        button_sale.setContentAreaFilled(false);
        button_sale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_sale.setDefaultCapable(false);
        button_sale.setFocusPainted(false);
        button_sale.setRequestFocusEnabled(false);
        button_sale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_saleActionPerformed(evt);
            }
        });
        panel_sale.add(button_sale, java.awt.BorderLayout.CENTER);

        menu.add(panel_sale, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 250, 40));

        panel_graphique.setBackground(new java.awt.Color(23, 93, 163));
        panel_graphique.setLayout(new java.awt.BorderLayout());

        button_graphique.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        button_graphique.setForeground(new java.awt.Color(255, 255, 255));
        button_graphique.setText("Grafica");
        button_graphique.setBorderPainted(false);
        button_graphique.setContentAreaFilled(false);
        button_graphique.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_graphique.setDefaultCapable(false);
        button_graphique.setFocusPainted(false);
        button_graphique.setRequestFocusEnabled(false);
        button_graphique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_graphiqueActionPerformed(evt);
            }
        });
        panel_graphique.add(button_graphique, java.awt.BorderLayout.CENTER);

        menu.add(panel_graphique, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 250, 40));

        panel_see.setBackground(new java.awt.Color(23, 93, 163));
        panel_see.setLayout(new java.awt.BorderLayout());

        button_see.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        button_see.setForeground(new java.awt.Color(255, 255, 255));
        button_see.setText("Ver archivos");
        button_see.setBorderPainted(false);
        button_see.setContentAreaFilled(false);
        button_see.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_see.setDefaultCapable(false);
        button_see.setFocusPainted(false);
        button_see.setRequestFocusEnabled(false);
        button_see.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_seeActionPerformed(evt);
            }
        });
        panel_see.add(button_see, java.awt.BorderLayout.CENTER);

        menu.add(panel_see, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 250, 40));

        content_menu.setBackground(new java.awt.Color(11, 61, 138));
        content_menu.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 30));

        tittle.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        tittle.setForeground(new java.awt.Color(255, 255, 255));
        tittle.setText("Menú");
        content_menu.add(tittle);

        menu.add(content_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 60));

        backgound.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        getContentPane().add(backgound, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    void color() {
        jLabel1.setForeground(new Color(11, 61, 138));
        jLabel2.setForeground(new Color(11, 61, 138));
        jLabel3.setForeground(new Color(11, 61, 138));
        jLabel4.setForeground(new Color(11, 61, 138));
        jLabel5.setForeground(new Color(11, 61, 138));
        jLabel6.setForeground(new Color(11, 61, 138));
    }
    //La subrutina fuete modifica la fuente de las jLabels
    void fuente() {
        jLabel1.setFont(new Font("verdana", Font.BOLD, 18));
        jLabel2.setFont(new Font("verdana", Font.BOLD, 18));
        jLabel3.setFont(new Font("verdana", Font.BOLD, 18));
        jLabel4.setFont(new Font("verdana", Font.BOLD, 18));
        jLabel5.setFont(new Font("verdana", Font.BOLD, 18));
        jLabel6.setFont(new Font("verdana", Font.BOLD, 18));
    }    
    //Se llama a un JFrame dependiendo de que boton pulse
    //Para todos es el mismo funcionamiento
    private void button_employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_employeeActionPerformed
  
        //color predeterminado de los botones del sub_menu
        controller.changeAparence(panel_add_employee, new Color(11, 61, 138));
        controller.changeAparence(panel_eliminate_employee, new Color(23, 93, 163));
        //reinicio la activacion de los botones
        controller.add_e = true;
        controller.eliminate_e = false;

        //agrega el panel al jframe
        add_employee window = new add_employee();
        showPanel(window.panel_add_employee, content);
        //invisibiliza otros botones
        menu_employee.setVisible(true);
        menu_graph.setVisible(false);
        menu_file.setVisible(false);
        menu_sale.setVisible(false);
        //Titulos al seleccionar el boton
        sub_tittle.setFont(new Font ("SansSerif", Font.BOLD, 24));
        sub_tittle.setText("ADMINISTRACION DE EMPLEADOS");
    }//GEN-LAST:event_button_employeeActionPerformed

    private void button_saleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_saleActionPerformed
        controller.changeAparence(panel_add_sale, new Color(11, 61, 138));
        controller.changeAparence(panel_eliminate_sale, new Color(23, 93, 163));

        controller.add_s = true;
        controller.eliminate_s = false;

        add_sale window = new add_sale();
        showPanel(window.panel_add_sale, content);
        menu_employee.setVisible(false);
        menu_graph.setVisible(false);
        menu_file.setVisible(false);
        menu_sale.setVisible(true);
        sub_tittle.setFont(new Font ("SansSerif", Font.BOLD, 24));
        sub_tittle.setText("ADMINISTRACION DE VENTAS");
    }//GEN-LAST:event_button_saleActionPerformed

    private void button_graphiqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_graphiqueActionPerformed
        controller.changeAparence(panel_add_bar, new Color(11, 61, 138));
        controller.changeAparence(panel_add_circle, new Color(23, 93, 163));
        controller.add_b = true;
        controller.add_c = false;

        bar_graph window = new bar_graph();
        showPanel(window.panel_bard, content);
        int precio[] = new int[100];
        window.diagrama_barras(precio);
        menu_employee.setVisible(false);
        menu_sale.setVisible(false);
        menu_file.setVisible(false);
        menu_graph.setVisible(true);
        sub_tittle.setFont(new Font ("SansSerif", Font.BOLD, 24));
        sub_tittle.setText("GRAFICAS-RELACIONES");
    }//GEN-LAST:event_button_graphiqueActionPerformed

    private void button_seeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_seeActionPerformed
        controller.changeAparence(panel_add_file_employee, new Color(11, 61, 138));
        controller.changeAparence(panel_add_file_sale, new Color(23, 93, 163));

        controller.add_file_e = true;
        controller.add_file_s = false;

        file_employee window = new file_employee();
        showPanel(window.panel_file_employee, content);
        menu_file.setVisible(true);
        menu_employee.setVisible(false);
        menu_sale.setVisible(false);
        menu_graph.setVisible(false);
        sub_tittle.setFont(new Font ("SansSerif", Font.BOLD, 22));
        sub_tittle.setText("VISUALIZAR ARCHIVO DE EMPLEADOS Y VENTAS");
        
        //vizualizar archivo empleado en tabla
        String[][] registre_employee = ObtenerArchivo("Empleados.txt");
        window.table(registre_employee);

    }//GEN-LAST:event_button_seeActionPerformed
    //Se cambia el JFrame dependiendo si es empleados o ventas en cada una de la opciones del menu
    private void button_add_employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_add_employeeActionPerformed
        //cambio de color de color del boton al seleccionar
        add_employee window = new add_employee();
        showPanel(window.panel_add_employee, content);

    }//GEN-LAST:event_button_add_employeeActionPerformed

    private void button_eliminate_employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_eliminate_employeeActionPerformed
        eliminate_employee window = new eliminate_employee();
        showPanel(window.panel_eliminate_employee, content);

    }//GEN-LAST:event_button_eliminate_employeeActionPerformed

    private void button_add_saleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_add_saleActionPerformed
        add_sale window = new add_sale();
        showPanel(window.panel_add_sale, content);
    }//GEN-LAST:event_button_add_saleActionPerformed

    private void button_eliminate_saleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_eliminate_saleActionPerformed
        eliminate_sale window = new eliminate_sale();
        showPanel(window.panel_eliminate_sale, content);
    }//GEN-LAST:event_button_eliminate_saleActionPerformed
    //Para el caso de las graficas se hace lo mismo, solo que se importa la subrutina de crear la grafica para que pueda ver en el main
    private void button_add_barActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_add_barActionPerformed
        bar_graph window = new bar_graph();
        showPanel(window.panel_bard, content);
        int precio[] = new int[100];
        window.diagrama_barras(precio);
    }//GEN-LAST:event_button_add_barActionPerformed

    private void button_add_circleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_add_circleActionPerformed
        circle_graph window = new circle_graph();
        showPanel(window.panel_circle, content);
        int cant[] = new int[100];
        window.diagrama_circulo(cant);
    }//GEN-LAST:event_button_add_circleActionPerformed

    private void button_add_file_employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_add_file_employeeActionPerformed
        file_employee window = new file_employee();
        showPanel(window.panel_file_employee, content);
        String[][] registre_employee = ObtenerArchivo("Empleados.txt");
        window.table(registre_employee);
    }//GEN-LAST:event_button_add_file_employeeActionPerformed

    private void button_add_file_saleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_add_file_saleActionPerformed
        file_sale window = new file_sale();
        showPanel(window.panel_file_sale, content);
        String[][] registre_employee = ObtenerArchivo("Ventas.txt");
        window.table(registre_employee);
    }//GEN-LAST:event_button_add_file_saleActionPerformed
    //importa Jpanel de otro Jframe para mostrarlo en pantalla
    public static void showPanel(JPanel panel, JPanel screen) {
        panel.setSize(750, 450);
        panel.setLocation(0, 0);
        screen.removeAll();
        screen.add(panel, BorderLayout.CENTER);
        screen.revalidate();
        screen.repaint();
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
    public javax.swing.JButton button_add_bar;
    public javax.swing.JButton button_add_circle;
    public javax.swing.JButton button_add_employee;
    public javax.swing.JButton button_add_file_employee;
    public javax.swing.JButton button_add_file_sale;
    public javax.swing.JButton button_add_sale;
    public javax.swing.JButton button_eliminate_employee;
    public javax.swing.JButton button_eliminate_sale;
    public javax.swing.JButton button_employee;
    public javax.swing.JButton button_graphique;
    public javax.swing.JButton button_sale;
    public javax.swing.JButton button_see;
    public static javax.swing.JPanel content;
    private javax.swing.JPanel content_menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel line;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menu_employee;
    private javax.swing.JPanel menu_file;
    private javax.swing.JPanel menu_graph;
    private javax.swing.JPanel menu_sale;
    public javax.swing.JPanel panel_add_bar;
    public javax.swing.JPanel panel_add_circle;
    public javax.swing.JPanel panel_add_employee;
    public javax.swing.JPanel panel_add_file_employee;
    public javax.swing.JPanel panel_add_file_sale;
    public javax.swing.JPanel panel_add_sale;
    public javax.swing.JPanel panel_eliminate_employee;
    public javax.swing.JPanel panel_eliminate_sale;
    public javax.swing.JPanel panel_employee;
    public javax.swing.JPanel panel_graphique;
    public javax.swing.JPanel panel_sale;
    public javax.swing.JPanel panel_see;
    private javax.swing.JPanel sub_panel;
    private javax.swing.JLabel sub_tittle;
    private javax.swing.JLabel tittle;
    // End of variables declaration//GEN-END:variables

}
