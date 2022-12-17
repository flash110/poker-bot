package poker.card;

public class Card {
    public Suit suit;
    public Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    public Value getValue() {
        return value;
    }
    public String toString() {
        return value + " " + suit;
    }
}
