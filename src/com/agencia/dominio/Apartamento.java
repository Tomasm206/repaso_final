package com.agencia.dominio;

public class Apartamento extends Inmueble implements Arrendable{

    @Override
    public void arrendar() {
        this.arrendado = true;
    }

    @Override
    public void devolver() {
        this.arrendado = false;
    }
}
