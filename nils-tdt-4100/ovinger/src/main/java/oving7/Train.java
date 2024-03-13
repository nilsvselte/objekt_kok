package oving7;

import java.util.ArrayList;
import java.util.List;

public class Train {
    private List<TrainCar> trainList = new ArrayList<>();

    public void addTrainCar(TrainCar car){
        trainList.add(car);
    }
    public boolean contains(TrainCar car){
        return trainList.contains(car);
    }
    public int getPassengerCount(){
        return trainList.stream().filter((car) -> car instanceof PassengerCar).map((car)-> ((PassengerCar) car)).mapToInt(PassengerCar::getPassengerCount).sum();
    }
    public int getCargoWeight(){
        int retWeight =0;
        // for(TrainCar car:trainList){
        //     if(car instanceof PassengerCar){
        //         retWeight+= ((PassengerCar) car).getTotalWeight();
        //         retWeight-= ((PassengerCar) car).getDeadWeight();
        //     }
        //     else if (car instanceof CargoCar){
        //         retWeight+= ((CargoCar) car).getCargoWeight();
        //     } else{
        //         retWeight+= car.getTotalWeight()-car.getDeadWeight();
        //     }
        for(TrainCar car:trainList){
            if(car instanceof PassengerCar){
                //retWeight+= ((PassengerCar) car).getTotalWeight();
                //         retWeight-= ((PassengerCar) car).getDeadWeight();
            }
            else if (car instanceof CargoCar){
                retWeight+= ((CargoCar) car).getCargoWeight();
                } else{
                 retWeight+= car.getTotalWeight()-car.getDeadWeight();
        }
            
        }
        return retWeight;
    }
    public int getTotalWeight(){
        return trainList.stream().mapToInt(TrainCar::getTotalWeight).sum();
    }
    @Override
    public String toString(){
        String retStr="";
        for(TrainCar car:trainList){
            if(car instanceof TrainCar){
                retStr+="TrainCar, TotalWeight: "+car.getTotalWeight()+" KG :";
            }else if(car instanceof PassengerCar){
                retStr+="PassengerCar, TotalWeight: "+car.getTotalWeight()+" KG. No. of souls onboard " +((PassengerCar) car).getPassengerCount()+ ": ";
            } else{
                retStr+="CargoCar, TotalWeight: "+car.getTotalWeight()+" KG. Total cargo weight: "+((CargoCar) car).getCargoWeight()+"KG : ";
            }
        }
        return retStr;
    }
}   
