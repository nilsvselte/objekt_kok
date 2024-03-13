package uke9.iostreams;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FilLeser {
    
    public static void main(String[] args) {
        try (Reader reader = new FileReader(new File("C:/z/tekst.txt"))) {
            char[] buffer = new char[1000];
            int charCount = reader.read(buffer);
            System.out.println("Antall tegn i filen: "+charCount);
            for (int i = 0; i < buffer.length; i++) {
                System.out.println("Tegn: "+buffer[i]);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
