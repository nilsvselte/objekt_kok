package uke2.fasit;

public class Average {
    
    int sum; 
    double antall;

    public void acceptValue(int n) {
        sum += n;
        antall += 1;
    }

    public double getAverage() {
        if (antall > 0) {
            return sum/antall;}
        return 9999999;   
    }


    public Average(int sum, int antall) {
        this.sum = sum;
        this.antall = antall;
    }
    

    public Average() {
    }

    public static void main(String[] args) {
        Average avg = new Average();
        System.out.println(avg.getAverage());
        avg.acceptValue(100);
        avg.acceptValue(3);
        System.out.println(avg.getAverage());
        avg.acceptValue(1000);
        System.out.println(avg.getAverage());
    }

}
