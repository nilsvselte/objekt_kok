package of0.lf;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv inn et tall: ");

        try {
            int tall = scanner.nextInt();
            System.out.println("Du skrev inn: " + tall);
        } catch (Exception e) {
            System.out.println("Det var ikke et tall :(");
        }

        // alternativt :

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Skriv inn et tall: ");

        String input = scanner2.nextLine();
        try {
            int tall = Integer.parseInt(input);
            System.out.println("Tallet er: " + tall);

        } catch (NumberFormatException e) {
            System.out.println("Det var ikke et tall :(");
        }

        scanner.close();
        scanner2.close();
    }
}
