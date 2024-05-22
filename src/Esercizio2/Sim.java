package Esercizio2;

import java.util.ArrayList;
import java.util.List;

public class Sim {

    private int numeroTelefono;
    private double creditoResiduo;
    private Chiamata[] listaChiamate;

    public Sim(int numeroTelefono){
        this.numeroTelefono = numeroTelefono;
        this.creditoResiduo =0.0;
        this.listaChiamate = new Chiamata[5];
    }

    public void aggiungiChiamata(Chiamata chiamata) {
        if (chiamata == null) {
            return;
        }
        for (int i = listaChiamate.length - 1; i > 0; i--) {
            listaChiamate[i] = listaChiamate[i - 1];
        }

        listaChiamate[0] = chiamata;
    }


    public void datiSim(){
        System.out.println("Numero di telefono: " + numeroTelefono);
        System.out.println("Credito disponibile: " + creditoResiduo + " euro");

        System.out.println("Ultime chiamate effettuate:");
        for (Chiamata chiamata : listaChiamate) {
            if (chiamata != null) {
                System.out.println("- Numero chiamato: " + chiamata.getNumeroChiamato() +
                        ", Durata: " + chiamata.getDurataChiamata() + " minuti");
            }
        }
    }
}
