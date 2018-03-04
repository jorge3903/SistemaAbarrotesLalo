/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uam.ayd.SistemaAbarrotesLalo.presentacion;

import java.sql.SQLException;
import java.text.ParseException;
import javax.swing.JOptionPane;
import mx.uam.ayd.SistemaAbarrotesLalo.negocio.ServicioCliente;

/**
 *
 * @author lalo
 */
public class ControlCliente {
     ServicioCliente  servicioCliente1=new ServicioCliente ();

    public void iniciaControlCliente() {
        VentanaListaFiar ventanaListaFiar= new VentanaListaFiar(this);
        ventanaListaFiar.setVisible(true);
    }
    
    public void finalizaControl() {
        ControlPrincipal controlPrincipal1 = new ControlPrincipal();
        controlPrincipal1.iniciaControl();
    }

    void iniciaAgregarCliente() {
        VentanaAgregarCliente ventanaAgregarCliente1= new VentanaAgregarCliente(this);
        ventanaAgregarCliente1.setVisible(true);
    }

    public void iniciaTablaFiar() {
          VentanaTablaFiar ventanaTablaFiar = new VentanaTablaFiar(this);
          ventanaTablaFiar.setVisible(true);
    }

    public void AgregaDatosBuenos(String nombre, double cantidad, String fecha) throws SQLException, ParseException {
        boolean comprueva;
        comprueva=servicioCliente1.agregarCliente(nombre,cantidad,fecha);
        if(comprueva==true){
            JOptionPane.showMessageDialog(null,"los datos de "+nombre+"\nhan sido guardados exitosamente");
        }else{
            JOptionPane.showMessageDialog(null,"error, datos no guardados");
        }
    }
}
