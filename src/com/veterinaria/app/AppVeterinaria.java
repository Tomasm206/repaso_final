package com.veterinaria.app;

import com.veterinaria.dominio.Mascota;
import com.veterinaria.dominio.Veterinaria;

public class AppVeterinaria {
    public static void main(String[] args) {
        System.out.println("El programa funciona");

        Veterinaria veterinaria = new Veterinaria();
        veterinaria.revisarMascota("guaba","macho",15);
        veterinaria.revisarMascota("max","macho",9);
        veterinaria.revisarMascota("luna","macho",22);
        veterinaria.revisarMascota("copito","chica",15);
        veterinaria.revisarMascota("moly","chica",32);

        veterinaria.operarATodos();

        for (Veterinaria pacientes : veterinaria.pacientes){
            System.out.println(pacientes.toString());
        }
    }
}
