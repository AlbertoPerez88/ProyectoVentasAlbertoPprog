/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

/**
 *
 * @author Alberto
 */
public class Producto {
    private int id_Producto; 
    private String nombre;
    private double precio;
    static int contProd;

    public Producto(String nombre, double precio) {
        this();
        this.id_Producto = contProd;
        this.nombre = nombre;
        this.precio = precio;
    }
    public Producto(){
        contProd++;
    }
    
    public int getId_Producto() {
        return id_Producto;
    }
    
    public void setId_Producto(int idProducto) {
        this.id_Producto = idProducto;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public int getContProd() {
        return contProd;
    }
    
    public void setContProd(int contProd) {
        this.contProd = contProd;
    }

    @Override
    public String toString() {
        return "id_Producto -> " + id_Producto + ", nombre -> " + nombre + ", precio -> " + precio+"€";
    }
    
}
