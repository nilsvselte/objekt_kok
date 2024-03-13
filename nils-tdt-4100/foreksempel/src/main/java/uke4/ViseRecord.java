package uke4;

public record ViseRecord(String first, String last) {
    
    String whole() {
        return first+" "+last;
    }

    public static void main(String[] args) {
        ViseRecord vr = new ViseRecord("Børge","Haugset");
        System.out.println(vr);
        System.out.println(vr.first);
        System.out.println(vr.whole());
        // t.first = "Per"; // Men dette kan man ikke gjøre, fordi records kun er lesbare etter at de er laget.
    }
}
