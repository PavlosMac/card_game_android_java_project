package com.example.user.cardgame;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by user on 15/11/2016.
 */

public class Deck {

    private Deckable card;
    private String deckName;
    public ArrayList<Deckable> cards;


    public Deck(String deckName){
        this.deckName = deckName;
        this.cards = new ArrayList<Deckable>();
    }

    public void setUpDeck(){
        populateNumerals();
        populateRoyals();
        shuffle();
    }

    public String getName(){
        return this.deckName;
    }

    public void addCardtoDeck(Deckable card){
        cards.add(card);
    }

    public int count(){
        return this.cards.size();
    }

    public void clearDeck(){
        cards.clear();
    }

    public Deckable getTopCard(){
        Deckable card =  this.cards.remove(0);
        return card;
    }


    public void shuffle(){
        Collections.shuffle(cards);
    }

    public void populateNumerals(){
        for (int i = 2; i < 11; i++){
            for(SuitType suit : SuitType.values()){
                addCardtoDeck(new Card(i, suit));
            }
        }
    }

    public void populateRoyals(){
        for (RoyalType royal: RoyalType.values()){
            for(SuitType suit: SuitType.values()){
                addCardtoDeck(new RoyalCard(royal, suit));
            }
        }
    }








}