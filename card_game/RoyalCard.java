package card_game;
import card_game.*;


public class RoyalCard implements Deckable{

  private SuitType suit;
  private RoyalType royal;

  public RoyalCard( RoyalType royal, SuitType suit){
  this.suit = suit;
  this.royal = royal;
  }

  public RoyalType getRoyal(){
    return this.royal;
  }

  public SuitType getSuit(){
    return this.suit;
  }


  public String toString(){
    RoyalType royalToString = getRoyal();
     SuitType suitToString = getSuit();
    return String.format("%s of %s", royalToString.name().toLowerCase(), suitToString.name().toLowerCase());
  }

  public int getRoyalValue(){
    int value = getRoyal().getValue();
      return value;
  }

  public int overallCardValue(){
    return getRoyalValue();
  }


}