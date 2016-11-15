package com.example.user.cardgame;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by user on 15/11/2016.
 */

public class PlayerTest{

    Player player;
    Card card1;
    RoyalCard card2;

    @Before
    public void before(){

        player = new Player("Pavlos");
        card1 = new Card(3, SuitType.SPADES);
        card2 = new RoyalCard(RoyalType.ACE, SuitType.DIAMONDS);
        player.getHand(card1,card2);

    }


    @Test
    public void getName(){
        assertEquals("Pavlos", player.getName());
    }


    @Test
    public void testPlayerCanGetHand(){
        Deckable card = player.getFirstCard();
        assertEquals("3 of spades", card.toString());
    }


    @Test
    public void testHandHasValue(){
        int totalOfHand = player.getOverallHandValue();
        assertNotNull(totalOfHand);
    }



    @Test
    public void testPlayerCanSayNameAndShowHand(){
        String hand = player.showHand();
        assertEquals("Pavlos has 3 of spades, ace of diamonds, worth 14 ", hand);
    }

}