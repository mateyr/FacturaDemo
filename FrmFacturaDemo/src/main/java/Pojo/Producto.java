/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pojo;

/**
 *
 * @author Sistemas-07
 */
public class Producto {
    
    private String codigo;
    private String name;
    private int cantidad;
    private float precio;

    public Producto() {
    }

    
    
    
    public Producto(String codigo, String name, int cantidad, float precio) {
        this.codigo = codigo;
        this.name = name;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Object[] asArray() {
       
        Object[] obj = new Object[4];
        
        obj[0] = codigo;
        obj[1] = name;
        obj[2] = cantidad;
        obj[3] = precio;
     
        return obj;
    }
        
        
        
        
    }
    
    
    
    
    
    

