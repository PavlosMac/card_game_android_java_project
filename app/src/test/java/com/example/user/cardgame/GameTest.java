package com.example.user.cardgame;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

/**
 * Created by user on 15/11/2016.
 */

public class GameTest{

    Deckable card1;
    Deckable card2;
    Game game;
    Deck deck;
    Player player1;
    Player player2;
    Player player3;



    @Before
    public void before(){
        player1 = new Player("Linnea Lindblom");
        player2 = new Player("Pavlos Macdonald");
        player3 = new Player("Henry Kissinger");
        game = new Game();
        deck = new Deck("pontoon deck");
        game.addPlayer(player1);
        game.addPlayer(player2);
        game.addPlayer(player3);
        game.deal(deck);

    }


    @Test
    public void testGameCanHavePlayers(){
        assertEquals(3, game.playerCount());
    }



    @Test
    public void testGameCanDealToPlayers(){
        Deckable card1 = player1.getFirstCard();
        Deckable card2 = player1.getSecondCard();
        Deckable card3 = player2.getFirstCard();
        Deckable card4 = player2.getSecondCard();
        Deckable card5 = player3.getFirstCard();
        Deckable card6 = player3.getSecondCard();
        assertNotNull(card1);
        assertNotNull(card2);
        assertNotNull(card3);
        assertNotNull(card4);
        assertNotNull(card5);
        assertNotNull(card6);
        assertTrue(card6 instanceof Deckable);
        assertEquals(46, deck.count());
    }

    @Test
    public void testGameCanCompareHands(){
        Player player = game.winChecker();
        assertTrue(player instanceof Player);
    }

    @Test
    public void testGameCanShowAllPlayersHands(){
        player1 = new Player("Linnea Lindblom");
        game = new Game();
        deck = new Deck("pontoon deck");
        game.addPlayer(player1);
        card1 = new Card(4, SuitType.CLUBS);
        card2 = new RoyalCard(RoyalType.QUEEN, SuitType.CLUBS);
        player1.getHand(card1, card2);
        String results = game.showAllHands();
        assertEquals("Linnea Lindblom has 4 of clubs, queen of clubs, worth 14", results);
    }



    @Test
    public void testDealFromSameDeck(){
        game.reDeal(deck);
        assertEquals(46, deck.count());
    }






}
