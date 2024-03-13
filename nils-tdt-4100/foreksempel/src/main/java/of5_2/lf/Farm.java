package of5_2.lf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Farm implements Iterable<Animal>, Comparable<Farm> {

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

    public List<String> getAnimalNames() {
        return this.getAnimals()
                .stream()
                .map(a -> a.getName())
                .distinct()
                .toList();
    }

    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>(List.of(new Dog("Ludo", 12), new Dog("Fido", 0), new Chicken("Peter", 1),
                new Chicken("Albert", 4)));

        Collections.sort(animals, (a1,a2) -> a1.getName().compareTo(a2.getName()));

        for (Animal animal : animals) {
            animal.makeSound();
        }

        Farm farm = new Farm();
        farm.addAnimal(new Dog("Ludo", 12));
        farm.addAnimal(new Dog("Fido", 0));
        farm.addAnimal(new Chicken("Peter", 1));
        farm.addAnimal(new Chicken("Peter", 4));

        for (String name : farm.getAnimalNames()) {
            System.out.println(name);
        }
    }

    @Override
    public int compareTo(Farm annenFarm) {
        // if (this.getAnimals().size() < annenFarm.getAnimals().size())
        // return -1;
        // else if (this.getAnimals().size() > annenFarm.getAnimals().size())
        // return 1;
        // else{
        // return 0;
        // }

        return this.getAnimals().size() - annenFarm.getAnimals().size();

    }

}
