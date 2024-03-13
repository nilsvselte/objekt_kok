package uke9.iostreams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class BrukPrintStream {
    public static void main(String[] args) {

        String tekst = "Dette er kort tekst jeg vil skrive til en fil";

        try (FileOutputStream fos = new FileOutputStream("c:/Users/borgeha/utfil.txt")) {
            PrintStream output = new PrintStream(fos);
            output.println(tekst);
            // output.close(); // Ikke nødvendig siden den lukker automatisk

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
