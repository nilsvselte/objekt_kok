package uke9.movies;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;


/**
 * Målet her er å vise at vi kan lage en generisk klasse som støtter innlegging av data. 
 * Selve typen har ikke noe å gjøre med at det er filmer som skal lagres.
 * 
 * Dette kunne jo i prinsippet ha sluppet å ha en egen klasse for dette, og at ReadMoviesSet
 * i stedet har en Collection<HashMap>. Greit med en ekstra klasse, kanskje... 
 */
public class GenericHashMap {

    HashMap<String, String> info = new HashMap<>();


    public GenericHashMap(String[] headers, String[] data) {
        for (int i = 0; i < headers.length; i++) {
            info.put(headers[i], data[i]);
        }

    }


    public String getData(String header) {
        return info.get(header);
    }


    @Override
    public String toString() {
        Collection<String> tmp = new ArrayList<>();
        for (String string : info.keySet()) {
            tmp.add(string+":"+info.get(string));
        }
        return "["+String.join(", ", tmp)+"]";
    }
}


