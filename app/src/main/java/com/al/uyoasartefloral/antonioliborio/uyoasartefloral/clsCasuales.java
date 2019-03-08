package com.al.uyoasartefloral.antonioliborio.uyoasartefloral;

import java.io.Serializable;

public class clsCasuales implements Serializable {
    private String id;
    private String nombre;
    private String descripcion;
    private Double precio;
    private int imagen;

    public clsCasuales(){
        id="";
        nombre="";
        descripcion="";
        precio=0.00;
        imagen=0;
    }
    public clsCasuales(String id,String nombre,String descripcion,Double precio,int img){
        this.id=id;
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.precio=precio;
        imagen=img;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
