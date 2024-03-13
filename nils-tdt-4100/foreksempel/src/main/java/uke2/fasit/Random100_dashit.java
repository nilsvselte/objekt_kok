package uke2.fasit;

import java.util.Random;

public class Random100_dashit {

public int nextInt() {
    Random random = new Random();
    return random.nextInt(100);
}

    public static void main(String[] args) {
        Random100_dashit ra = new Random100_dashit();
        System.out.println(ra.nextInt());
        

    }

}