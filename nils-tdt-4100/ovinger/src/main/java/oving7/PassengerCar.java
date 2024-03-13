package oving7;

public class PassengerCar extends TrainCar{
    private int passengers;
    public PassengerCar(int deadWeight, int passengers){
        super(deadWeight);
        this.passengers = passengers;
    }

    public int getPassengerCount(){
        return this.passengers;
    }
    public void setPassengerCount(int newNoPassengers){
        this.passengers = newNoPassengers;
    }
    @Override
    public int getTotalWeight(){
        return this.passengers*80 + getDeadWeight();
    }
}
