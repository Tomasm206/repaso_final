package com.veterinaria.dominio;

public abstract class Mascota extends Veterinaria {
    protected String nombre;
    protected String sexo;
    protected int edad;
    protected boolean esterilizado;

    public Mascota(String nombre, String sexo, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", sexo='" + sexo + '\'' +
                ", edad=" + edad +
                ", esterilizado=" + esterilizado +
                '}';
    }
}
