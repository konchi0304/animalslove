/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectoaula.view;

/**
 *
 * @author aylee
 */
public class registroCuenta extends javax.swing.JFrame {

    /**
     * Creates new form registroCuenta
     */
    public registroCuenta() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel62 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel65 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        btnContratar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel66 = new javax.swing.JLabel();
        txtApellidos1 = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        txtCorreo1 = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel64 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        txtNombre2 = new javax.swing.JTextField();
        txtTelefono1 = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("Direccion:*");
        jPanel1.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 260, 29));

        txtNombre.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setBorder(null);
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 280, 20));

        jSeparator9.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 280, 20));

        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("Apellido:*");
        jPanel1.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 230, 29));

        txtApellidos.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtApellidos.setForeground(new java.awt.Color(255, 255, 255));
        txtApellidos.setBorder(null);
        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApellidosKeyPressed(evt);
            }
        });
        jPanel1.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 280, 20));

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 280, 10));

        jSeparator10.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 280, 10));

        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("Tipo de documento:*");
        jPanel1.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 230, 29));

        jSeparator11.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 280, 10));

        btnContratar.setText("Contratar");
        btnContratar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContratarActionPerformed(evt);
            }
        });
        jPanel1.add(btnContratar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, 130, -1));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("Nombre*:");
        jPanel2.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 260, 29));

        txtNombre1.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtNombre1.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre1.setBorder(null);
        txtNombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombre1KeyPressed(evt);
            }
        });
        jPanel2.add(txtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 280, 20));

        jSeparator12.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 280, 20));

        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("Apellido:*");
        jPanel2.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 230, 29));

        txtApellidos1.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtApellidos1.setForeground(new java.awt.Color(255, 255, 255));
        txtApellidos1.setBorder(null);
        txtApellidos1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApellidos1KeyPressed(evt);
            }
        });
        jPanel2.add(txtApellidos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 280, 20));

        jSeparator13.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator13.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 280, 10));

        txtCorreo1.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtCorreo1.setForeground(new java.awt.Color(255, 255, 255));
        txtCorreo1.setBorder(null);
        txtCorreo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCorreo1KeyPressed(evt);
            }
        });
        jPanel2.add(txtCorreo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 280, 20));

        jSeparator14.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator14.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 280, 10));

        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("Nro Documento:*");
        jPanel2.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 230, 29));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText("Nombre de la mascota:*");
        jPanel1.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 260, 29));

        txtNombre2.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtNombre2.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre2.setBorder(null);
        txtNombre2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombre2KeyPressed(evt);
            }
        });
        jPanel1.add(txtNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 280, 20));

        txtTelefono1.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtTelefono1.setForeground(new java.awt.Color(255, 255, 255));
        txtTelefono1.setBorder(null);
        txtTelefono1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelefono1KeyPressed(evt);
            }
        });
        jPanel1.add(txtTelefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 280, 20));

        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("Telefono:*");
        jPanel1.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 230, 29));

        jComboBox1.setFont(new java.awt.Font("Tw Cen MT", 2, 17)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------------------------", "Cedula de ciudadania", "Tarjeta de identidad", "Cedula de extranjeria", "Pasaporte" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 170, 180, 30));

        jComboBox2.setFont(new java.awt.Font("Tw Cen MT", 2, 17)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------------------------", "Cedula de ciudadania", "Tarjeta de identidad", "Cedula de extranjeria", "Pasaporte" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 170, 180, 30));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----------------------", "Cedula", "Tarjeta de identidad", "Cedula de extranjeria", "Pasaporte" }));
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 160, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
        if (evt.getKeyCode() == evt.getKeyCode()) {
            txtNombre.requestFocus();
        }
    }//GEN-LAST:event_txtNombreKeyPressed

    private void txtApellidosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosKeyPressed

    private void btnContratarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContratarActionPerformed
        /*String nombre = txtNombre.getText();
        String apellidos = txtApellidos.getText();
        String correo = txtCorreo.getText();
        String telefono = txtTelefono.getText();
        String materia = (String) comboBoxMateria.getSelectedItem();

        if (nombre.isEmpty() || apellidos.isEmpty() || correo.isEmpty() || telefono.isEmpty() || materia == null) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            ProfesorDAO profesorDAO = new ProfesorDAO();

            LocalDate fechaContratacion = LocalDate.now();

            profesorDAO.contratarProfesor(nombre, apellidos, correo, telefono, fechaContratacion, materia);

            JOptionPane.showMessageDialog(this, "Profesor contratado exitosamente", "Exito", JOptionPane.INFORMATION_MESSAGE);

            limpiarCampos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al contratar al profesor: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }*/
    }//GEN-LAST:event_btnContratarActionPerformed

    private void txtNombre1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombre1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre1KeyPressed

    private void txtApellidos1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidos1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidos1KeyPressed

    private void txtCorreo1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreo1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreo1KeyPressed

    private void txtTelefono1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefono1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefono1KeyPressed

    private void txtNombre2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombre2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre2KeyPressed

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
            java.util.logging.Logger.getLogger(registroCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registroCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registroCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registroCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registroCuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContratar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtApellidos1;
    private javax.swing.JTextField txtCorreo1;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtNombre2;
    private javax.swing.JTextField txtTelefono1;
    // End of variables declaration//GEN-END:variables
}
