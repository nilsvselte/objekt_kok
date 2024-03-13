package uke4.fasit;

public class Person1 {

    private String givenName;
    private String familyName;
 
    public Person1(String givenName, String familyName) {
       this.givenName = givenName;
       this.familyName = familyName;
    }
 
    public String getGivenName() {
       return this.givenName;
    }
    public void setGivenName(String givenName) {
       this.givenName = givenName;
    }
 
    public String getFamilyName() {
       return this.familyName;
    }
    public void setFamilyName(String familyName) {
       this.familyName = familyName;
    }
 
    public String getFullName() {
       return this.givenName + " " + this.familyName;
    }
    public void setFullName(String fullName) {
       int pos = fullName.indexOf(' ');
       this.givenName = fullName.substring(0, pos);
       this.familyName = fullName.substring(pos + 1);
    }

    public static void main(String[] args) {
      Person1 p1 = new Person1("Børge", "Haugset");
      System.out.println(p1.getFamilyName());
    }
 }
 