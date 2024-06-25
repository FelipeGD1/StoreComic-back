package org.example.models;

import org.example.helpers.validaciones.FacturaValidacion;

public class Factura {
    public int id;
    private String fecha;//(DD/MM/YYYY)
    private String listaProducto;//Revisar arraylist
    private double costoBruto;//no negativos
    private double costoNeto;//Aplicar iva y descuentos
    private FacturaValidacion facturaValidacion= new FacturaValidacion();

    public Factura() {
    }

    public Factura(int id, String fecha, String listaProducto, double costoBruto, double costoNeto) {
        this.id = id;
        this.fecha = fecha;
        this.listaProducto = listaProducto;
        this.costoBruto = costoBruto;
        this.costoNeto = costoNeto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getListaProducto() {
        return listaProducto;
    }

    public void setListaProducto(String listaProducto) {
        this.listaProducto = listaProducto;
    }

    public double getCostoBruto() {
        return costoBruto;
    }

    public void setCostoBruto(double costoBruto) {
        try{
            this.facturaValidacion.validarCostoBruto(costoBruto);
            this.costoBruto= costoBruto;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public double getCostoNeto() {
        return costoNeto;
    }
    public void setCostoNeto(double costoNeto) {
    }
}
