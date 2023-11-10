package com.agencia.app;

import com.agencia.dominio.*;

public class AppAgencia {
    public static void main(String[] args) {
        Agencia agencia = new Agencia("IMB");
        Apartamento apartamento = new Apartamento();
        Casa casa = new Casa();
        Lote lote = new Lote();
        agencia.agregarInmueble(apartamento);
        agencia.agregarInmueble(casa);
        agencia.agregarInmueble(lote);

    }
}
