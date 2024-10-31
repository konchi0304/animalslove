/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectoaula;
import javax.swing.JOptionPane;

/**
 *
 * @author aylee
 */
public class loginProyecto extends javax.swing.JFrame {

    static final int vector = 20;
    static usuarios[] Users = new usuarios[vector];
   
    
    public loginProyecto() {
        initComponents();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        documento2 = new javax.swing.JTextField();
        mascota = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        crearCuenta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setText("BIENVENIDO A ");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel2.setText("VETERINARIA");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel3.setText("ANIMALSLOVE");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaula/aylen 200 x 200.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 600, 200));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        jLabel5.setText("Ingrese el nombre de la mascota:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        jLabel6.setText("Ingrese el documento de identidad:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        documento2.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        jPanel1.add(documento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 150, -1));

        mascota.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        jPanel1.add(mascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 150, -1));

        jButton1.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        jButton1.setText("INGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        jLabel4.setText("No tiene cuenta?");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, -1, 30));

        crearCuenta.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        crearCuenta.setText("Crear cuenta");
        crearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearCuentaActionPerformed(evt);
            }
        });
        jPanel1.add(crearCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            String documento = documento2.getText().trim();
            String mascota1 = mascota.getText().trim();
             usuarios User = new usuarios();
            int pos = Consultar(documento);
            System.out.print(pos);
          if(pos < 0){
                JOptionPane.showMessageDialog(null, "No tiene cuenta");
             } else{
                User.documento = documento;
                User.mascota = mascota1;
                JOptionPane.showMessageDialog(null, "Bienvenido");
                Inicio ingreso = new Inicio();
                ingreso.setVisible(true);
                this.setVisible(false);
            }
            
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void crearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearCuentaActionPerformed
        // TODO add your handling code here:
        crearCuenta crear =  new crearCuenta();
        crear.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_crearCuentaActionPerformed

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
            java.util.logging.Logger.getLogger(loginProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginProyecto().setVisible(true);
            }
        });
    }
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton crearCuenta;
    private javax.swing.JTextField documento2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField mascota;
    // End of variables declaration//GEN-END:variables

    private int Consultar(String documento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
