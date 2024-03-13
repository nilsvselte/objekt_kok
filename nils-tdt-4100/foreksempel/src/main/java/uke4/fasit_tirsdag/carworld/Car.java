package uke4.fasit_tirsdag.carworld;

import java.util.ArrayList;
import java.util.Collection;

public class Car {

    private String plate;

    private Person driver;

    private Collection<Person> passengers;

    private int seats;

    public Car(String regNr, Person driver, int seats) {

        this.setDriver(driver);
        this.setPlate(regNr);
        this.passengers = new ArrayList<Person>();
        this.setSeats(seats);

    }

    private void setPlate(String regNr) {
        this.checkRegNr(regNr);
        this.plate = regNr;
    }

    private void checkRegNr(String regNr) {
        if (Plate.isValid(regNr)) {
            this.plate = regNr;
        } else {
            throw new IllegalArgumentException("Ugyldig regnr");
        }
    }

    public void setDriver(Person p) {
        if (p.getAge() >= 18 && p.getLicense()) {
            this.driver = p;
        } else {
            throw new IllegalArgumentException("Person kan ikke kjøre");
        }
    }

    public void setSeats(int seats) {
        if (seats < 1) {
            throw new IllegalArgumentException("Kan ikke ha mindre enn 1 sete");
        }
        this.seats = seats;
    }

    public void addPassenger(Person p) {

        int passasjerer = this.passengers.size();

        if (seats - passasjerer <= 1) {
            throw new IllegalArgumentException("Ikke plass til flere");
        }
        this.passengers.add(p);
    }

    public void removePassenger(Person p) {
        this.passengers.remove(p);
    }

    @Override
    public String toString() {
        return "Car [plate=" + plate + ", driver=" + driver + ", passengers=" + passengers + ", seats=" + seats + "]";
    }

    public static void main(String[] args) {
        Person d = new Person("Jostein", 24, true);

        Person b = new Person("Børge");

        Car car = new Car("AB12345", d, 3);

        System.out.println(car);

        car.addPassenger(b);
        System.out.println(car);
        car.removePassenger(b);
        System.out.println(car);

    }

}
