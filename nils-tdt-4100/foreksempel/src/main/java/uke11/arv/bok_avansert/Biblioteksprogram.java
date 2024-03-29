package uke11.arv.bok_avansert;

import java.util.ArrayList;
import java.util.Collection;

public class Biblioteksprogram {

	public static void main(String[] args) {
	
		Bok bok = new Bok("Vanlig bok");
		Bok bok2 = new Bok("Uvanlig bok");
		Ordbok ordbok = new Ordbok("Nynorsk ordbok",10000);
		Tegneseriealbum tegneseriealbum = new Tegneseriealbum("Asterix",250);
		
		/*
		 * Lager en Collection samling som tar imot alle typer Bok, enten
		 * de er Bok eller subklasser av Bok. Legg merke til at når en skriver ut
		 * toString() av alle versjonene så skrives informasjon også om antallOrd
		 * og antallStriper ut, siden Bok.toString kaller GetToStringAttributes.
		 * Denne metoden skygges over i subklassene, og håndterer både superklassen
		 * sin informasjon gjennom super.GetToStringAttributes samt sine egne variable!
		 */
		Collection<Bok> samling = new ArrayList<>();
		samling.add(bok);
		samling.add(bok2);
		samling.add(ordbok);
		samling.add(tegneseriealbum);
		samling.add(new Ordbok("Engelsk-norsk ordbok",9999));
		
		// Gammel måte å skrive ut bøkene i samlingen:
		System.out.println("For-løkke:");
		for (Bok sluttBok : samling) {
			System.out.println(sluttBok); // Kaller Bok.toString(). Se nedenfra!
		}
		
		// Streamsmåte å skrive ut alle bøkene:
		System.out.println("\nStreams:");
		samling.forEach(System.out::println);

		// Filtrere ut bøkene som er ordbøker, caste dem til
		// Ordbok for å gjøre synlig flere metoder, og skrive
		// ut antall ord. På streamsmåten:
		System.out.println("\nOrdbøkene i samlingen har så mange ord: "+
			samling.stream()
			.filter(b -> b instanceof Ordbok)
			.map(b -> (Ordbok) b)
			.mapToInt(Ordbok::getAntallOrd)
			.sum());
		
		// Denne skal feile når den kommenteres ut:
		// Ordbok foo = new Ordbok("tittel",12);
		// Ordbok foo = new Ordbok("Norsk fjordbok",12);
		// foo.setTittel("Norsk-engelsk ordbøk");
		
		// En boktittel som feiler fordi den inneholder et tegn som ikke er lovlig:
		// Bok feilbok = new Bok("Denne tittelen sk@l utløse unntak");
		
		/* 
		 * For å vise hvordan typen til en variabel og det faktiske objektet
		 * fungerer lager vi en Bok som instansieres av en Ordbok. Da får vi ikke
		 * tilgang på antallOrd så lenge en ikke gjør om objektet (caster) til
		 * en Ordbok. Da bør vi først sjekke om objektet er en instanceOf Ordbok:
		 */
		Bok casteBok = new Ordbok("Engelsk-norsk ordbok",44443);
		System.out.print("Tittel: "+casteBok.getTittel()); // Det går fint, filteret er Bok.
		if (casteBok instanceof Ordbok) {
			System.out.println(", antall ord: "+((Ordbok)casteBok).getAntallOrd()); // Nå går det!
		}
	}
}
