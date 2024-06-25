package org.example.models;

import org.example.helpers.validaciones.MarcaValidacion;

public class Marca {
    private int id;
    private String nombre;//No puede pasar los 50 caracteres
    private String pais;//Solo letras y max 10 caracteres
    private String representante;//debe cumplir un formato de email valido XXXX@globant.com

    private MarcaValidacion marcaValidacion=new MarcaValidacion();

    public Marca() {
    }

    public Marca(int id, String nombre, String pais, String representante) {
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
        this.representante = representante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        try {
            this.marcaValidacion.validarNombre(nombre);
            this.nombre=nombre;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        try {
            this.marcaValidacion.validarPais(pais);
            this.pais=pais;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        try {
            this.marcaValidacion.validarRepresentante(representante);
            this.representante=representante;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
