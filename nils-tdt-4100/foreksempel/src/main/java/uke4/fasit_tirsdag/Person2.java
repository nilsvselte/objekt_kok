package uke4.fasit_tirsdag;

public class Person2 {

    private String fullName;

    public Person2(String firstName, String lastName) {

        setFullName(firstName + " " + lastName);
    }

    public String getFirstName() {
        return this.fullName.split(" ")[0];
    }

    public String getLastName() {
        return this.fullName.split(" ")[1];
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFirstName(String firstName) {

        String etternavn = this.fullName.split(" ")[1];

        this.fullName = firstName + " " + etternavn;

    }

    public void setLastName(String lastName) {
        String fornavn = this.fullName.split(" ")[0];

        this.fullName = fornavn + " " + lastName;

    }

    public void setFullName(String fullName) {

        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return getFullName();
    }

    public static void main(String[] args) {

        Person2 p1 = new Person2("Per", "Hansen");

        System.out.println(p1);

        p1.setFirstName("Ola");

        System.out.println(p1);

        p1.setFullName("Inge Johnsen");
        System.out.println(p1);

    }
}
