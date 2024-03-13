package oving5;

public class Card {
    public char suit;
    public int face;


    public boolean checkValue(char suit, int face){
        if(!(suit == 'S' || suit == 'H' || suit == 'D' || suit == 'C')){
            throw new IllegalArgumentException("Not a valid suit");
        }
        if(!(face > 0 && face <= 13)){
            throw new IllegalArgumentException("Not a valid face, must be between 1 and 13");
        }
        return true;
    }

    public Card(char suit, int face) {
        if (checkValue(suit, face)){
            this.suit = suit;
            this.face = face;
        }    
    }

    public char getSuit() {
        return suit;
    }

    public int getFace() {
        return face;
    }

    public String toString(){
        return suit + Integer.toString(face);
    }
    
    public static void main(String[] args) {
        Card card1 = new Card('S', 5);
        System.out.println(card1);
        Card card2 = new Card('H', 13);
        System.out.println(card2);
        Card card3 = new Card('=', 5);
        System.out.println(card3);
    }
}
