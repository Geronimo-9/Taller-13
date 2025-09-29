package Especie;

import accionesEspecie.Nadador;
import accionesEspecie.Volador;

public class Pato implements Volador, Nadador {


    @Override
    public void volar() {
        System.out.println("El pato está volando");
    }


    @Override
    public void nadar() {
        System.out.println("El pato está nadando");
    }
}
