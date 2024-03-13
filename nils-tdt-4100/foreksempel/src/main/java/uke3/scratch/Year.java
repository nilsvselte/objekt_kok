package uke3.scratch;

public class Year {
    
    private int year;
    private float temp;


    public Year(int year, float temp) {
        this.year = year;
        this.temp = temp;
    }

    public float getTemp() {
        return temp;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return year+": "+temp;
    }

    public static void main(String[] args) {
        Year y1 = new Year(1973, 33);
        System.out.println(y1.getTemp());
        System.out.println(y1);
    }
}
