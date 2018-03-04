
package mx.uam.ayd.SistemaAbarrotesLalo.presentacion;

import java.sql.SQLException;
import java.util.ArrayList;
import mx.uam.ayd.SistemaAbarrotesLalo.modelo.Proveedor;
import mx.uam.ayd.SistemaAbarrotesLalo.negocio.ServicioProveedor;

/**
 *
 * @author lalo
 */
public class ControlProveedores {
    
    ServicioProveedor servicioProveedor1= new ServicioProveedor();
    Proveedor agregaProveedor;
    
    /**
     *
     */
    public void iniciaControlProveedores() {
        VentanaProveedores ventanaProveedores = new VentanaProveedores(this);
        ventanaProveedores.setVisible(true);
    }

    void iniciaControlAgregarProveedor() {
       VentanaAgregarProveedor ventanaAgregarProveedor= new VentanaAgregarProveedor(this);
       ventanaAgregarProveedor.setVisible(true);
    }

    void iniciaControlConsultarProveedor() throws SQLException {
       VentanaConsultaProveedor ventanaConsultarProveedor= new VentanaConsultaProveedor(this);
       ventanaConsultarProveedor.setVisible(true);
    }

    void iniciaControlModificarProveedor() {
       VentanaModificaProveedor ventanaModificaProveedor= new VentanaModificaProveedor(this);
       ventanaModificaProveedor.setVisible(true);
    }

    /**
     *
     */
    public void finalizaControl() {
        ControlPrincipal controlPrincipal1 = new ControlPrincipal();
        controlPrincipal1.iniciaControl();
    }
    
    /**
     *
     */
    public void mostrarResultadoConsulta(){
        VentanaConsultarProveedorResultado ventanaConsultarProveedorResultado= new VentanaConsultarProveedorResultado(this);
        ventanaConsultarProveedorResultado.setVisible(true);
    }
    
    /**
     *
     */
    public void modificarDatosProveedor(){
       VentanaModificaDatosProveedor  ventanaModificaDatosProveedor= new VentanaModificaDatosProveedor(this);
       ventanaModificaDatosProveedor.setVisible(true);
    }

    /**
     *
     * @param id
     * @param proveedor
     * @param telefono
     * @param nombre
     * @param tipo
     * @return
     * @throws SQLException
     */
    public Proveedor agregarProveedor(int id, String proveedor, String telefono, String nombre, String tipo) throws SQLException {
       agregaProveedor= servicioProveedor1.agregarProveedor(id, proveedor, telefono, nombre, tipo);
       return agregaProveedor;
    }

    ArrayList<String> llenaComboBox() throws SQLException {
        ArrayList<String> listaproveedores1=new ArrayList<String>();
        listaproveedores1= servicioProveedor1.recuperarProveedores();
        return listaproveedores1;
    }
    
    /**
     *
     * @param nombre
     * @return
     */
    public String mostrarResultadoConsulta(String nombre){
        VentanaConsultarProveedorResultado ventanaConsultarProveedorResultado= new VentanaConsultarProveedorResultado(this);
        ventanaConsultarProveedorResultado.nombre(nombre);
        ventanaConsultarProveedorResultado.setVisible(true);
        return nombre;
    }

    
}
