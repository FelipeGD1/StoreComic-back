package org.example.helpers.validaciones;

import org.example.helpers.general.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacturaValidacionTest {
    private FacturaValidacion objetoPrueba;

    @BeforeEach
    public void configuracionInicial(){
        this.objetoPrueba= new FacturaValidacion();
    }
    @Test
    public void validarCostoBruto(){
        double valorMalo= -3.5;
        Exception exceptionLanzada = Assertions.assertThrows(Exception.class,()->this.objetoPrueba.validarCostoBruto(valorMalo));
        Assertions.assertEquals(Mensaje.NOMBRE_NUMERO.getMensaje(), exceptionLanzada.getMessage());
    }

    @Test
    public void validarCostoBrutoBien(){
        double nombreBueno = 3.7;
        Assertions.assertDoesNotThrow(()->this.objetoPrueba.validarCostoBruto(nombreBueno));
    }
}