package uke3.fasit;

public class Car {

    Person owner;

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public static void main(String[] args) {
        
        Car car = new Car();
        System.out.println(car.getOwner());
        Person person = new Person("Amanda");
        car.setOwner(person);
        System.out.println(car.getOwner().getName());

    }

}
