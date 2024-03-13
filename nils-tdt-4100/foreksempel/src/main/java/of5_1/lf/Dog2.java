package of5_1.lf;

public class Dog2 extends AbstractAnimal {

    public Dog2(int age, String name) {
        super(age, name);
    }

    @Override
    public String makeSound() {
        String sound = "Voff!";
        System.out.println(this.getName() + " sier " + sound);
        return sound;
    }
    
}
