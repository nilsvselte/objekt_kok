package uke3.fasit;

public class Person {
    
    String name;

    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person person = new Person("Ida");
        System.out.println(person.getName());
    }
}
