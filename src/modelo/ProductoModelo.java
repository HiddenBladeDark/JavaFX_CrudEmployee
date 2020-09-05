/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author ADSI
 */
public class ProductoModelo {
    
    //<editor-fold desc="ATRIBUTOS" defaultstate="collapsed">
    private  float precio;
    private  int cantidad;
    //</editor-fold>
    
    //<editor-fold desc="CONSTRUCTOR" defaultstate="collapsed">
    
    public ProductoModelo() {
    }
    

    public ProductoModelo(float precio, int cantidad) {
        this.precio = precio;
        this.cantidad = cantidad;
    }
    //</editor-fold>
    
    //<editor-fold desc="PROPIEDADES" defaultstate="collapsed">
    
    public float getPrecios() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    //</editor-fold>
}
