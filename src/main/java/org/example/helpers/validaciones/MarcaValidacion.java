package org.example.helpers.validaciones;

import org.example.helpers.general.General;
import org.example.helpers.general.Mensaje;
import org.example.models.Producto;

import java.time.LocalDate;

public class MarcaValidacion {
    private General general= new General();
    public boolean validarNombre(String nombre) throws Exception {
        if(nombre.length()>50){
            throw new Exception(Mensaje.NOMBRE_LONGITUD_MARCA.getMensaje());
        }
        return true;
    }
    public boolean validarPais(String pais) throws Exception {
        if(pais.length()>10){
            throw new Exception(Mensaje.NOMBRE_LONGITUD_PAIS.getMensaje());
        }
        boolean resp =this.general.validacionGeneral("^[a-zA-Z ]+$",pais);
        if(!resp){
            throw new Exception(Mensaje.NOMBRE_FORMATO.getMensaje());
        }
        else {
            return true;
        }
    }
    public boolean validarRepresentante(String representante) throws Exception {
        boolean resp =this.general.validacionGeneral("^[a-zA-Z0-9._%+-]+@globant\\.com$",representante);
        if(!resp){
            throw new Exception(Mensaje.NOMBRE_CORREO.getMensaje());
        }
        return true;
    }
}
