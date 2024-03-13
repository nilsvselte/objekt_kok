package uke4.fasit_tirsdag;

public class Person1 {


    private String firstName;

    private String lastName;


    public Person1(String firstName, String lastName){
        setFirstName(firstName);
        setLastName(lastName);
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }


    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setFullName(String fullName){

        String fornavn = fullName.split(" ")[0];
        String etternavn = fullName.split(" ")[1];

        this.firstName = fornavn;
        this.lastName = etternavn;
    }

    @Override
    public String toString() {
        return getFullName();
    }



    public static void main(String[] args) {
        
        Person1 p1 = new Person1("Per Ola", "Hansen");

        System.out.println(p1);
        
        p1.setFirstName("Ola");
        
        System.out.println(p1);

        p1.setFullName("Inge Johnsen");
        System.out.println(p1);

    }



}
