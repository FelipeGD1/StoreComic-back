package org.example.helpers.validaciones;

import org.example.helpers.general.General;
import org.example.helpers.general.Mensaje;
import org.example.models.Factura;
import org.example.models.Producto;

import java.time.LocalDate;

public class FacturaValidacion {

    private General general= new General();

    public boolean validarFecha(LocalDate fecha){
        return true;
    }

    public boolean validarProducto(Producto[] productos){
        return true;
    }
    public boolean validarCostoBruto(double costoBruto) throws Exception {
        String cadena= String.valueOf(costoBruto);
        boolean resp =this.general.validacionGeneral("^(?!-)[0-9]+(\\.[0-9]+)?$",cadena);
        if(!resp){
            throw new Exception(Mensaje.NOMBRE_NUMERO.getMensaje());
        }
        return true;
    }
}
