package mx.uam.ayd.SistemaAbarrotesLalo.presentacion;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author alumnocbi
 */
public class VentanaRecargas extends javax.swing.JFrame {
     listener listener1= new listener();
ControlRecargas controlRecargas1=new ControlRecargas();
LocalDate fechaActual = LocalDate.now();
    /**
     * Creates new form VentanaRecargas
     * @param controlRecargas1
     */
    public VentanaRecargas(ControlRecargas controlRecargas1) {
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
        jButtonAceptar = new javax.swing.JButton();
        jButtonVolverAlMenu = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldMonto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema Administrador de Abarrotes Lalo");

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("Recargas telefónicas");

        jButtonAceptar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jButtonVolverAlMenu.setText("Volver al menú");
        jButtonVolverAlMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverAlMenuActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("Monto de la recarga");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jTextFieldMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonVolverAlMenu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel1)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVolverAlMenu)
                    .addComponent(jButtonAceptar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {                                               
       int monto;
       String monto2;
       boolean estado, resultado=true;
        monto2=jTextFieldMonto.getText();
       estado=muestraError(RevisarFormato(monto2));
       if(estado==false){
           try {
               monto=Integer.parseInt(jTextFieldMonto.getText());
               resultado= controlRecargas1.AgregarRecarga(monto, fechaActual);
           } catch (SQLException ex) {
               Logger.getLogger(VentanaRecargas.class.getName()).log(Level.SEVERE, null, ex);
           }
         if(resultado==false){
           muestraError(4);  
         }else{
           jTextFieldMonto.setText("");
          JOptionPane.showMessageDialog(null, "La recarga se ha almacenado "
                  + "correctamente en la base de datos", "Recarga agregada", JOptionPane.INFORMATION_MESSAGE);    
         }
         
       } 
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
            java.util.logging.Logger.getLogger(VentanaRecargas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRecargas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRecargas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRecargas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /* java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
        new VentanaRecargas().setVisible(true);
        }
        //</editor-fold>

        /* Create and display the form */
        /* java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
        new VentanaRecargas().setVisible(true);
        }
        });*/
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonVolverAlMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldMonto;
    // End of variables declaration                   
 /**
     * Revisa que el monto dado por el usuario cumpla con los siguientes 
     * requisitos: Ser un numero entero, que la variable no sea nula.
     * Devuelve un numero que indica si no se cumplio con algun requisito.
     * @param nombre
     * @return estado
     */
    public int RevisarFormato(String monto) {
        int aux;
        double aux2;
        if (monto.isEmpty()){
            return 1;
        }
        try {
            aux = Integer.parseInt(monto);
            
        } catch (NumberFormatException ex) {
            return 2;
        }
     return 0;
    }

    /**
     * Muestra diferentes mensajes de error dependiendo el valor numerico que le
     * sea proporcionado por el metodo RevisarFormato. Devuelve un booleano, true
     * en caso de que se haya mostrado algun mensaje, false en caso contrario.
     * @param Formato
     * @return estado 
     */
    public boolean muestraError(int Formato) {
         if(Formato==1){
            JOptionPane.showMessageDialog(null, "Los datos estan incompletos", "No se puede agregar la recarga", JOptionPane.WARNING_MESSAGE);
            return true;
         }
          if(Formato==2){
            JOptionPane.showMessageDialog(null, "El monto de la recarga debe ser expresado por un numero entero", "No se puede agregar la recarga"
                    + "", JOptionPane.WARNING_MESSAGE);
            return true;
         }
           if(Formato==3){
           JOptionPane.showMessageDialog(null, "El monto de la recarga no puede ser expresado"
                   + " por un numero fraccionario", "No se puede agregar recarga", JOptionPane.WARNING_MESSAGE);
            return true;
         }
           if(Formato==4){
            JOptionPane.showMessageDialog(null, "La recarga no se ha almacenado correctamente en la base de datos", "No se puede agregar recarga", JOptionPane.WARNING_MESSAGE);
            return true;
         }
         return false;    
     }
