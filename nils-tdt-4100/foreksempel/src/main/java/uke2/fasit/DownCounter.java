package uke2.fasit;

public class DownCounter {
    int counter;

    public DownCounter(int counter){
        this.counter = counter;
    }

    public boolean isFinished() {
        return counter == 0;
    }

    public void countDown() {
        if (counter > 0) {
            counter -= 1;
        }    
}

    public static void main(String[] args) {
        DownCounter dc = new DownCounter(4);
        for (int i = 0; i < 5; i++) {
            System.out.println(dc.isFinished());
            dc.countDown();
        }
    }
}
