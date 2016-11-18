package card_game;
import card_game.*;
import java.util.*;


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

  
  public Deckable getFirstCard(){
    return this.hand[0];
  }

  public Deckable getSecondHand(){
    return this.hand[1];
  }


  public void getHand(Deckable card1, Deckable card2){
    this.hand[0] = card1;
    this.hand[1] = card2;
  }


  public String canShowhand(){
    Deckable card1 = this.hand[0];
    Deckable card2 = this.hand[1];
    return card1.toString() + ", " + card2.toString();
  }

  public int getOverallHandValue(){
    Deckable card1 = getFirstCard();
    Deckable card2 = getSecondHand();
    int total = card1.overallCardValue() + card2.overallCardValue();
    return total;
  }

 

}

