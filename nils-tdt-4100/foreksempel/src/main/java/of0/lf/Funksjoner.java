package of0.lf;

public class Funksjoner {

    public double divisjon(double x, double y) {
        return x / y;
    }

    public int fakultet(int x) {
        int fak = 1;

        for (int i = 1; i <= x; i++) {
            fak *= i;
        }

        return fak;
    }

    public boolean erPrimtall(int x) {
        if (x < 2) {
            return false;
        }
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Funksjoner f = new Funksjoner();
        System.out.println("Divisjon 10/3 : " + f.divisjon(10, 3));
        System.out.println("fakultet 10 : " + f.fakultet(10));
        System.out.println("Er 17 et primtall? " + f.erPrimtall(17));

    }
}
