package oving5;

public class Person2 implements Named {
    private String fullName;
    public static void main(String[] args) {
        // Person2 p2 = new Person2("Halla Hallo");
        // System.out.println(p2.getFullName());
        // p2.setGivenName("Hei");
        // System.out.println(p2.getFullName());
        // p2.setFamilyName("Boo");
        // System.out.println(p2.getGivenName());

    }
    // Contructor
    public Person2(String fullName) {
        this.fullName = fullName;
        String[] names = fullName.split(" ");
        setFamilyName(names[1]);
        setGivenName(names[0]);
    }

    @Override
    public void setGivenName(String name) {
        String[] names = this.fullName.split(" ");
        this.fullName = name + " " + names[1];
    }

    @Override
    public void setFamilyName(String name) {
        String[] names = this.fullName.split(" ");
        this.fullName = names[0] + " " + name;
    }

    @Override
    public void setFullName(String name) {
        this.fullName = name;
    }

    @Override
    public String getGivenName() {
        return this.fullName.split(" ")[0];
    }

    @Override
    public String getFamilyName() {
        return this.fullName.split(" ")[1];
    }

    @Override
    public String getFullName() {
        return this.fullName;
    }

}
