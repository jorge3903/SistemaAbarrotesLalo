package mx.uam.ayd.SistemaAbarrotesLalo.persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import mx.uam.ayd.SistemaAbarrotesLalo.modelo.Proveedor;

/**
 *Esta clase se encarga da la recuperacion y almacenamiento de datos de la entidad Proveedor
 * @author lalo
 */
public class DAOProveedor {
    conexion BaseDeDatos=new conexion();
    Proveedor agregaProveedor;
    /**
     *Este metodo recupera todos los proovedores de la base de datos
     * @return
     * @throws SQLException
     */
    public ArrayList<String> recuperaProveedores() throws SQLException {
        ArrayList<String> lista=new ArrayList<String>();
        BaseDeDatos.getConexion();
        ResultSet rs=BaseDeDatos.consulta("SELECT COMPAÑIA FROM PROVEEDOR ORDER BY COMPAÑIA");
        try {
        while (rs.next()) {
        lista.add(rs.getString("COMPAÑIA"));    
           }
       }catch (Exception asd) {
            System.out.println(asd);
        }  
       return lista;
    }
    public Proveedor agregaProveedor(int id, String proveedor, String telefono, String nombre, String tipo){
        BaseDeDatos.getConexion();
        ResultSet producto = BaseDeDatos.agrega1(id, proveedor, telefono, nombre, tipo); 
        return null;
    }
}
