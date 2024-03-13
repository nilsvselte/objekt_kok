package oving7;

public class TrainCar {
    //Contructor
    private int deadWeight; 
    public TrainCar(int weight){
        this.deadWeight = weight;
    }
    
    public int getTotalWeight(){
        return deadWeight;
    }
    public void setDeadWeight(int weight){
        this.deadWeight = weight;
    }
    public int getDeadWeight(){
        return deadWeight;
    }
    
}
