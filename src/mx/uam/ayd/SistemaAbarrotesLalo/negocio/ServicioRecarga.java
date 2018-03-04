
package mx.uam.ayd.SistemaAbarrotesLalo.negocio;

import java.sql.SQLException;
import mx.uam.ayd.SistemaAbarrotesLalo.persistencia.DAORecarga;

/**
 *
 * @author lalo
 */
public class ServicioRecarga {
DAORecarga daoRecarga1=new DAORecarga();
int montoTotal=0, numeroRecargas=0;
    
    /**
     *
     * @param periodo
     * @return
     * @throws SQLException
     */
    public int dameMontoTotalRecargas(String periodo) throws SQLException {
       montoTotal= daoRecarga1.recuperaMontos(periodo);    
       return montoTotal;
    }

    /**
     *
     * @param periodo
     * @return
     * @throws SQLException
     */
    public int dameNumeroDeRecargas(String periodo) throws SQLException {
       numeroRecargas=daoRecarga1.recuperaTamaño(periodo);
       return numeroRecargas;
    }
    
}