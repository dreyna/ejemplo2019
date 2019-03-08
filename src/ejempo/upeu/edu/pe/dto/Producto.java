/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejempo.upeu.edu.pe.dto;

/**
 *
 * @author alum.fial1
 */
public class Producto {
   private int idproducto;
   private String nom_prod;
   private double precio;
   private int cantidad;

    public Producto() {
    }

    public Producto(int idproducto, String nom_prod, double precio, int cantidad) {
        this.idproducto = idproducto;
        this.nom_prod = nom_prod;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getNom_prod() {
        return nom_prod;
    }

    public void setNom_prod(String nom_prod) {
        this.nom_prod = nom_prod;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
   
}
