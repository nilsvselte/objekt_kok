package uke9.movies;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.function.Predicate;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;


public class ReadMoviesSet {

    // Hva heter de ulike tingene
    String[] headers;

    // Public, bare så man kan leke med den på forelesning. Ellers vil en jo skjule dette...
    public Collection<GenericHashMap> movies = new ArrayList<>();


    // De klassene vi bruker her kommer vi litt inn på senere i semesteret!
    private void readHeaders(String filename) {
        headers = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(filename)))
            .lines().findFirst().get().split("\t");
    }

    private void readMovies(String filename) {
        try { // Denne under er et alternativ til den over. Men mye vi ikke har hatt ennå, ei heller dekker mye...
            this.movies = Files.lines(Paths.get(getClass().getResource(filename).toURI()))
            .skip(1) // Hopper over første linje, den inneholder navnet på hver kategori
            .map(s -> new GenericHashMap(headers, s.split("\t"))) // Mekke nytt objekt for hver film
            .toList();            
                
        } catch (Exception e) {
            System.out.println("Feil: "+e);
        }
    }
    
    // Konstruktør
    // Først lese første linje for å hente headers, så lese inn filmene og legge dem i samlingen
    public ReadMoviesSet(String filename) {
        this.readHeaders(filename);
        this.readMovies(filename);
    }


    public Optional<GenericHashMap> findFirstofType(Predicate<GenericHashMap> pred) {
        return this.movies.stream().filter(pred).findFirst();
    }

    public static void main(String[] args) {
        ReadMoviesSet rf = new ReadMoviesSet("movies.txt");
        // System.out.println("Første film: "+rf.movies.stream().findFirst().get());
        // System.out.println("\nAntall filmer: "+
        //     rf.movies.stream().filter(m -> m.getData("titleType").equals("movie")).count());


        Predicate<GenericHashMap> isMovie = movie -> movie.getData("titleType").equals("movie");

        // System.out.println("\nFilmer med 'The' i tittel: "+
        // rf.movies.stream()
        //     .filter(m -> m.getData("titleType").equals("movie"))
        //     .filter(m -> m.getData("primaryTitle").contains("The"))
        //     // .peek(System.out::println)
        //     .map(m -> m.getData("primaryTitle"))
        //     .toList());

        
        // Når ble alle ting som har startdato filmet, i snitt: Denne er nok litt rotete, mer prinsippet.
        // System.out.println("Snitt startår: "+rf.movies.stream()
        //     .filter(m -> !m.getData("startYear").equals("\\N"))
        //     .mapToInt(m -> Integer.parseInt(m.getData("startYear").equals("\\N") ? 
        //         "0" : m.getData("startYear")))
        //     .sum() / 
        //     rf.movies.stream().filter(m -> !m.getData("startYear").equals("\\N")).count());


        // Hva hvis en søker og det ikke finnes noen treff?
        // La oss skrive ut den første innslaget av type 'movie'
        // System.out.println(rf.findFirstofType(isMovie));
        // System.out.println(rf.findFirstofType(m -> m.getData("titleType").equals("lala")));
        
        // Hva skjer hvis man søker på noe som ikke finnes, og forsøker å skrive det ut?
        // Exception in thread "main" java.util.NoSuchElementException: No value present
        // Dette håndteres ved at .get() returnerer en ny klasse, Optional. Denne kan man
        // teste om har en verdi eller ikke. Hvis den har det, så kan man hente ut denne.
        // Hvis den ikke fikk en treff kan man gjøre noe annet (som ikke kræsjer)

        Optional<GenericHashMap> possiblehit = rf.findFirstofType(m -> m.getData("titleType").equals("lala"));

        // Så kan man teste den, og eventuelt hente ut GenericHashMap-objektet med get().
        if (possiblehit.isPresent()) System.out.println("Treff: "+possiblehit.get()); 
        else System.out.println("No hit");
        
        // Det finnes masse ekstra metoder rundt dette med Optional, men vi bare nevner det her.

    }
}
