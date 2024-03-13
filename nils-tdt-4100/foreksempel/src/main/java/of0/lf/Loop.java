package of0.lf;

public class Loop {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) { // i++ er det samme som i += 1

            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        int j = 0;

        while (j < 10) {
            System.out.println(j);
            j++;
        }
    }
}
