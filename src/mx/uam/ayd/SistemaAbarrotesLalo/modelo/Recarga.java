
package mx.uam.ayd.SistemaAbarrotesLalo.modelo;

import java.util.Date;

public class Recarga {
    private Date fecha;
    private int monto;
    
    public Recarga(Date fecha, int monto) {
        this.fecha = fecha;
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }    
    } 
