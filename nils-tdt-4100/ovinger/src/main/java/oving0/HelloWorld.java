package oving0;

import java.util.function.Predicate;

public class HelloWorld implements FlyAndLand{
    public int i;
    public static void main(String[] args) {
        HelloWorld Hw1 = new HelloWorld();
        System.out.println(Hw1.i);   
       // Hw1.fly();
        System.out.println(Integer.toString(Integer.rotateLeft(234,1234)));
        String str = "NRK";
        String str1 = "NRK";
        System.out.println("str"=="str");
    }
    @Override
    public void fly() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fly'");
    }
    @Override
    public void land() {
        return;
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'land'");
    }
}
