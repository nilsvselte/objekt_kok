package uke2.fasit;

public class Kake {
    String kaketype;
    int stykker;


    public Kake(String kaketype, int stykker) {
        this.kaketype = kaketype;
        this.stykker = stykker;
    }
    

    public String getStykke(){
        if (stykker > 0) {
            stykker -= 1;
            return "Namnam";
        }
        else {
            return "Ingen kake på deg. La dem spise brød.";
        }
    }

    public static void main(String[] args) {
        Kake kake = new Kake("Banankake", 2);
        for (int i = 0; i < 4; i++) {
            System.out.println(kake.getStykke());
        }
    }
}
