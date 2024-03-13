package of5_2.lf;

public class Dog implements Animal {

    private int age;

    private String name;

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Dog(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String makeSound() {
        String sound = "Voff!";
        System.out.println(this.name + " sier " + sound);
        return sound;
    }

    public void eatBone() {
        return;
    }

    @Override
    public String toString() {
        return "Dog [age=" + age + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Animal o) {
        return this.getAge() - o.getAge();
    }

}
