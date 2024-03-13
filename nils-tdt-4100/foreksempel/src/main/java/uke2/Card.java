package uke2;

public class Card {
    
    Character suit;
    Integer value;

    public Card(Character suit, Integer value) {
        this.suit = suit;
        this.value = value;
    }

    @Override
    public String toString() {
        switch (this.suit) {
            case 'D':
                return value+" of diamonds";
            case 'S':
                return value+" of spades";
            case 'C':
                return value+" of clubs";
            case 'H':
                return value+" of hearts";
            default:
                return "Illegal card suit '"+suit+"'snuck in, somehow. Oh, and value is "+value+".";
        }
    }


    public static void main(String[] args) {
        Card kort1 = new Card('S',12);
        Card kort2 = new Card('D',1);
        Card kort3 = new Card('X',100);

        System.out.println(kort1.toString()+" og "+kort2.toString()+".");
        System.out.println(kort3);

    }
}
