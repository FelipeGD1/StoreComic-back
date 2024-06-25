package org.example.helpers.validaciones;

import org.example.helpers.general.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarcaValidacionTest {
    private MarcaValidacion objetoPrueba;

    @BeforeEach
    public void configuracionInicial(){
        this.objetoPrueba= new MarcaValidacion();
    }
    @Test
    public void validarNombreFallo() {
        String nombreMalo= "lkjsdlkfjlaksdlsakjdlakj4lkj4lksadflksadflk3lk32lkj3lkj2l2k32lk32lk32lk32lk3232l32lkj32lkj32";
        Exception exceptionLanzada = Assertions.assertThrows(Exception.class,()->this.objetoPrueba.validarNombre(nombreMalo));
        Assertions.assertEquals(Mensaje.NOMBRE_LONGITUD_MARCA.getMensaje(), exceptionLanzada.getMessage());
    }
    @Test
    public void validarNombreBien(){
        String nombreBueno = "juan diego";
        Assertions.assertDoesNotThrow(()->this.objetoPrueba.validarNombre(nombreBueno));
    }
    @Test
    public void validarPaisFalloFormato() {
        String paisIncorrecto= "Peru123";
        Exception exceptionLanzada = Assertions.assertThrows(Exception.class,()->this.objetoPrueba.validarPais(paisIncorrecto));
        Assertions.assertEquals(Mensaje.NOMBRE_FORMATO.getMensaje(), exceptionLanzada.getMessage());
    }
    @Test
    public void validarPaisFalloLongitud(){
        String paisIncorrecto= "Colombialjasdkjsadasdadakjsdakjsdasdasdkjasdasdkasdakvcccakcakakcakjcacadasdas";
        Exception exceptionLanzada = Assertions.assertThrows(Exception.class,()->this.objetoPrueba.validarPais(paisIncorrecto));
        Assertions.assertEquals(Mensaje.NOMBRE_LONGITUD_PAIS.getMensaje(), exceptionLanzada.getMessage());
    }
    @Test
    public void validarPaisBien(){
        String nombreBueno = "Colombia";
        Assertions.assertDoesNotThrow(()->this.objetoPrueba.validarPais(nombreBueno));
    }
    @Test
    public void validarEmailFallo() {
        String emailFallo= "felipe@gmail.com";
        Exception exceptionLanzada = Assertions.assertThrows(Exception.class,()->this.objetoPrueba.validarRepresentante(emailFallo));
        Assertions.assertEquals(Mensaje.NOMBRE_CORREO.getMensaje(), exceptionLanzada.getMessage());
    }
    @Test
    public void validarEmailCorrecto(){
        String email= "felipe@globant.com";
        Assertions.assertDoesNotThrow(()->this.objetoPrueba.validarRepresentante(email));
    }

}