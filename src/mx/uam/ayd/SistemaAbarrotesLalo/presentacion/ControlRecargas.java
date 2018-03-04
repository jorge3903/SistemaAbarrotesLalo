
package mx.uam.ayd.SistemaAbarrotesLalo.presentacion;

/**
 *
 * @author lalo
 */
public class ControlRecargas {

    /**
     * Abre la ventana para ingresar recargas
     */
    public void iniciaControlRecargas() {
       VentanaRecargas ventanaRecargas= new VentanaRecargas(this);
       ventanaRecargas.setVisible(true);
    }

    /** 
     *  Cierra la ventana y vuelve a la principal
     */
    public void finalizaControl() {
       ControlPrincipal controlPrincipal1 = new ControlPrincipal();
        controlPrincipal1.iniciaControl();
    }
    
}
