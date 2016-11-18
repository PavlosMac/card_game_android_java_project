// import card_game.*;
// import static org.junit.Assert.*;
// import org.junit.*;
// import java.util.*;


// public class HandTest{

//   Deck deck;
//   Hand hand;
//   Card fourOfSpades;
//   Card threeOfClubs;
//   Card fiveOfHearts;

//   @Before 
//   public void before(){
//     hand = new Hand();
//     deck = new Deck("standard deck");
//     fourOfSpades = new Card(4, "spades");
//     threeOfClubs = new Card(3, "clubs");
//     fiveOfHearts = new Card(5, "hearts");
//   }

//   @Test
//   public void canMakeHand(){
//     deck.addCardtoDeck(fourOfSpades);
//     deck.addCardtoDeck(threeOfClubs);
//     deck.addCardtoDeck(fiveOfHearts);
//     hand.makeHand(deck.cards);
//     int numOfcardsInhand = hand.cardInHandCount();
//     assertEquals(2, numOfcardsInhand);
//   }



// }