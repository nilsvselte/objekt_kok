package uke2.fasit;

public class Average2 {
    
    int valueCount;
    double sum;


    public Average2() {
    }

    public void acceptValue(int tall) {
        valueCount += 1;
        sum += tall;
    }

    public double getAverage() {
        return sum/valueCount;
    }

    public static void main(String[] args) {
        Average2 avg = new Average2();
        avg.acceptValue(33);
        avg.acceptValue(100);
        System.out.println(avg.getAverage());
    }

}
