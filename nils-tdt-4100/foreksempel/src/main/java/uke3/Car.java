package uke3;

public class Car {
    
    Person eier;
    String regnr;


    public Person getEier() {
        return this.eier;
    }

    public void setEier(Person eier) {
        this.eier = eier;
    }

    public String getRegnr() {
        return this.regnr;
    }

    public void setRegnr(String regnr) {
        this.regnr = regnr;
    }


    public static void main(String[] args) {
        Person p = new Person("Ida", 33);
        Car c = new Car();
        // c.setEier(p);
        System.out.println(c.getEier());
        p.navn = "Albertine";
    }

}
