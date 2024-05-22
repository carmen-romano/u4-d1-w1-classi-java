package Esercizio3;

import Esercizio2.Chiamata;

import java.util.Random;

public class Articolo {

    private int codiceArticolo;
    private String descrizioneArticolo;
    private double prezzo;
    private int rimanenzaMagazzino;

    public String getDescrizioneArticolo() {
        return descrizioneArticolo;
    }

    public void setDescrizioneArticolo(String descrizioneArticolo) {
        this.descrizioneArticolo = descrizioneArticolo;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getRimanenzaMagazzino() {
        return rimanenzaMagazzino;
    }

    public void setRimanenzaMagazzino(int rimanenzaMagazzino) {
        this.rimanenzaMagazzino = rimanenzaMagazzino;
    }

    public Articolo(String descrizioneArticolo, double prezzo, int rimanenzaMagazzino ){
        this.codiceArticolo = new Random().nextInt(1,1000);
        this.descrizioneArticolo = descrizioneArticolo;
        this.prezzo= prezzo;
        this.rimanenzaMagazzino=rimanenzaMagazzino;
    }
    public void stampaDettagli() {
        System.out.println("Articolo:");
        System.out.println("Codice: " + codiceArticolo);
        System.out.println("Descrizione: " + descrizioneArticolo);
        System.out.println("Prezzo: " + prezzo);
        System.out.println("Numero pezzi disponibili: " + rimanenzaMagazzino);
    }
}
