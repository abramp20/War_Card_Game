package main.java;

import java.util.ArrayList;
import java.util.Collections;

public class SimpleGame {
    public static void main(String[] args) {
        //create deck of cards
        ArrayList<Integer> deck = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 2; j < 16; j++) {
                deck.add(j);
            }
        }

        //shuffle deck
        Collections.shuffle(deck);

        //split deck in 2
        int player1 = 0;
        ArrayList<Integer> hand1 = new ArrayList<>();
        for (int i = 0; i < 26 ; i++) {
            hand1.add(deck.get(i));
        }
        int player2 = 0;
        ArrayList<Integer> hand2 = new ArrayList<>();
        for (int i = 26; i < 53 ; i++) {
            hand2.add(deck.get(i));
        }

        //compare top card, repeat
        for (int i = 0; i < 26; i++) {
            System.out.println("Player 1: "+hand1.get(i).toString());
            System.out.println("Player 2: "+hand2.get(i).toString());
            if(hand1.get(i) > hand2.get(i)){
                player1++;
                System.out.println("Winner: Player 1");
            }
            else if(hand1.get(i) < hand2.get(i)){
                player2++;
                System.out.println("Winner: Player 2");
            }
        }
        //if 0 cards, award winner
        String winner = "no one, there is a tie!";
        if(player1 > player2) winner = "Player 1!";
        else if(player1 < player2) winner = "Player 2!";
        System.out.printf("The final winner is %s", winner);
    }

}
