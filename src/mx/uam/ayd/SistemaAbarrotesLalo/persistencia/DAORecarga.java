
package mx.uam.ayd.SistemaAbarrotesLalo.persistencia;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

/**
 *
 * @author lalo
 */
public class DAORecarga {

    ResultSet recargas;
    int montoRecargas = 0, tamaño = 0;
    private conexion conexion;
    conexion BaseDeDatos = new conexion();
    LocalDate fechaActual = LocalDate.now();
    int dia = fechaActual.getDayOfMonth();
    int mes = fechaActual.getMonthValue();
    int año = fechaActual.getYear();
    int contador, suma;

    /**
     *Recupera los montos de recargas contenidas dentro de un periodo de tiempo
     * @param periodo
     * @return
     * @throws SQLException
     */
    public int recuperaMontos(String periodo) throws SQLException {

        BaseDeDatos.getConexion();
        if (periodo.equals("Dia")) {

            recargas = BaseDeDatos.consulta("SELECT MONTO FROM RECARGA WHERE FECHA LIKE" + "'"+dia+"-"+mes+"-"+año+"'");
            while (recargas.next()) {
               suma =suma + recargas.getInt("MONTO");
            }
           montoRecargas=suma;
           suma=0;

        }

        if (periodo.equals("Mes")) {

            recargas = BaseDeDatos.consulta("SELECT MONTO FROM RECARGA WHERE FECHA LIKE" + "'%-" + mes +"-"+año+"'");
            while (recargas.next()) {
                suma =suma + recargas.getInt("MONTO");
            }
            montoRecargas=suma;
           suma=0;
        }
        if (periodo.equals("Año")) {

            recargas = BaseDeDatos.consulta("SELECT MONTO FROM RECARGA WHERE FECHA LIKE" + "'%-%" + año + "'");
            while (recargas.next()) {
                suma =suma + recargas.getInt("MONTO");
            }
            montoRecargas=suma;
           suma=0;
        }
        return montoRecargas;
    }

    /**
     *Recupera las recargas realizadas contenidas dentro de un periodo de tiempo
     * @param periodo
     * @return
     * @throws SQLException
     */
    public int recuperaTamaño(String periodo) throws SQLException {
        if (periodo.equals("Dia")) {
            recargas = BaseDeDatos.consulta("SELECT MONTO FROM RECARGA WHERE FECHA LIKE" + "'" + dia + "-" + mes + "-" + año + "'");
            while (recargas.next()) {
                contador++;
            };
            tamaño = contador;
            contador = 0;
        }

        if (periodo.equals("Mes")) {
            recargas = BaseDeDatos.consulta("SELECT MONTO FROM RECARGA WHERE FECHA LIKE" + "'%-" + mes +"-"+año+"'");
            while (recargas.next()) {
                contador++;
            }
            tamaño = contador;
            contador = 0;
        }

        if (periodo.equals("Año")) {
            recargas = BaseDeDatos.consulta("SELECT MONTO FROM RECARGA WHERE FECHA LIKE" + "'%-%" + año + "'");
            while (recargas.next()) {
                contador++;
            }
            tamaño = contador;
            contador = 0;
        }
        return tamaño;
    }
   
}


