package of5_2.lf;

import java.util.Iterator;

public class YoungAnimalsIterator implements Iterator<Animal> {

    private Farm farm;
    private int index;

    public YoungAnimalsIterator(Farm farm) {
        this.farm = farm;
        this.index = this.nextLegalIndex(0);
    }

    private int nextLegalIndex(int j) {
        for (int i = j; i < this.farm.getAnimals().size(); i++) {
            Animal currentAnimal = this.farm.getAnimals().get(i);
            if (currentAnimal.getAge() <= 2) {
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

    public static void main(String[] args) {
        Farm farm = new Farm();
        farm.addAnimal(new Dog("Ludo", 12));
        farm.addAnimal(new Dog("Fido", 0));
        farm.addAnimal(new Chicken("Peter", 1));
        farm.addAnimal(new Chicken("Albert", 4));

        Iterator<Animal> iterator = new YoungAnimalsIterator(farm);
        while (iterator.hasNext()) {
            iterator.next().makeSound();
        }

        // for (Iterator<Animal> iterator = new YoungAnimalsIterator(farm);
        // iterator.hasNext();) {
        // iterator.next().makeSound();
        // }
    }

}
