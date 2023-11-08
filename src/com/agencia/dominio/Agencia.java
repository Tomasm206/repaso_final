package com.agencia.dominio;

import java.util.ArrayList;
import java.util.List;

public class Agencia {
    private String nombre;
    private List<Inmueble> inmuebles;

    public Agencia(String nombre) {
        this.nombre = nombre;
        this.inmuebles = new ArrayList<>();
    }

    public void agregarInmueble(Inmueble inmueble){
        this.inmuebles.add(inmueble);
    }
    public boolean arrendar(Inmueble inmueble){
        //ll
        return true;
    }
    public boolean devolver(Inmueble inmueble){
        //kk
        return true;
    }
    public boolean vender(Inmueble inmueble){
        //ll
        return true;
    }

}
