
package mx.uam.ayd.SistemaAbarrotesLalo.modelo;

import java.time.LocalDate;
import java.util.Date;

public class Recarga {
    private LocalDate fechaActual;
    private int monto;
    
    public Recarga(LocalDate fechaActual, int monto) {
      this.fechaActual=fechaActual;
      this.monto=monto;
    }

    public LocalDate getFechaActual() {
        return fechaActual;
    }

    public void setFechaActual(LocalDate fechaActual) {
        this.fechaActual = fechaActual;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    
    } 
