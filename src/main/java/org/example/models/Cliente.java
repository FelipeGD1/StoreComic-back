package org.example.models;

import org.example.helpers.validaciones.ClienteValidacion;

import javax.swing.*;
import java.time.LocalDate;

public class Cliente {
    private int id;
    private String nombreCompleto;//Letras y espacio, max 70 caracteres
    private String email;//Email valido
    private LocalDate fechaDeRegistro;//yyyy/mm/dd se recomiendo usar la clase locar date
    private String telefono;//Debe tener 10 digitos

    //Inyectando una dependencia de la clase cliente validacion
    private ClienteValidacion clienteValidacion=new ClienteValidacion();
    public Cliente() {
    }
    public Cliente(int id, String nombreCompleto, String email, LocalDate fechaDeRegistro, String telefono) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.fechaDeRegistro = fechaDeRegistro;
        this.telefono = telefono;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id=id;
    }
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public void setNombreCompleto(String nombreCompleto) {
        try {
            this.clienteValidacion.validarNombre(nombreCompleto);
            this.nombreCompleto=nombreCompleto;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public String getEmail() {return email;}
    public void setEmail(String email) {
        try {
            this.clienteValidacion.validarCorreo(email);
            this.email= email;

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public LocalDate getFechaDeRegistro() {
        return fechaDeRegistro;
    }
    public void setFechaDeRegistro(LocalDate fechaDeRegistro) {
        this.fechaDeRegistro = fechaDeRegistro;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        try {
            this.clienteValidacion.validarTelefono(telefono);
            this.telefono=telefono;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
