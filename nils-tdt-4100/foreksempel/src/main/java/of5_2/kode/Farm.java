package of5_2.kode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Farm implements Iterable<Animal> {

    private List<Animal> animals;

    public Farm() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public List<Animal> getAnimals() {
        return new ArrayList<Animal>(this.animals);
    }

    @Override
    public Iterator<Animal> iterator() {
        return animals.iterator();
    }

    public static void main(String[] args) {

    }

}
