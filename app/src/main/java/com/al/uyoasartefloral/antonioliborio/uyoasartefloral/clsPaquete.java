package com.al.uyoasartefloral.antonioliborio.uyoasartefloral;

import java.io.Serializable;

public class clsPaquete implements Serializable {
    private String paq_id;
    private String paq_nombre;
    private String paq_descripcion;
    private Double paq_precio;
    private int paq_imagen;

    public clsPaquete(){
        setPaq_id("");
        setPaq_nombre("");
        setPaq_descripcion("");
        setPaq_precio(0.00);
        setPaq_imagen(0);
    }

    public clsPaquete(String id,String nombre,String descripcion,Double precio,int img){
        this.setPaq_id(id);
        this.setPaq_nombre(nombre);
        this.setPaq_descripcion(descripcion);
        this.setPaq_precio(precio);
        setPaq_imagen(img);
    }

    public String getPaq_id() {
        return paq_id;
    }

    public void setPaq_id(String paq_id) {
        this.paq_id = paq_id;
    }

    public String getPaq_nombre() {
        return paq_nombre;
    }

    public void setPaq_nombre(String paq_nombre) {
        this.paq_nombre = paq_nombre;
    }

    public String getPaq_descripcion() {
        return paq_descripcion;
    }

    public void setPaq_descripcion(String paq_descripcion) {
        this.paq_descripcion = paq_descripcion;
    }

    public Double getPaq_precio() {
        return paq_precio;
    }

    public void setPaq_precio(Double paq_precio) {
        this.paq_precio = paq_precio;
    }

    public int getPaq_imagen() {
        return paq_imagen;
    }

    public void setPaq_imagen(int paq_imagen) {
        this.paq_imagen = paq_imagen;
    }
}
