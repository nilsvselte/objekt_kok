package of5_2.kode;

import java.util.Comparator;

public class AnimalTypeComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {

        if (o1 instanceof Dog && o2 instanceof Chicken)
            return -1;
        
        if (o1 instanceof Chicken && o2 instanceof Dog)
            return 1;

        return 0;
    }

   
    
}
