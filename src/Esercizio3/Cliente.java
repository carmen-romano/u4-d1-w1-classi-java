package Esercizio3;

import java.util.Random;

public class Cliente {

    private int codiceCliente;
    private String nomeCognome;
    private String email;
    private String dataIscrizione;

    public  Cliente(String nomeCognome, String email, String dataIscrizione){
        this.codiceCliente = new Random().nextInt(1,1000);
        this.nomeCognome=nomeCognome;
        this.email=email;
        this.dataIscrizione=dataIscrizione;
    }

    public String getDataIscrizione() {
        return dataIscrizione;
    }

    public void setDataIscrizione(String dataIscrizione) {
        this.dataIscrizione = dataIscrizione;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomeCognome() {
        return nomeCognome;
    }

    public void setNomeCognome(String nomeCognome) {
        this.nomeCognome = nomeCognome;
    }
    public void stampaDettagli() {
        System.out.println("Cliente:");
        System.out.println("Codice: " + codiceCliente);
        System.out.println("Nome e Cognome: " + nomeCognome);
        System.out.println("Email: " + email);
        System.out.println("Data iscrizione: " + dataIscrizione);
    }
}
