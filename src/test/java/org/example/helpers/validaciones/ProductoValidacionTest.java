package org.example.helpers.validaciones;

import org.example.helpers.general.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductoValidacionTest {

    private ProductoValidacion productoValidacion;

    @BeforeEach
    public void configuracionInicial(){
        this.productoValidacion= new ProductoValidacion();
    }

    @Test
    public void validarNombreFalloPorLongitud() {
        String nombreMalLongitud= "ljasdlkaslkdaslkjdlkjsadlkjsalkjdaslkjdlkjaslkjdsalkjdsadlkjaslkjdsadaslkjdlkjsalkjdlkjaslkjdalkjsdlkjaslkjdlkjsadlkjasdalkjsdlkjaslkjdlkjsadlkjaslkjdlkjasdlkjsalk";
        Exception exceptionLanzada = Assertions.assertThrows(Exception.class,()->this.productoValidacion.validarNombre(nombreMalLongitud));
        Assertions.assertEquals(Mensaje.NOMBRE_LONGITUD_PRODUCTO.getMensaje(), exceptionLanzada.getMessage());
    }
    @Test
    public void validarNombreFalloPorFormato() {
        String nombreMalFormato= "Felipe123";
        Exception exceptionLanzada = Assertions.assertThrows(Exception.class,()->this.productoValidacion.validarNombre(nombreMalFormato));
        Assertions.assertEquals(Mensaje.NOMBRE_FORMATO.getMensaje(), exceptionLanzada.getMessage());

    }

    @Test
    void validarPrecioFallo() {
        double numeroMal= -5.5;
        Exception exceptionLanzada = Assertions.assertThrows(Exception.class,()->this.productoValidacion.validarPrecio(numeroMal));
        Assertions.assertEquals(Mensaje.NOMBRE_NUMERO.getMensaje(), exceptionLanzada.getMessage());

    }

    @Test
    void validarDescripcionLongitud() {
        String descripcionLongitud= "ljadlksalknvlaksnclknsaclksaclsacaclsaclkasclknasclknaslcaslcaslkncalknsclnaslnclfdslkjdsvnjsjvds jvdsdcnjs nsjdcnjncs";
        Exception exceptionLanzada = Assertions.assertThrows(Exception.class,()->this.productoValidacion.validarDescripcion(descripcionLongitud));
        Assertions.assertEquals(Mensaje.NOMBRE_LONGITUD_MARCA.getMensaje(), exceptionLanzada.getMessage());
    }
    @Test
    public void validarDescripcionBien(){
        String nombreBueno = "juan diego";
        Assertions.assertDoesNotThrow(()->this.productoValidacion.validarDescripcion(nombreBueno));
    }

    @Test
    void validarReseñaFallo() {
        String reseñaMala= "lkasdñlkjaslkcalksmclkamsclkamsclkamslkcamclmllmlmlmlmlmlamsclkmalskcmlkmlkmlkmlkasmclkmalksmdlakmdlakndlancljancljnaslcnalknclasknclaksnclkasnclkanslcknsalkcalskclaksclkansclkasclksaclksaclkaslckaslkncaslkcaslkcsalkcsalknca";
        Exception exceptionLanzada = Assertions.assertThrows(Exception.class,()->this.productoValidacion.validarReseña(reseñaMala));
        Assertions.assertEquals(Mensaje.NOMBRE_LONGITUD_RESEÑA.getMensaje(), exceptionLanzada.getMessage());
    }
}