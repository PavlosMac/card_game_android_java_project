import card_game.*;
import static org.junit.Assert.*;
import org.junit.*;

public class PlayerTest{

  Player player;
  Card card1;
  RoyalCard card2;

  @Before
  public void before(){

    player = new Player("Pavlos");
    card1 = new Card(3, SuitType.SPADES);
    card2 = new RoyalCard(RoyalType.ACE, SuitType.DIAMONDS);

  }


  @Test 
  public void getName(){
    assertEquals("Pavlos", player.getName());
  }


  @Test
  public void testPlayerCanGetHand(){
    player.getHand(card1,card2);
    Deckable card = player.getFirstCard();
    assertEquals("3 of spades", card.toString());
  }


  @Test 
  public void testPlayerCanShowHand(){
    player.getHand(card1,card2);
    assertEquals("3 of spades, ace of diamonds", player.canShowhand());
  }

  @Test
  public void testHandHasValue(){
    player.getHand(card1, card2);
    int totalOfHand = player.getOverallHandValue();
    assertNotNull(totalOfHand);
  }

}