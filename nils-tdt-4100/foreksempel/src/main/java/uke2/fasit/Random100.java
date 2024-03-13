package uke2.fasit;

import java.util.Random;

public class Random100 {
    
    Random random;

    public int getRandom100(){
        return random.nextInt(100);
    }


    public Random100() {
        this.random = new Random();
    }

    public static void main(String[] args) {
        Random100 r = new Random100();
        System.out.println(r.getRandom100());
    }
}
