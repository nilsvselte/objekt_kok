package of5_2.kode;

public interface Animal extends Comparable<Animal> {
    
    public int getAge();
    public String getName();
    public String makeSound();


    public static void main(String[] args) {
        
        Animal dog = new Dog(7, "Eirik");

        Animal chicken = new Chicken(4, "Mathea");

        dog.makeSound();
        chicken.makeSound();
        
        ((Chicken)chicken).layEgg();

    }
}
