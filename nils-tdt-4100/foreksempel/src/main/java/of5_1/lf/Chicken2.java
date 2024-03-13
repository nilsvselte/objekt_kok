package of5_1.lf;

public class Chicken2  extends AbstractAnimal{

    public Chicken2(int age, String name) {
        super(age, name);
    }

    @Override
    public String makeSound() {
        String sound = "klukk!";
        System.out.println(this.getName() + " sier " + sound);
        return sound;
    }

    public static void main(String[] args) {
        AbstractAnimal chicken = new Chicken2(1,"Jostein");
        chicken.makeSound();
    }
    
}
