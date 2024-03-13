package uke5.arv;

public class BarneBok extends Bok {

    int aldersgrense;

    public BarneBok(String tittel, String forfatter, int sider, int aldersgrense) {
        super(tittel, forfatter, sider);
        this.aldersgrense = aldersgrense;
    }


    // Vi bruker her Bok sin toString, og legger til litt mer informasjon:
    // I en subklasse kan vi referere til metoder fra superklassen, men ikke motsatt.
    @Override
    public String toString() {
        return super.toString() + ", aldersgrense:"+getAldersgrense();
    }


    private int getAldersgrense() {
        return aldersgrense;
    }


    public static void main(String[] args) {
        BarneBok bb = new BarneBok("Lillelord-trilogien ", "Johann Borgen",782, 13);
        System.out.println(bb);
        System.out.println(bb.getForfatter()); // Se hvilken getForfatter den bruker - Bok sin!

   // Java sjekker under kompilering at objekter har rett type
    Bok bok1 = new Bok("Subnaiv", "Elling Moe", 314);        // OK
    Bok bok2 = new BarneBok("ABC", "Tris Burti", 3, 6);      // OK
    //BarneBok bok3 = new Bok("Nim", "Chomp Hackenbush", 999); //OH NO!

    System.out.println(bok1); // SOm før
    System.out.println(bok2); // Bruker BarneBok sin toString()
    }
    
    
}
