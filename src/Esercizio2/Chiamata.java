package Esercizio2;

import java.util.Random;

public class Chiamata {

    private int numeroChiamato;
    private int durataChiamata;

    public Chiamata(int numeroChiamato) {
        this.numeroChiamato = numeroChiamato;
        this.durataChiamata = new Random().nextInt(1,20);
    }

    public int getNumeroChiamato() {
        return numeroChiamato;
    }


    public int getDurataChiamata() {
        return durataChiamata;
    }


}
