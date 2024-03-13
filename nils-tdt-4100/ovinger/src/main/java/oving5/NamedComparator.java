package oving5;

import java.util.Comparator;

public class NamedComparator implements Comparator {

    public static void main(String[] args) {
        
    }
    public int compare(Named named1, Named named2) {
        if (named1.getFamilyName().compareTo(named2.getFamilyName())!=0){
            System.out.println("sammenlikner etternavn");
            System.out.println(named1.getFamilyName()+" "+named2.getFamilyName());
            return named1.getFamilyName().compareTo(named2.getFamilyName());
        }
        if (!(named1.getGivenName() == named2.getGivenName())){ //denne funket ikke over vet ikke hvorfor men passed alle tester nå
            System.out.println("sammenlikner fornavn");
            System.out.println((named1.getGivenName()+" "+named2.getGivenName()));
            return named1.getGivenName().compareTo(named2.getGivenName());
        }
        return 0;
    }
    
}
