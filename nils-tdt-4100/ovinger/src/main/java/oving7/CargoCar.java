package oving7;

public class CargoCar extends TrainCar {
    int deadWeight;
    int cargoWeight;

    public CargoCar(int deadWeight, int cargoWeight) {
        super(deadWeight);
        this.cargoWeight = cargoWeight;

    }

    public int getCargoWeight() {
        return this.cargoWeight;
    }

    public void setCargoWeight(int newWeight) {
        this.cargoWeight = newWeight;
    }

    @Override
    public int getTotalWeight() {
        return getDeadWeight() + this.cargoWeight;
    }

}
