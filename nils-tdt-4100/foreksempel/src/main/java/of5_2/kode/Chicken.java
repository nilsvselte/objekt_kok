package of5_2.kode;

public class Chicken implements Animal {

    private int age;
    private String name;

    public Chicken(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Chicken(String name, int age) {
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

        String sound = "klukk!";
        System.out.println(this.name + " sier " + sound);
        return sound;
    }

    public void layEgg() {
        return;
    }

    @Override
    public String toString() {
        return "Chicken [age=" + age + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Animal o) {
        return this.getAge() - o.getAge();
    }

}
