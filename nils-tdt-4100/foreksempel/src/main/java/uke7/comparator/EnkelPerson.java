package uke7.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EnkelPerson {
    String navn;

    public String getNavn() {
        return navn;
    }

    public EnkelPerson(String navn) {
        this.navn = navn;
    }

    public static void main(String[] args) {
        List<EnkelPerson> simpletons = new ArrayList<>();
        simpletons.add(new EnkelPerson("Per"));
        simpletons.add(new EnkelPerson("Pål"));
        simpletons.add(new EnkelPerson("Espen"));

        Collections.sort(simpletons);
//        simpletons.sort(new EnkelPersonSortering());
    }
}
