
package mx.uam.ayd.SistemaAbarrotesLalo.negocio;

import java.sql.SQLException;
import java.util.ArrayList;
import mx.uam.ayd.SistemaAbarrotesLalo.modelo.Proveedor;
import mx.uam.ayd.SistemaAbarrotesLalo.persistencia.DAOProveedor;

/**
 *Esta clase realza las reglas y los procesos de negocio de la entidad ptoveedor
 * @author lalo
 */
public class ServicioProveedor {
    
    DAOProveedor daoProveedores=new DAOProveedor();
    Proveedor agregaProveedor;
    /**
     *Este metodo recupera todos los nombres proovedores de la base de datos
     * @return
     * @throws SQLException
     */
    public ArrayList<String> recuperarProveedores() throws SQLException {
        ArrayList <String> listaprovedores=new  ArrayList <String>();
        listaprovedores=daoProveedores.recuperaProveedores();
        return listaprovedores;
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
       agregaProveedor=daoProveedores.agregaProveedor(id, proveedor, telefono, nombre, tipo);
       return agregaProveedor;
    }
    
}
