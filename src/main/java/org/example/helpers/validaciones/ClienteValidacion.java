package org.example.helpers.validaciones;

import org.example.helpers.general.General;
import org.example.helpers.general.Mensaje;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClienteValidacion {
    //las clase de validacion normalmente solo tienen metodos con la logica de validacion.
    //inyectando la dependencia a la clase general
    private General general= new General();
    public void validarNombre(String nombre)throws Exception{
        //Establecer rutinas para validar el campo nombres, segun las reglas del negocio
        //valido el tamaño
        if(nombre.length()>70){
            throw new Exception(Mensaje.NOMBRE_LONGITUD.getMensaje());
        }
        boolean resp =this.general.validacionGeneral("^[a-zA-Z ]+$",nombre);
         if(!resp){
             throw new Exception(Mensaje.NOMBRE_FORMATO.getMensaje());
         }
         else {
             throw new Exception("Se ingreso el nombre correctamente");
         }
    }
    public void validarCorreo(String correo)throws Exception{
        boolean resp =this.general.validacionGeneral("^[a-zA-Z0-9._%+-]+@globant\\.com$",correo);
        if(!resp){
            throw new Exception(Mensaje.NOMBRE_CORREO.getMensaje());
        }
        else {
            throw new Exception("Se ingreso el nombre correctamente");
        }
    }
    public boolean validarFecha(LocalDate fecha){
        return true;
    }

    public void validarTelefono(String telefono) throws Exception {
        boolean resp= this.general.validacionGeneral("^\\d{10}$",telefono);
        if(!resp){
            throw new Exception(Mensaje.NOMBRE_TEL.getMensaje());
        }
        else {
            throw new Exception("numero ingresado correctamente");

        }
    }
}