package of1.lf;

public class Car {
    
    String brand;
    String model;
    int year;
    int kmDriven;
    double speed;

    Car(String brand, String model, int year, int kmDriven) {
        this.brand = brand;
        this.model = model;
        this.year = Math.max(1950, year);
        this.kmDriven = Math.max(0, kmDriven);
        this.speed = 0.0;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getKmDriven() {
        return kmDriven;
    }

    public void setKmDriven(int kmDriven) {
        this.kmDriven = kmDriven;
    }

    public double getSpeed() {
        return speed;
    }

    public void accelerate(double acceleration) {
        if (acceleration > 0) {
            this.speed += acceleration;
        }
    }

    public void brake(double brakeAmount) {
        if (brakeAmount > 0) {
            this.speed = Math.max(0, this.getSpeed() - brakeAmount);
        }
    }

    @Override
    public String toString() {
        return "Car [brand=" + brand + ", model=" + model + ", year=" + year + ", kmDriven=" + kmDriven + ", speed="
                + speed + "]";
    }

    public static void main(String[] args) {
        Car car = new Car("Tesla", "Model K", 2015, 10000);
        System.out.println(car);

        car.accelerate(100.0);
        System.out.println(car);

        car.brake(25.5);
        System.out.println(car);
    }
}
