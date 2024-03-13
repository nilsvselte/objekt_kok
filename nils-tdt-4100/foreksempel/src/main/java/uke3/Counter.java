package uke3;

public class Counter {
    
    private int topp;
    private int counter;


    public Counter(int topp) {
        this.topp = topp;
        this.counter = 1;
    }
    
    public boolean count() {

        if (this.counter < this.topp){
            this.counter++;
        } 
        return this.topp == this.counter;
    }

    public boolean count(int n) {

        if (this.counter + n <= this.topp){
            this.counter += n;
        } 
        return this.topp == this.counter;
    }

    public int getCounter() {
        return counter;
    }


    public static void main(String[] args) {
        Counter c = new Counter(3);
        System.out.println(c.getCounter());
        System.out.println(c.count(100));
        System.out.println(c.count(2));
        System.out.println(c.getCounter());
        c.counter = 10000000;
        System.out.println(c.getCounter());

    }

}
