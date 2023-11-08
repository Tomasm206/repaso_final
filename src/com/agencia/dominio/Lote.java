package com.agencia.dominio;

public class Lote extends Inmueble implements Construible{


    @Override
    public String toString() {
        System.out.println("Lote");
        return super.toString();
    }

    @Override
    public void construir() {
        this.construir = true;
    }
}
