import java.uit.*;

class DeckOfCards {

    public enum Suit {
        SPADE, HEART, DIAMOND, CLUB
    };

    public class Card {
        int faceValue;
        Suit suit;

        public Card(int fv, Suit suit) {
            this.faceValue = fv;
            this.suit = suit;
        }
    }

    public class Deck {
        List<Card> cardDeck;

        public Deck() {
            this.cardDeck = new ArrayList<>();
            for (int i = 1; i <= 13; i++) {
                for (Suit suit : Suit.values()) {
                    cardDeck.add(new Card(i, suit));
                }
            }
        }
    }

}