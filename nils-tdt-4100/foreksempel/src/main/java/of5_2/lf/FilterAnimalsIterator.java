package of5_2.lf;

import java.util.Iterator;
import java.util.function.Predicate;

public class FilterAnimalsIterator implements Iterator<Animal> {
    
    private Farm farm;
    private int index;
    private Predicate<Animal> predicate;

    public FilterAnimalsIterator(Farm farm, Predicate<Animal> predicate) {
        this.farm = farm;
        this.predicate = predicate;

        this.index = this.nextLegalIndex(0);
    }

    private int nextLegalIndex(int j) {
        for (int i = j; i < this.farm.getAnimals().size(); i++) {
            Animal currentAnimal = this.farm.getAnimals().get(i);
            if (predicate.test(currentAnimal)) {
                return i;
            }
        }
        return this.farm.getAnimals().size();
    }

    @Override
    public boolean hasNext() {
        int nextIndex = this.nextLegalIndex(this.index);

        if (nextIndex < this.farm.getAnimals().size())
            return true;
        else {
            return false;
        }
    }

    @Override
    public Animal next() {

        Animal animal = this.farm.getAnimals().get(this.index);

        this.index = this.nextLegalIndex(this.index + 1);
        return animal;
    }

}
