package com.example.user.cardgame;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 15/11/2016.
 */

public class RoyalCardTest{

    RoyalCard queenOfHearts;

    @Before
    public void before(){
        queenOfHearts = new RoyalCard(RoyalType.QUEEN, SuitType.HEARTS);
    }

    @Test
    public void cardHasRoyal(){
        assertEquals(RoyalType.QUEEN, queenOfHearts.getRoyal());
    }

    @Test
    public void cardHasType(){
        assertEquals(SuitType.HEARTS, queenOfHearts.getSuit());
    }


    @Test
    public void royalcardValueAsString(){
        assertEquals("queen of hearts", queenOfHearts.toString());
    }

    @Test
    public void royalCardHasHandValue(){
        assertEquals(10, queenOfHearts.getRoyalValue());
    }

}
