// En package er en måte å definere et sett med klasser som hører sammen.
// Tenk gjerne at de ligger i samme folder.
// https://www.w3schools.com/java/java_packages.asp

package uke2;

// Import - vi må fortelle Java hva slags ting vi bruker
// 
import java.util.ArrayList;
import java.util.List;
/*

Hvorfor både ArrayList og List? Det kommer vi til senere.
Inntil videre kan du tenke: Jeg ønsker å lage en List, men velger å bruke klassen
ArrayList til å lage den. Senere lærer dere at man kan ha ulike klasser som
gjør den samme jobben, men der noen er lurere enn andre i ulike situasjoner. 

gFor å kjøre noe i Java må en ha mer 'stuff'.
Man må lage en 'klasse'. Hvordan vi gjør det kommer vi tilbake til, nå skal dere
bare forsøke å se hva som skjer. Se likheter og forskjeller.

En klasse kan ha et sett med metoder knyttet til seg.
En metode er en funksjon som er knyttet til et objekt.
Når du brukte liste.append() i Python brukte du egentlig metoden append, som finnes
i klassen List i Python.

*/

public class Liste {

    // Metoden main er spesiell. Når du kjører Liste så vil metoden main utføres automatisk.
    // main for Liste vil KUN kjøres hvis det er Liste som kjøres, ikke hvis man bruker et
    // Liste-objekt en annen plass.  

    // I dette eksempelet oppretter vi klassen Liste kun for å kjøre main. Vi lager ikke noe
    // egne ting. 
    public static void main(String[] args) {
    List<Integer> liste = new ArrayList<>();
    liste.add(1);
    System.out.println(liste);
    liste.add(2);
    System.out.println(liste);

    // Jeg kan ikke plutselig gjøre om en variabel til en annen type, slik en kan i Python:
    // liste = 2;

    // Man kan bruke 'var' når man definerer en ny variabel:
    var liste2 = new ArrayList<>();
    System.out.println(liste.getClass());
    // Den leser hva slags klasse en bruker på høyre side. 
    // Jeg synes personlig ikke at det nødvendigvis er så mye mer lesbart å bruke var...
 }   
}
