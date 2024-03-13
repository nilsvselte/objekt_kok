package of5_1.lf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Farm implements Iterable<Animal> {

    private List<Animal> animals;


    public Farm(){
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public List<Animal> getAnimals(){
        return new ArrayList<Animal>(this.animals);
    }

    @Override
    public Iterator<Animal> iterator() {
        return animals.iterator();
    }
    public static void main(String[] args) {
        Animal dog1 = new Dog(4, "Eirik");
        Animal dog2 = new Dog(5, "Jostein");

        Animal chicken1 = new Chicken(6, "Dag Olav");
        Animal chicken2 = new Chicken(3, "Børge");

        Farm farm = new Farm();

        farm.addAnimal(dog1);
        farm.addAnimal(chicken1);
        farm.addAnimal(chicken2);
        farm.addAnimal(dog2);
        
        List<Animal> dyr = farm.getAnimals();

        // System.out.println(dyr);

        // dyr.sort(new AnimalAgeComparator());
        // dyr.sort(new AnimalTypeComparator());

        // dyr.sort(null);
        // Collections.sort(dyr);
        // System.out.println(dyr);

        for (Animal a : farm){
            a.makeSound();
        }


        farm.forEach(a -> a.makeSound());


    }


}
