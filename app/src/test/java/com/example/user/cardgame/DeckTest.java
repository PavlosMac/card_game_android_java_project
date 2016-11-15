package com.example.user.cardgame;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 15/11/2016.
 */

public class DeckTest{

    Deck deck;
    Deckable fourOfSpades;
    Deckable threeOfClubs;
    Deckable kingOfHearts;



    @Before
    public void before(){
        deck = new Deck("normal deck");
        fourOfSpades = new Card(4, SuitType.SPADES);
        threeOfClubs = new Card(3, SuitType.CLUBS);
        kingOfHearts = new RoyalCard(RoyalType.KING, SuitType.HEARTS);

    }

    @Test
    public void deckCanGetOneCard(){
        deck.addCardtoDeck(fourOfSpades);
        assertEquals(1, deck.count());
    }

    @Test
    public void cardInDeckHasName(){
        deck.addCardtoDeck(fourOfSpades);
        Deckable org = deck.getTopCard();
        assertEquals("4 of spades", org.toString());
    }


    @Test
    public void deckCanBePopulated(){
        deck.populateNumerals();
        deck.populateRoyals();
        assertEquals(52, deck.count());
    }






}