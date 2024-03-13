package of5_1.lf;

import java.util.Comparator;

public class AnimalAgeComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {

        // if (o1.getAge() < o2.getAge())
        //     return -1;
        
        // else if (o1.getAge() > o2.getAge())
        //     return 1;
        
        // else{
        //     return 0;
        //     }
        return o1.getAge() - o2.getAge() ;
    }
    
}
