package com.agencia.dominio;

public abstract class Inmueble{
    private String direccion;
    private long valorVenta;
    private long valorArriendo;
    protected boolean arrendado;
    protected boolean construir;

    @Override
    public String toString() {
        return "Inmueble{" +
                "direccion='" + direccion + '\'' +
                ", valorVenta=" + valorVenta +
                ", valorArriendo=" + valorArriendo +
                ", arrendado=" + arrendado +
                '}';
    }
}
