package oving5.Card;

import java.util.ArrayList;
import java.util.List;

public class CardHand {

    public CardHand(){
    }

    List<Card> hand = new ArrayList<Card>();

    public int getCardCount(){
        return hand.size();
    }

    public Card getCard(int n){
        if(n > hand.size()){
            throw new IllegalArgumentException("Card hand does not contain" + n + "cards");
        }
        return hand.get(n);
    }

    public void addCard(Card card){
        this.hand.add(card);
    }

    public Card play(int c){
        if(c > hand.size() - 1){
            throw new IllegalArgumentException("Not " + c + "cards in the hand");
        }
        Card remove = hand.get(c);
        hand.remove(c);
        return remove;
    }

}
