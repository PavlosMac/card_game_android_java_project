package com.example.user.cardgame;

/**
 * Created by user on 15/11/2016.
 */

public class Player{

    private String name;
    private Deckable[] hand;

    public Player(String name){
        this.name = name;
        this.hand = new Deckable[2];

    }

    public String getName(){
        return this.name;
    }


    public void discardHand(){
        this.hand[0] = null;
        this.hand[1] = null;
    }

    public Deckable getFirstCard(){
        return this.hand[0];
    }

    public Deckable getSecondCard(){
        return this.hand[1];
    }


    public void getHand(Deckable card1, Deckable card2){
        this.hand[0] = card1;
        this.hand[1] = card2;
    }

    public String showHand(){
        int handValue = getOverallHandValue();
        Deckable card1 = this.hand[0];
        Deckable card2 = this.hand[1];
        String strHand =  card1.toString() + ", " + card2.toString();
        String first = String.format("%s has ", getName());
        String second = String.format("%s", strHand);
        String third = String.format(", worth %d", getOverallHandValue());
        return first + second + third;
    }

    public int getOverallHandValue(){
        Deckable card1 = getFirstCard();
        Deckable card2 = getSecondCard();
        int total = card1.overallCardValue() + card2.overallCardValue();
        return total;
    }




}


