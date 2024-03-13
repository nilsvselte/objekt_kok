package of0.lf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Itgk {

    public static boolean TreLike(String s1, String s2) {

        return s1.toLowerCase().substring(0, 3).equals(s2.toLowerCase().substring(0, 3));

        // eventuelt
        // return s1.substring(0, 3).equalsIgnoreCase(s2.substring(0, 3));

    }

    public static int SumPosOdd(List<Integer> liste) {
        int sum = 0;

        for (int tall : liste) {

            if (tall > 0 && tall % 2 == 0) {
                sum += tall;
            }
        }
        return sum;
    }

    public static ArrayList<String> SplitString(String string, String karakter) {
        String[] splitted = string.split(karakter);

        return new ArrayList<>(Arrays.asList(splitted));

    }

    public static void main(String[] args) {

        System.out.println(Itgk.TreLike("Bord", "BoRReMaskin"));
        System.out.println(Itgk.TreLike("Java", "Python"));

        List<Integer> list = new ArrayList<>(List.of(2, -3, 5, -1, 7, 6, 4));

        System.out.println(Itgk.SumPosOdd(list));

        String string = "Hakuna Matata";
        String karakter = "a";

        System.out.println(Itgk.SplitString(string, karakter));

    }
}
