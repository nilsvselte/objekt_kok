package uke3.scratch;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    
    private List<Year> liste = new ArrayList<>();

    public void addYear(Year year) {
        liste.add(year);
    }

    public Year getPlace(int i) {
        if (i < liste.size()) {
            return liste.get(i);
        }
        return null;  
    }

    public static void main(String[] args) {
        Storage s = new Storage();
        s.addYear(new Year(1974, 30));
        s.addYear(new Year(1973, 33));
        s.addYear(new Year(1973, 33));
        s.addYear(new Year(1973, 33));
        System.out.println(s.getPlace(55));
        

    }

}
