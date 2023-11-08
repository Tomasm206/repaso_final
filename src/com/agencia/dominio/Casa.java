package com.agencia.dominio;

public class Casa extends Inmueble implements Arrendable{




    @Override
    public void arrendar() {
        this.arrendado = true;
    }

    @Override
    public void devolver() {
        this.arrendado = false;
    }
}
