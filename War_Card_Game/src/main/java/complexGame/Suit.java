package main.java.complexGame;

public enum Suit {
    CLUBS("Clubs"),
    SPADES("Spades"),
    HEARTS("Hearts"),
    DIAMONDS("Diamonds");
    private final String suit;

    Suit(String suit) {
        this.suit = suit;
    }

    public String getSuit() {
        return suit;
    }
}
