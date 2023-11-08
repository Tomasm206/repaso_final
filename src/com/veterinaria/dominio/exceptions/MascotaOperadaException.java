package com.veterinaria.dominio.exceptions;

public class MascotaOperadaException extends RuntimeException {
    public MascotaOperadaException(){super("-DETALLES \nLa mascota ya fue operada");}
}
