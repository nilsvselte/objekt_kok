package of5_1.lf;

public abstract class AbstractAnimal {
    private int age;

    private String name;
    
    public AbstractAnimal(int age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public abstract String makeSound();
    
}
