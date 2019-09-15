package main.java;

public class Card {
    private int cardNumber;
    private static String[] suit = {"Diamonds", "Hearts", "Spades", "Clubs"};
    private static String[] rank = {"2", "3","4","5","6","7","8", "9","10", "Jack", "Queen", "King", "Ace"};

    Card (int cardNumber){
        setCardNumber (cardNumber);
    }

    private void setCardNumber(int number) {
        cardNumber = (number >= 0 && number <= 51)? number: 0;
    }
    public int getCardNumber() {
        return cardNumber;
    }
    public String getSuit() {
        return suit[cardNumber%13];
    }
    public String getRank() {
        return rank[cardNumber%13];
    }
    public String toString(){
        return rank[cardNumber%13]+" of "+suit[cardNumber%13];
    }


}
