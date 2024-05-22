package Esercizio1;

public class Rettangolo {

    private int h;
    private int b;


    public Rettangolo(int h, int b){
        this.h = h;
        this.b = b;
    }


    public int calcoloPerimetro() {
        return 2 * (b + h);
    }
    public int calcolaArea() {
        return b * h;
    }


    public void stampaRettangolo() {
        System.out.println("Perimetro del rettangolo: " + calcoloPerimetro());
        System.out.println("Area del rettangolo: " + calcolaArea());
    }
}

