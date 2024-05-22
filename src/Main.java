import Esercizio1.Rettangolo;
import Esercizio2.Chiamata;
import Esercizio2.Sim;
import Esercizio3.Articolo;
import Esercizio3.Carrello;
import Esercizio3.Cliente;

public class Main {
    public static void main(String[] args) {
        ///ESERCIZIO 1
        Rettangolo rettangolo = new Rettangolo(5, 10);
        rettangolo.stampaRettangolo();
        ////ESERCIZIO 2
        Sim sim = new Sim(33333);
        sim.aggiungiChiamata(new Chiamata(433344));
        sim.aggiungiChiamata(new Chiamata(272725252));
        sim.datiSim();
        ///ESERCIZIO 3
        // Creazione articolo
        Articolo articolo1 = new Articolo("Pc", 599.99, 10);
        Articolo articolo2 = new Articolo("Tastiera", 199.99, 42);
        // Creazione  cliente
        Cliente cliente1 = new Cliente("Mario Rossi", "mariorossi@gmail.com", "20/10/2022");

        Articolo[] elencoArticoliCarrello = {articolo1, articolo2};

        // Creazione del carrello per il cliente
        Carrello carrelloCliente1 = new Carrello(cliente1, elencoArticoliCarrello);

        carrelloCliente1.dettagliCarrello();
    };
