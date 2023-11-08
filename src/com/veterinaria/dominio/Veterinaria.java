package com.veterinaria.dominio;

import com.veterinaria.dominio.exceptions.MascotaNoOperableException;
import com.veterinaria.dominio.exceptions.MascotaOperadaException;

import java.util.ArrayList;
import java.util.List;

public class Veterinaria {
    public static final int MESES_MACHO = 12;
    public static final int MESES_HEMBRA = 18;
    private String nombre;
    public List<Mascota> pacientes = new ArrayList<>();

    public Mascota revisarMascota(String nombre, String sexo, int edad){
        Mascota mascota;
        if ((sexo.equals("macho") && edad > MESES_MACHO)
                || (sexo.equals("hembra") && edad > MESES_HEMBRA)){
            mascota = new MascotaApta(nombre,sexo,edad);
        }else {
            mascota = new MascotaNoApta(nombre,sexo,edad);
        }
        pacientes.add(mascota);
        return mascota;
    }
    public List<MascotaApta> getPacientesAOperar(){
        List<MascotaApta> mascotaAptasAOperar = new ArrayList<>();
        for (Mascota mascota : pacientes){
            if (!mascota.esterilizado && mascota instanceof MascotaApta){
                mascotaAptasAOperar.add((MascotaApta) mascota); //conversión de tipo (casting)
            }
        }
        return mascotaAptasAOperar;
    }
    //public List<MascotaApta> getPacientesAOperar() {
    //    return pacientes.stream()
    //            .filter(mascota -> mascota instanceof MascotaApta && !mascota.esterilizado)
    //            .map(mascota -> (MascotaApta) mascota)
    //            .collect(Collectors.toList());
    //}//Manera pro 😎😎
    public void operarATodos(){
        List<MascotaApta> mascoasAptasAOperar = getPacientesAOperar();
        for (MascotaApta mascota : mascoasAptasAOperar){
            try {
                operar(mascota.nombre);
            } catch (MascotaOperadaException | MascotaNoOperableException e){
                e.printStackTrace();
            }
        }
    }
    public void operar(String nombre) throws MascotaOperadaException, MascotaNoOperableException {
        for (Mascota mascota : pacientes){
            if (mascota.nombre.equals(nombre)){
                if (!mascota.esterilizado && mascota instanceof Operable){
                    ((Operable) mascota).operar();
                    return;
                }else {
                    throw new MascotaNoOperableException();
                }
            }else{
                throw new MascotaOperadaException();
            }
        }
        throw new MascotaNoOperableException();
    }
}
