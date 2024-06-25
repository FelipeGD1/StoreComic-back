package org.example.helpers.validaciones;

import org.example.helpers.general.Mensaje;
import org.example.helpers.validaciones.ClienteValidacion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteValidacionTest {

    //0. Traiga sujeto de prueba

    private ClienteValidacion clienteValidacion;

    @BeforeEach
    public void setUp(){
        this.clienteValidacion=new ClienteValidacion();
    }

    //1. Metodo para configurar por defecto la prueba unitaria(RESET)

    //2. Definir los metodos y sus respectivos caminos a probar

    @Test
    public void validarNombreFallaPorLongitud(){
        String nombreMaloPorLongitud= "ljsdjsapdjapsdjapsojdaskdlaksjdlksajdlksajgdfgddgdfgdofdoijgdfglkdfjglkdjfglkdfgdlkgdfgdlgdgdflkgdflkgdfglkdfgldglkdfgfdlkgfdlkg";
        Exception exceptionLanzada=Assertions.assertThrows(Exception.class,()->this.clienteValidacion.validarNombre(nombreMaloPorLongitud));
        Assertions.assertEquals(Mensaje.NOMBRE_LONGITUD.getMensaje(),exceptionLanzada.getMessage());

    }
    @Test
    public void validarNombreFallaPorFormato(){
        String nombreMaloFormato="juan 23";
        Exception exceptionLanzada=Assertions.assertThrows(Exception.class,()->this.clienteValidacion.validarNombre(nombreMaloFormato));
        Assertions.assertEquals(Mensaje.NOMBRE_FORMATO.getMensaje(),exceptionLanzada.getMessage());
    }
    @Test
    public void validarNombreExito(){
        String nombreCorrecto = "juan";
        Exception exceptionLanzada=Assertions.assertThrows(Exception.class,()->this.clienteValidacion.validarNombre(nombreCorrecto));
        Assertions.assertEquals("Se ingreso el nombre correctamente",exceptionLanzada.getMessage());
    }

    @Test
    public void validarCorreoIncorrecto(){
        String correoIncorrecto="felipe@gmail.com";
        Exception exceptionLanzada=Assertions.assertThrows(Exception.class,()->this.clienteValidacion.validarCorreo(correoIncorrecto));
        Assertions.assertEquals(Mensaje.NOMBRE_CORREO.getMensaje(),exceptionLanzada.getMessage());
    }
    @Test
    public void validarCorreoCorrecto(){
        String correoCorrecto="felipe@globant.com";
        Exception exceptionLanzada=Assertions.assertThrows(Exception.class,()->this.clienteValidacion.validarCorreo(correoCorrecto));
        Assertions.assertEquals("Se ingreso el nombre correctamente",exceptionLanzada.getMessage());
    }
    @Test
    public void validarTelefonoIncorrecto(){
        String telefonoIncorrecto="32423";
        Exception exceptionLanzada=Assertions.assertThrows(Exception.class,()->this.clienteValidacion.validarTelefono(telefonoIncorrecto));
        Assertions.assertEquals(Mensaje.NOMBRE_TEL.getMensaje(),exceptionLanzada.getMessage());
    }
    @Test
    public void validarTelefonoBueno(){
        String telefonoCorrecto="1234567890";
        Exception exceptionLanzada=Assertions.assertThrows(Exception.class,()->this.clienteValidacion.validarTelefono(telefonoCorrecto));
        Assertions.assertEquals("numero ingresado correctamente",exceptionLanzada.getMessage());
    }

}
