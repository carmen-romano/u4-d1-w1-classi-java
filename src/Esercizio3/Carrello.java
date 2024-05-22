package Esercizio3;

public class Carrello {
    private Cliente cliente;
    private Articolo[] elencoArticoli;
    private double totaleCarrello;

    public Carrello(Cliente cliente, Articolo[] elencoArticoli) {
        this.cliente = cliente;
        this.elencoArticoli = elencoArticoli;
        this.totaleCarrello = calcoloCarrello();
    }

    public double calcoloCarrello() {
        double totale = 0.0;
        for (Articolo articolo : elencoArticoli) {
            totale += articolo.getPrezzo();
        }
        return totale;
    }

    public void dettagliCarrello() {
        System.out.println("Carrello:");
        System.out.println("Cliente associato:");
        cliente.stampaDettagli();
        System.out.println("Elenco articoli:");
        for (Articolo articolo : elencoArticoli) {
            articolo.stampaDettagli();
        }
        System.out.println("Totale carrello: " + totaleCarrello);
    }
}

