package org.example.models;

import org.example.helpers.validaciones.ProductoValidacion;

import javax.swing.table.TableRowSorter;

public class Producto {
    private int id;
    private String nombre; //Solo letras y espacios, 80 caracteres
    private double precio;//Solo numeros y positivos
    private String descripcion;//Cadenas hasta 50 caracteres
    private String foto;
    private String reseña;//limite de 100 caracteres
    private String marca;

    private ProductoValidacion productoValidacion= new ProductoValidacion();

    public Producto() {
    }

    public Producto(int id, String nombre, double precio, String descripcion, String foto, String reseña, String marca) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.foto = foto;
        this.reseña = reseña;
        this.marca = marca;
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
            this.productoValidacion.validarNombre(nombre);
            this.nombre=nombre;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        try {
            this.productoValidacion.validarPrecio(precio);
            this.precio=precio;
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        try {
            this.productoValidacion.validarDescripcion(descripcion);
            this.descripcion=descripcion;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getReseña() {
        return reseña;
    }

    public void setReseña(String reseña) {
        try {
            this.productoValidacion.validarReseña(reseña);
            this.reseña=reseña;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
