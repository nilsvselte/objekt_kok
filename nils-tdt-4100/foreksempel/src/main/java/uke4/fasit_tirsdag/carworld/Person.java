package uke4.fasit_tirsdag.carworld;

public class Person {

    private String name;

    private int age;

    private boolean license;

    public Person(String name, int age, boolean license) {
        this.name = name;
        this.setAge(age);
        this.license = license;
    }

    public Person(String name) {
        this(name, 42, false);
    }

    public Person() {
        this("Børge");
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Ikke lov med negativ alder");
        }
        this.age = age;
    }

    public void misteLappen() {
        this.license = false;
    }

    public void passDrivingTest() {
        this.license = true;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public boolean getLicense() {
        return this.license;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", license=" + license + "]";
    }

    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p);

        p.passDrivingTest();
        System.out.println(p);

        try {
            p.setAge(-1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Hei");

    }

}
