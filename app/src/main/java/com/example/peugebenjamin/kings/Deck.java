package com.example.peugebenjamin.kings;

import java.util.Random;

/**
 * Created by peugebenjamin on 4/5/16.
 */
public class Deck {
    private Cards[] cards;
    int i;

    Deck(){
        i = 51;
        cards = new Cards[52];
        int x=0;
        for (int a=0; a<=3; a++){
            for(int b=0; b<=12; b++){
                cards[x] = new Cards(a,b);
                x++;
            }
        }
    }

    public Cards drawCard(){
        Random randnum = new Random();
        int index = 0;
        index = randnum.nextInt(i);

        Cards temp = cards[index];
        cards[index] = cards[i];
        cards[i]=null;
        i--;
        return temp;
    }

}

