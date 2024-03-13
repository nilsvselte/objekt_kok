package uke4.fasit_tirsdag.carworld;

public class Plate {

    private String regNr;

    public Plate(String regNr) {

        if (Plate.isValid(regNr)) {
            this.regNr = regNr;
        } else {
            throw new IllegalArgumentException("Ugyldig regnr");
        }
    }

    public static boolean isValid(String regNr) {

        if (regNr.length() != 7) {
            return false;
        }
        // nå vet vi at lengden er 7
        for (int i = 0; i < regNr.length(); i++) {
            char c = regNr.charAt(i);

            if (i < 2) {
                if (!Character.isAlphabetic(c)) {
                    return false;
                }
            } else {
                if (!Character.isDigit(c)) {
                    return false;
                }
            }
        }

        return true;
    }

    @Override
    public String toString() {
        return this.regNr;
    }

    public static void main(String[] args) {

        System.out.println(Plate.isValid("AB12312345"));

    }

}
