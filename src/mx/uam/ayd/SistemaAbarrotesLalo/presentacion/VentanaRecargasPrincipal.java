package mx.uam.ayd.SistemaAbarrotesLalo.presentacion;

/**
 *
 * @author Nallely
 */
public class VentanaRecargasPrincipal extends javax.swing.JFrame {
  listener listener1= new listener();
ControlRecargas controlRecargas1=new ControlRecargas();
    /**
     * Creates new form VentanaRecargasPrincipal
     * @param controlRecargas1
     */
    public VentanaRecargasPrincipal(ControlRecargas controlRecargas1) {
        this.controlRecargas1=controlRecargas1;
        addWindowListener(listener1);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonAgregarCompañia = new javax.swing.JButton();
        jButtonRegistrarRecargas = new javax.swing.JButton();
        jButtonEliminarCompañia = new javax.swing.JButton();
        jButtonModificarCompañia = new javax.swing.JButton();
        jButtonVolverAlMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("Recargas telefónicas");

        jButtonAgregarCompañia.setText("Agregar compañia telefonica");
        jButtonAgregarCompañia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarCompañiaActionPerformed(evt);
            }
        });

        jButtonRegistrarRecargas.setText("Registrar recargas");
        jButtonRegistrarRecargas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarRecargasActionPerformed(evt);
            }
        });

        jButtonEliminarCompañia.setText("Eliminar compañia telefonica");
        jButtonEliminarCompañia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarCompañiaActionPerformed(evt);
            }
        });

        jButtonModificarCompañia.setText("Modificar compañia telefonica");
        jButtonModificarCompañia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarCompañiaActionPerformed(evt);
            }
        });

        jButtonVolverAlMenu.setText("Volver al menú");
        jButtonVolverAlMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverAlMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonRegistrarRecargas, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButtonAgregarCompañia)
                        .addGap(35, 35, 35)
                        .addComponent(jButtonModificarCompañia))
                    .addComponent(jLabel1))
                .addGap(40, 40, 40)
                .addComponent(jButtonEliminarCompañia)
                .addGap(0, 34, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonVolverAlMenu)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegistrarRecargas, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAgregarCompañia, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonModificarCompañia, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEliminarCompañia, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jButtonVolverAlMenu)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>                        

    private void jButtonAgregarCompañiaActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        dispose();
        controlRecargas1.AgregarCompañia();
    }                                                      

    private void jButtonRegistrarRecargasActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        dispose();
        controlRecargas1.RegistrarRecarga();
    }                                                        

    private void jButtonEliminarCompañiaActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        // TODO add your handling code here:
    }                                                       

    private void jButtonModificarCompañiaActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        // TODO add your handling code here:
    }                                                        

    private void jButtonVolverAlMenuActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        dispose();
       controlRecargas1.finalizaControl();
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
            java.util.logging.Logger.getLogger(VentanaRecargasPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRecargasPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRecargasPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRecargasPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /* java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
        new VentanaRecargasPrincipal().setVisible(true);
        }
        //</editor-fold>

        /* Create and display the form */
        /* java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
        new VentanaRecargasPrincipal().setVisible(true);
        }
        //</editor-fold>

        /* Create and display the form */
        /* java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
        new VentanaRecargasPrincipal().setVisible(true);
        }
        //</editor-fold>

        /* Create and display the form */
        /* java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
        new VentanaRecargasPrincipal().setVisible(true);
        }
        });*/
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButtonAgregarCompañia;
    private javax.swing.JButton jButtonEliminarCompañia;
    private javax.swing.JButton jButtonModificarCompañia;
    private javax.swing.JButton jButtonRegistrarRecargas;
    private javax.swing.JButton jButtonVolverAlMenu;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration   
  
}
