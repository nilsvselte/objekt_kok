package of0.lf;

import java.util.ArrayList;
import java.util.List;

public class Lister {

    public static void main(String[] args) {

        // a
        ArrayList<String> list1 = new ArrayList<>();

        list1.add("Hei");
        list1.add("På");
        list1.add("Deg");

        String el = list1.get(1);

        System.out.println("Element på indeks 1 er: " + el);

        // b
        List<Double> list2 = new ArrayList<>(List.of(2.0, 1.2, 5.0));

        System.out.println(list2.size());

    }
}
