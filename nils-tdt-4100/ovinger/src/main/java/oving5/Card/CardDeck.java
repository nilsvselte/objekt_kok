package oving5.Card;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class CardDeck{
    public int n;
    List<Card> deck = new ArrayList<Card>();

    // Constructor
    public CardDeck(int n) {
        if (!(n >= 0 && n <= 13)) {
            throw new IllegalArgumentException("Number must be between 1 and 13");
        }
        this.n = n;
        for (int i = 1; i <= n; i++) {
            deck.add(new Card('S', i));
        }
        for (int i = 1; i <= n; i++) {
            deck.add(new Card('H', i));
        }
        for (int i = 1; i <= n; i++) {
            deck.add(new Card('D', i));
        }
        for (int i = 1; i <= n; i++) {
            deck.add(new Card('C', i));
        }
    }
    //ØVING 5
    public boolean hasCard(Predicate<Card> predicate){
        return deck.stream().anyMatch(predicate);
    }
    public long getCardCount(Predicate<Card> predicate){
        //skal returnere hvor mange kort som tilfredsstiller predicate
       return deck.stream().filter(predicate).collect(Collectors.counting());
    }
    public List<Card> getCards(Predicate<Card> predicate){
        //skal returnere en liste med kort som oppfyller predicate
        return deck.stream().filter(predicate).collect(Collectors.toList());
    }
    public int getCardCount() {
        return deck.size();
    }
    // ØVING 5 slut.
    public Card getCard(int n) {
        if (n > deck.size()) {
            throw new IllegalArgumentException("Card deck does not contain" + n + "cards");
        }
        return deck.get(n);
    }

    public void shufflePerfectly() {
        List<Card> shuffledDeck = new ArrayList<Card>();
        int middle = (deck.size()) / 2;
        for (int i = 0; i < middle; i++) {
            shuffledDeck.add(deck.get(i));
            shuffledDeck.add(deck.get(i + middle));
        }
        this.deck = shuffledDeck;
    }

    public void deal(CardHand cardHand, int n) {
        if (n > deck.size()) {
            throw new IllegalArgumentException("n bigger than size of card deck");
        }
        for (int i = 0; i < n; i++) {
            cardHand.addCard(deck.get(deck.size() - 1));
            deck.remove(deck.size() - 1);
        }
    }
}
