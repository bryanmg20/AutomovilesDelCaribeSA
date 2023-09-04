
package frame;

import static class_.File_sub.agregarRegistro;
import class_.button_employee;
import java.awt.Color;
import java.awt.Font;
import java.util.Date;



public class add_employee extends javax.swing.JFrame {
    public button_employee controller;
    public add_employee() {
        initComponents();
        //Envio el Jframe a la clase button_employee para personalizar los botones
        controller = new button_employee(this);
        //desaparece jlabels
        mensaje1.setVisible(false);
        mensaje2.setVisible(false);
        mensaje3.setVisible(false);
        mensaje4.setVisible(false);
        mensajet.setVisible(false);
        mensajesal.setVisible(false);
        datosinv.setVisible(false);
        mensajecedula.setVisible(false);
        color();
        fuente(); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_add_employee = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        mensaje2 = new javax.swing.JLabel();
        apellido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        mensaje3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        mensaje4 = new javax.swing.JLabel();
        cargo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        mensaje1 = new javax.swing.JLabel();
        mensajet = new javax.swing.JLabel();
        salario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        mensajesal = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fecha = new com.toedter.calendar.JDateChooser();
        datosinv = new javax.swing.JLabel();
        mensajecedula = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        panel_employee = new javax.swing.JPanel();
        b_agregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_add_employee.setBackground(new java.awt.Color(255, 255, 255));
        panel_add_employee.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Swis721 BlkEx BT", 1, 14)); // NOI18N
        jLabel1.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        jLabel1.setText("Nombre: ");
        panel_add_employee.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, 31));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("_________________________________");
        panel_add_employee.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 20));

        nombre.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });
        panel_add_employee.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 230, 20));

        mensaje2.setText("¡Ingresar unicamente letras en este campo!");
        panel_add_employee.add(mensaje2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 240, -1));

        apellido.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                apellidoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidoKeyTyped(evt);
            }
        });
        panel_add_employee.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 230, -1));

        jLabel2.setFont(new java.awt.Font("Swis721 BlkEx BT", 1, 14)); // NOI18N
        jLabel2.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        jLabel2.setText("Apellido:");
        panel_add_employee.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 270, 31));

        mensaje3.setText("¡Ingresar unicamente letras en este campo!");
        panel_add_employee.add(mensaje3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 290, 30));

        jLabel3.setFont(new java.awt.Font("Swis721 BlkEx BT", 1, 14)); // NOI18N
        jLabel3.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        jLabel3.setText("Cedula:");
        panel_add_employee.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 90, 31));

        cedula.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaActionPerformed(evt);
            }
        });
        cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cedulaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaKeyTyped(evt);
            }
        });
        panel_add_employee.add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 230, 20));

        mensaje4.setText("¡Ingresar unicamente numeros en este campo!");
        panel_add_employee.add(mensaje4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 260, -1));

        cargo.setBackground(new java.awt.Color(203, 229, 250));
        cargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VENDEDOR", "ASESOR DE VENTAS", "GERENTE DE VENTAS" }));
        cargo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargoActionPerformed(evt);
            }
        });
        cargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cargoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cargoKeyTyped(evt);
            }
        });
        panel_add_employee.add(cargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 200, 30));

        jLabel4.setFont(new java.awt.Font("Swis721 BlkEx BT", 1, 14)); // NOI18N
        jLabel4.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        jLabel4.setText("Cargo:");
        panel_add_employee.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 290, 31));

        jLabel5.setFont(new java.awt.Font("Swis721 BlkEx BT", 1, 14)); // NOI18N
        jLabel5.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        jLabel5.setText("Telefono:");
        panel_add_employee.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 160, 31));

        telefono.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                telefonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonoKeyTyped(evt);
            }
        });
        panel_add_employee.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 230, 20));

        mensaje1.setText("El telefono debe comenzar por 3");
        panel_add_employee.add(mensaje1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 180, -1));

        mensajet.setText("¡Ingresar unicamente numeros en este campo!");
        panel_add_employee.add(mensajet, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 280, -1));

        salario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        salario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salarioActionPerformed(evt);
            }
        });
        salario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                salarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                salarioKeyTyped(evt);
            }
        });
        panel_add_employee.add(salario, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 230, 20));

        jLabel7.setFont(new java.awt.Font("Swis721 BlkEx BT", 1, 14)); // NOI18N
        jLabel7.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        jLabel7.setText("Salario:");
        panel_add_employee.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 290, 31));

        mensajesal.setText("¡Ingresar unicamente numeros en este campo!");
        panel_add_employee.add(mensajesal, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 280, -1));

        jLabel6.setFont(new java.awt.Font("Swis721 BlkEx BT", 1, 14)); // NOI18N
        jLabel6.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        jLabel6.setText("Fecha de ingreso:");
        panel_add_employee.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 200, 31));
        panel_add_employee.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 160, 30));

        datosinv.setText("¡DATOS INVALIDOS!");
        panel_add_employee.add(datosinv, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, -1, 20));

        mensajecedula.setText("!YA EXISTE EL EMPLEADO!");
        panel_add_employee.add(mensajecedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, -1, -1));

        jLabel9.setText("_________________________________");
        panel_add_employee.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel10.setText("_________________________________");
        panel_add_employee.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel11.setText("_________________________________");
        panel_add_employee.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 260, 20));

        jLabel12.setText("_________________________________");
        jLabel12.setToolTipText("");
        panel_add_employee.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 270, -1));

        panel_employee.setBackground(new java.awt.Color(23, 93, 163));
        panel_employee.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        panel_employee.setLayout(new java.awt.BorderLayout());

        b_agregar.setBackground(new java.awt.Color(23, 93, 163));
        b_agregar.setForeground(new java.awt.Color(255, 255, 255));
        b_agregar.setText("Agregar empleado");
        b_agregar.setBorderPainted(false);
        b_agregar.setContentAreaFilled(false);
        b_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_agregarActionPerformed(evt);
            }
        });
        panel_employee.add(b_agregar, java.awt.BorderLayout.CENTER);

        panel_add_employee.add(panel_employee, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 180, 28));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_add_employee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_add_employee, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Se crea una funcion la cual esta encargada de habilitar o deshabilitar un boton
    public void botonagregar() {
        //Se verifica si todos los campos estan llenos, de ser asi se habilita el boton de agregar
        if (!nombre.getText().isEmpty() && !apellido.getText().isEmpty() && !cedula.getText().isEmpty() && !telefono.getText().isEmpty() && !salario.getText().isEmpty()) {
            b_agregar.setEnabled(true);
            //En caso de que algun campo este vacio, entonces el boton no se habilitará
        } else {
            b_agregar.setEnabled(false);
        }
    }
    //La subrutina color esta encargada de cambiar el color del texto de varios JLabel
    void color() {
        jLabel1.setForeground(new Color(11, 61, 138));
        jLabel2.setForeground(new Color(11, 61, 138));
        jLabel3.setForeground(new Color(11, 61, 138));
        jLabel4.setForeground(new Color(11, 61, 138));
        jLabel5.setForeground(new Color(11, 61, 138));
        jLabel6.setForeground(new Color(11, 61, 138));
        jLabel7.setForeground(new Color(11, 61, 138));
    }
    //La subrutina fuete modifica la fuente de las jLabels
    void fuente() {
        jLabel1.setFont(new Font("verdana", Font.BOLD, 14));
        jLabel2.setFont(new Font("verdana", Font.BOLD, 14));
        jLabel3.setFont(new Font("verdana", Font.BOLD, 14));
        jLabel4.setFont(new Font("verdana", Font.BOLD, 14));
        jLabel5.setFont(new Font("verdana", Font.BOLD, 14));
        jLabel6.setFont(new Font("verdana", Font.BOLD, 14));
        jLabel7.setFont(new Font("verdana", Font.BOLD, 14));
    }
    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed

    }//GEN-LAST:event_nombreActionPerformed
    //La funcion botonagregar() se llama dentro de "nombreKeyReleased"
    private void nombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyReleased
        //Se utiliza para actualizar el estado del boton agregar en funcion del contedio del campo de texto nombre
        botonagregar();
    }//GEN-LAST:event_nombreKeyReleased

    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped
        //Se obtiene el codigo de la tecla correspondiente al caracter ingresado por el usuario
        int key = evt.getKeyChar(); // devuelve el caracter que se presionó como un valor entero
       // se verifica si el caracter ingresado es una letra minuscula o mayuscula
        boolean minusculas = key >= 97 && key <= 122;
        boolean mayusculas = key >= 65 && key <= 90;
        //Se utiliza este metodo para verificar si lo ingresado es un caracter de control (backspace).
        boolean carac = Character.isISOControl(key); 
        // se verifica si el caracter ingresado no es letra miniscula, mayuscula ni un caracter de control.
        if (!(minusculas || mayusculas || carac)) {
            mensaje2.setVisible(true); //se hace visible el mensaje de error
            evt.consume();//Se consume el evento de tecla para evitar que el caracter no valido se muestre en el campo de texto.
        // si el caracter ingresado es una letra minuscula, mayuscula o un caracter de control, se oculta el mensaje de error.
        } else {
            mensaje2.setVisible(false);
        }
    }//GEN-LAST:event_nombreKeyTyped
    //Se realizan los mismos eventos anteriores
    private void apellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidoKeyReleased
        botonagregar();
    }//GEN-LAST:event_apellidoKeyReleased
    
    private void apellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidoKeyTyped
        int key = evt.getKeyChar();
        boolean minusculas = key >= 97 && key <= 122;
        boolean mayusculas = key >= 65 && key <= 90;
        boolean carac = Character.isISOControl(key);
        if (!(minusculas || mayusculas || carac)) {
            mensaje3.setVisible(true);
            evt.consume();
        } else {
            mensaje3.setVisible(false);
        }
    }//GEN-LAST:event_apellidoKeyTyped

    private void cedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaKeyReleased
        botonagregar();
    }//GEN-LAST:event_cedulaKeyReleased
    //Esta funcion se activa cuando el usuario presiona una tecla en un campo de texto
    private void cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaKeyTyped
        //Se obtiene el codigo de la tecla presionada por el usarui y se almacena en una variable.
        int key = evt.getKeyChar();
        //Se verifica si el caracter ingresado es un numero.
        boolean numeros = key >= 48 && key <= 57;
        //Se verifica si el caracter ingresado es un caracter de control.
        boolean carac = Character.isISOControl(key);
       //Se verifica si el caracter ingresado no es un numero ni un caracter de control
        if (!(numeros || carac)) {
            mensaje4.setVisible(true); //se hace visible el mensaje de error.
            evt.consume(); //Esto impide que el caracter incorrecto aparezca en el campo de texto.
       // si el caracter ingresado es un numero o un caracter de control, se ejecuta el codigo dentro del else
        } else {
            mensaje4.setVisible(false); //se oculta el mensaje de error
        }
        //Se almacena el texto actual en una variable
        String textoActual = cedula.getText();
        // se verifica si la longitud es mayor o igual a 10 caracteres
        if (textoActual.length() >= 10) {
            evt.consume(); //Se evita que el usuario pueda ingresar mas de 10 caracteres en el campo
        }
    }//GEN-LAST:event_cedulaKeyTyped

    private void cargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cargoActionPerformed

    private void cargoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cargoKeyReleased
        botonagregar();
    }//GEN-LAST:event_cargoKeyReleased

    private void cargoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cargoKeyTyped

    }//GEN-LAST:event_cargoKeyTyped
    //se realiza lo mismo del evento de la cedula
    private void telefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoKeyReleased
        botonagregar();
    }//GEN-LAST:event_telefonoKeyReleased

    private void telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        boolean carac = Character.isISOControl(key);
        String textoActual = telefono.getText();
        if (textoActual.length() == 0 && key != '3' || carac) {
            mensaje1.setVisible(true);
            evt.consume();
        } else {
            mensaje1.setVisible(false);
            if (!(numeros || carac)) {
                mensajet.setVisible(true);
                evt.consume();
            } else {
                mensajet.setVisible(false);
            }
        }
        if (textoActual.length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_telefonoKeyTyped

    private void salarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salarioActionPerformed

    }//GEN-LAST:event_salarioActionPerformed
    //se realiza lo mismo del evento de la cedula
    private void salarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_salarioKeyReleased
        botonagregar();
    }//GEN-LAST:event_salarioKeyReleased

    private void salarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_salarioKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        boolean carac = Character.isISOControl(key);
        if (!(numeros || carac)) {
            mensajesal.setVisible(true);
            evt.consume();
        } else {
            mensajesal.setVisible(false);
        }
        String textoact = salario.getText();
        if (textoact.length() >= 9) {
            evt.consume();
        }
    }//GEN-LAST:event_salarioKeyTyped
    //Se activa cuando se hace click sobre el boton agregar
    private void b_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_agregarActionPerformed
        //Se crea un arreglo de cadenas
        String aux[] = new String[100];
        //Se almacenan los valores ingresados por el usuario
        aux[0] = nombre.getText().toUpperCase();
        aux[1] = apellido.getText().toUpperCase();
        aux[2] = cedula.getText();
        aux[3] = cargo.getSelectedItem().toString();
        aux[4] = telefono.getText();
        Date pr = fecha.getDate(); //El campo coorrespondite a fecha se obtiene desde la libreria Jcalendar 
        //lo ingresado se guarda en un objeto de tipo Date 
        aux[6] = salario.getText();
        //Se verifica si la fecha no esta vacia, y si la longitud de los demas campos es correcta
        if (pr == null || cedula.getText().length() != 10 || telefono.getText().length() != 10 || salario.getText().length() < 7) {
            //Si alguna condicion no se cumple, se hace visible el mensaje "datosinv"
            datosinv.setVisible(true); //Indica que el usuario ingreso informacion incompleta
        } else {
            //Si todas las validaciones se cumplen, se ocultan los mensajes que se estaban mostrando anteriormente
            datosinv.setVisible(false);
            mensaje1.setVisible(false);
            mensaje2.setVisible(false);
            mensaje3.setVisible(false);
            mensaje4.setVisible(false);
            mensajet.setVisible(false);
            mensajesal.setVisible(false);
            //Se borra el contenido de todos los campos de entrada
            cedula.setText(null);
            apellido.setText(null);
            cedula.setText(null);
            telefono.setText(null);
            salario.setText(null);
            nombre.setText(null);
            fecha.setDate(null);
            //Se convierte la fecha seleccionada en string y se almacena en una variabke
            aux[5] = String.valueOf(pr);
            String[] campos_fecha = aux[5].split(" ");
            aux[5] = campos_fecha[2] + "-" + campos_fecha[1].toUpperCase() + "-" + campos_fecha[5];
            //Se llama a la funcion agregarRegistro para agregar la informacion al archivo empleados.txt.
            agregarRegistro(aux, "Empleados.txt", mensajecedula);
            //Se escriben toda la informacion en el archivo.
        }
    }//GEN-LAST:event_b_agregarActionPerformed

    private void cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaActionPerformed

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
            java.util.logging.Logger.getLogger(add_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellido;
    public javax.swing.JButton b_agregar;
    private javax.swing.JComboBox<String> cargo;
    private javax.swing.JTextField cedula;
    private javax.swing.JLabel datosinv;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel mensaje1;
    private javax.swing.JLabel mensaje2;
    private javax.swing.JLabel mensaje3;
    private javax.swing.JLabel mensaje4;
    private javax.swing.JLabel mensajecedula;
    private javax.swing.JLabel mensajesal;
    private javax.swing.JLabel mensajet;
    private javax.swing.JTextField nombre;
    public javax.swing.JPanel panel_add_employee;
    public javax.swing.JPanel panel_employee;
    private javax.swing.JTextField salario;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
