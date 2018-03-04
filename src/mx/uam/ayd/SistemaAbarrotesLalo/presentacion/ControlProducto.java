
package mx.uam.ayd.SistemaAbarrotesLalo.presentacion;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import mx.uam.ayd.SistemaAbarrotesLalo.modelo.Producto;
import mx.uam.ayd.SistemaAbarrotesLalo.negocio.ServicioProducto;

/**
 *
 * @author lalo
 */
public class ControlProducto {
    ServicioProducto servicioProducto1= new ServicioProducto(); 
    double precioProducto;
    Producto agregaProducto;
    Producto modificarProducto;
    /**
     *  Inicia el caso de uso agregar  producto
     */
    public void iniciaControlAgregarProducto() {
        VentanaAgregarProducto ventanaAgregarProducto = new VentanaAgregarProducto(this);
        ventanaAgregarProducto.setVisible(true);
    }

    /**
     * inicia el caso de uso modificar producto
     * @throws SQLException
     */
    public  void iniciaControlModificarProducto() throws SQLException {
        VentanaModificarProducto ventanaModificarProducto = new VentanaModificarProducto(this);
        ventanaModificarProducto.cargaComboBox();
        ventanaModificarProducto.setVisible(true);
    }

    /**
     * Inicia el caso de uso de consultar precio
     */
    public void iniciaControlConsultarProducto() {
       VentanaConsultaDePrecios ventanaConsultaPrecio= new VentanaConsultaDePrecios(this);
        ventanaConsultaPrecio.setVisible(true);
        
    }

    /**
     * Finaliza la ventana y regresa al menu principal
     */
    public void finalizaControl() {
        ControlPrincipal controlPrincipal1 = new ControlPrincipal();
        controlPrincipal1.iniciaControl();
    }

    /**
     * Parte del flujo principal de Modificar Productos
     */
    public void modificarDatosProducto(){
       VentanaModificarDatosProducto ventanaModificarDatosProducto= new VentanaModificarDatosProducto(this);
       ventanaModificarDatosProducto.setVisible(true);
   } 

    /**
     * Busca un producto usando su nombre
     * @param nombreProducto
     * @return 
     * @throws SQLException
     */
    public double buscarProducto(String nombreProducto) throws SQLException {
       precioProducto= servicioProducto1.buscaProducto(nombreProducto);
       return precioProducto;
    }
    

    /**
     * Agrega un producto dentro de la base de datos
     * @param id
     * @param nombre
     * @param caducidad
     * @param existencias
     * @param precio
     * @param marca
     * @return
     * @throws SQLException
     */
    public Producto agregarProducto(int id, String nombre, String caducidad, int existencias, double precio, String marca) throws SQLException {
       agregaProducto= servicioProducto1.agregarProducto(id, nombre, caducidad, existencias, precio, marca);
       return agregaProducto;
    }
    
   

    /**
     * LLena los datos del combo box 
     * @return
     * @throws SQLException
     */
    public ArrayList<String> llenaComboBox() throws SQLException{
        ArrayList<String> listaproductos=new ArrayList<String>();
        listaproductos= servicioProducto1.recuperarProductos();
        return listaproductos;
   }

    /**
     * Modifica los datos de un producto dentro de la base de datos
     * @param nombre
     * @return
     */
    public String modificarDatosProducto(String nombre) {
       VentanaModificarDatosProducto ventanaModificarDatosProducto= new VentanaModificarDatosProducto(this);
       ventanaModificarDatosProducto.nombre(nombre);
       ventanaModificarDatosProducto.setVisible(true);
       return nombre;
    }

    /**
     * Modifica todos los datos de un producto contenido dentro de la base de datos
     * @param id
     * @param nombre
     * @param caducidad
     * @param existencias
     * @param precio
     * @param marca
     * @return
     */
    public Producto modificarProducto(String id, String nombre, String caducidad, String existencias, String precio, String marca) {
       modificarProducto= servicioProducto1.modificarProducto(id, nombre, caducidad, existencias, precio, marca);
       return modificarProducto;
    }
 }