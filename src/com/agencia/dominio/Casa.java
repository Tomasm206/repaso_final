package com.agencia.dominio;

public class Casa extends Inmueble implements Arrendable,Construible{




    @Override
    public void arrendar() {
        this.arrendado = true;
    }

    @Override
    public void devolver() {
        this.arrendado = false;
    }

    @Override
    public void construir() {
        this.construir = true;
    }
}
