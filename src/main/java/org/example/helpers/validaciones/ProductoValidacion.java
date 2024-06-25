package org.example.helpers.validaciones;

import org.example.helpers.general.General;
import org.example.helpers.general.Mensaje;

public class ProductoValidacion {
    private General general= new General();
    public boolean validarNombre(String nombre) throws Exception {
        if(nombre.length()>80){
            throw new Exception(Mensaje.NOMBRE_LONGITUD_PRODUCTO.getMensaje());
        }
        boolean resp =this.general.validacionGeneral("^[a-zA-Z ]+$",nombre);
        if(!resp){
            throw new Exception(Mensaje.NOMBRE_FORMATO.getMensaje());
        }
        return true;
    }
    public boolean validarPrecio(double precio) throws Exception {
        String cadena = String.valueOf(precio);
        boolean resp= this.general.validacionGeneral("^\\d*\\.?\\d+$",cadena);
        if(!resp){
            throw new Exception(Mensaje.NOMBRE_NUMERO.getMensaje());
        }
        return true;
    }
    public boolean validarDescripcion(String descripcion) throws Exception {
        if(descripcion.length()>50){
            throw new Exception(Mensaje.NOMBRE_LONGITUD_MARCA.getMensaje());
        }
        return true;
    }
    public boolean validarReseña(String reseña) throws Exception {
        if(reseña.length()>100){
            throw new Exception(Mensaje.NOMBRE_LONGITUD_RESEÑA.getMensaje());
        }
        return true;
    }
}