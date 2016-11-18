package card_game;
import card_game.*;


public class Card implements Deckable{


  private int card_number;
  private SuitType suit;


  public Card(int card_number, SuitType suit){
    this.card_number = card_number;
    this.suit = suit;
  }

  public int getNumber(){
    return this.card_number;
  }

  public SuitType getType(){
    return this.suit;
  }

  public String toString(){
    int numToString = this.card_number;
     SuitType suitToString = this.suit;
    return String.format("%d of %s", numToString, suitToString.name().toLowerCase());
  }

  public int overallCardValue(){
    return getNumber();
  }

}