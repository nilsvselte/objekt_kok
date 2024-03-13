package uke3.fasit;

/*
 * Bare litt kode for å vise at en kan ha ulike konstruktører, så lenge de har ulike parametre.
 * En annen sak her er at vi har en setNavn-metode, som har en sjekk for tillatte navn. Det litt
 * merkelige, dog, er at vi kan sette et kort navn når en kaller konstruktøren med en streng.
 * Dette kan en få til bedre. Hva kan man gjøre inni Konstruktor(String navn) for å få til en
 * lik oppførsel?
 */

public class Konstruktor {
    String navn;

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        if (navn.length() > 4) {
            this.navn = navn;
        }
        else {
            this.navn = "Forkort, så jeg valgte mitt eget";
        }
    }

    

    public Konstruktor() {
        System.out.println("Tom konstruksjon!");
    }

    
    // Hmm, med denne metoden har vi ingen sjekk for lengde på navn, slik vi har i setNavn.
    // Hvordan kan en få til den samme sjekken her, tro...
    public Konstruktor(String navn) {
        System.out.println("Konstruksjon med navn "+navn);
        this.navn = navn;
    }

    public static void main(String[] args) {
        Konstruktor k = new Konstruktor();
        System.out.println(k.getNavn());

        Konstruktor k2 = new Konstruktor("Per");
        System.out.println(k2.getNavn());
        k2.setNavn("Ola Borten MOe");
        System.out.println(k2.getNavn());

    }
    
    
}
