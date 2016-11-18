import card_game.*;
import java.util.*;
import static org.junit.Assert.*;
import org.junit.*;
import org.junit.Test;


  public class GameTest{

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
      }


    @Test
    public void gameCanHavePlayers(){
      game.addPlayers(player1);
      game.addPlayers(player2);
      game.addPlayers(player3);
      assertEquals(3, game.playerCount());
    }

    @Test
    public void gameCanDealToPlayers(){
      game.addPlayers(player1);
      game.addPlayers(player2);
      game.addPlayers(player3);
      game.deal(deck);
      Deckable hand1 = player1.getFirstCard();
      Deckable hand2 = player2.getFirstCard();
      Deckable hand3 = player3.getFirstCard();
      assertNotNull(hand1);
      assertNotNull(hand2);
      assertNotNull(hand3);
      assertTrue(hand1 instanceof Deckable);
    }

    // @Test
    // public void gameCanCompareHands(){
    //   game.addPlayers(player1);
    //   game.addPlayers(player2);
    //   game.addPlayers(player3);
    //   game.deal(deck);
    //   game.winChecker();
    //   Deckable player1Hand = player1.getFirstCard();
    //   Deckable player2Hand = player2.getFirstCard();
    //   assertTrue(int.class, player1Hand); 
    // }




}