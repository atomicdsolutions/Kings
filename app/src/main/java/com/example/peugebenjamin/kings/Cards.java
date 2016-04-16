package com.example.peugebenjamin.kings;

/**
 * Created by peugebenjamin on 4/5/16.
 */
public class Cards {
    private int value, suit;

    private static String[] suits = {"HEARTS", "CLUBS", "SPADES", "DIAMONDS" };
    private static String[] values = {"ACE", "2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "King"};

    Cards(int suit, int value){
        this.suit = suit;
        this.value = value;
    }

    public @Override String toString(){
        return values[value] + " of " + suits[suit];
    }

    public int getValue(){
        return value;
    }

    public int getSuit(){
        return suit;
    }
}

