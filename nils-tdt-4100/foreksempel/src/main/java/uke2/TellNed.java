package uke2;

public class TellNed {

    // Hvilke indre 'data' er det klassen TellNed må holde rede på?
    // Disse 'attributtene' *bør* defineres før man går i gang med å definere metoder.
    int tall;

    // Konstruktør. Denne kalles når man lager et nytt objekt av denne klassen.
    // Man kan ha flere av dem så lenge de har ulike parametre.
    public TellNed(int tall) {
        this.tall = tall;
    }

    // Metode for å telle ned i et TellNed-objekt.
    public void tellned() {
        tall -= 1;
    }
    
    // Metode 
    public int getTall() {
        return tall;
    }

    public static void main(String[] args) {
        TellNed tn1 = new TellNed(10);
        tn1.tellned();
        System.out.println("tn1: "+tn1.getTall());
        tn1.tellned();
        System.out.println("tn1: "+tn1.getTall());
        tn1.tellned();
        System.out.println("tn1: "+tn1.getTall());

        // Så kan vi lage en ny teller
        TellNed tn2 = new TellNed(100);
        System.out.println("tn2: "+tn2.getTall());

        tn1.tellned();
        tn2.tellned();
        System.out.println("tn1: "+tn1.getTall());
        System.out.println("tn2: "+tn2.getTall());

        tn1.tellned();
        tn2.tellned();
        System.out.println("tn1: "+tn1.getTall());
        System.out.println("tn2: "+tn2.getTall());

    }
}
