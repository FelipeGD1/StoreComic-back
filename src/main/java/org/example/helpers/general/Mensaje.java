package org.example.helpers.general;

public enum Mensaje {
    NOMBRE_LONGITUD("El nombre ingresado debe tener menos de 70 caracteres"),
    NOMBRE_LONGITUD_MARCA("El nombre ingresado debe tener menos de 50 caracteres"),
    NOMBRE_LONGITUD_PRODUCTO("El nombre ingresado debe tener menos de 80 caracteres"),
    NOMBRE_LONGITUD_PAIS("El nombre del pais sobrepasa los 10 caracteres"),
    NOMBRE_FORMATO("El nombre solo puede tener letras y espacios"),
    NOMBRE_CORREO("El correo debe ser de la forma correo@globant.com"),
    NOMBRE_TEL("El telefono no tiene 10 num de longitud"),
    NOMBRE_NUMERO("El numero ingresado no esta permitido"),
    NOMBRE_LONGITUD_RESEÑA("El nombre ingresado debe tener menos de 100 caracteres"),
    NOMBRE_COSTONETO("No se esta aplicando el descuento"),
    ;
    private String mensaje;

    Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    public String getMensaje() {
        return mensaje;
    }

}
