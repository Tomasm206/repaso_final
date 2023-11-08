package com.veterinaria.dominio;

import com.veterinaria.dominio.exceptions.MascotaNoOperableException;
import com.veterinaria.dominio.exceptions.MascotaOperadaException;

public class MascotaApta extends Mascota implements Operable{
    public MascotaApta(String nombre, String sexo, int edad) {
        super(nombre, sexo, edad);
    }
    @Override
    public void operar(){
        esterilizado = true;
    }
}
