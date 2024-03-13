package oving5;

public class Person1 implements Named {
    String firstName;
    String familyName;

    public static void main(String[] args) {
        // person1 p1 = new person1("Bob", "mARLEY");
        // System.out.println(p1.getFullName());
        // p1.setFullName("Bars og");
        // System.out.println(p1.getFullName());
    }

    // Contructor
    public Person1(String firstName, String familyName) {
        setGivenName(firstName);
        setFamilyName(familyName);
    }

    public void setGivenName(String name) {
        this.firstName = name;
    }

    public void setFamilyName(String name) {
        this.familyName = name;
    }

    public void setFullName(String name) {
        String[] names = name.split(" ");
        setFamilyName(names[1]);
        setGivenName(names[0]);
    }

    public String getGivenName() {
        return this.firstName;
    }

    public String getFamilyName() {
        return this.familyName;
    }

    public String getFullName() {
        return getGivenName() + " " + getFamilyName();
    }
}
