package uke7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Car implements Comparable<Car>{
    int seats;
    String plate;
    public int getSeats() {
        return seats;
    }
    public String getPlate() {
        return plate;
    }
    public Car(int seats, String plate) {
        this.seats = seats;
        this.plate = plate;
    }

    @Override
    public String toString() {
        return plate + "("+seats+")";
    }
    public static void main(String[] args) {
        Car car1 = new Car(1, "AA41383");
        Car car2 = new Car(3, "XX41383");
        Car car3 = new Car(7, "VY41383");
        Car car4 = new Car(2, "BE41383");

        List<Car> liste = new ArrayList<>();
        liste.add(car1);
        liste.add(car2);
        liste.add(car3);
        liste.add(car4);

        System.out.println(liste);

        Collections.sort(liste);
        System.out.println(liste);

    }
    @Override
    public int compareTo(Car o) {
        return this.plate.compareTo(o.plate);
    }
}
