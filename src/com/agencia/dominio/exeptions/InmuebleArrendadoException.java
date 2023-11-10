package com.agencia.dominio.exeptions;

public class InmuebleArrendadoException extends RuntimeException {
    public InmuebleArrendadoException(){
        super("Detalles\nEl inmueble ya está arrendado");
    }
}
