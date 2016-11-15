package com.example.user.cardgame;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 15/11/2016.
 */

public class CardTest{

    Card sevenOfDiamonds;

    @Before
    public void before(){
        sevenOfDiamonds = new Card(7, SuitType.DIAMONDS);
    }

    @Test
    public void testCardHasValue(){
        assertEquals(7, sevenOfDiamonds.getNumber());
    }

    @Test
    public void testCardHasType(){
        assertEquals(SuitType.DIAMONDS, sevenOfDiamonds.getType());
    }

    @Test
    public void testCardAsString(){
        assertEquals("7 of diamonds", sevenOfDiamonds.toString());
    }

    @Test
    public void testCardsWortAsHand(){
        assertEquals(7, sevenOfDiamonds.overallCardValue());
    }


}
