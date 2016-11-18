package card_game;
import card_game.*;
import java.util.*;

public class Deck {

  private Deckable card;
  private String deckName;
  public ArrayList<Deckable> cards;


  public Deck(String deckName){
    this.deckName = deckName;
    this.cards = new ArrayList<Deckable>();
  }

  public void setUpDeck(){
    populateNumerals();
    populateRoyals();
    shuffle();
  }

  public void addCardtoDeck(Deckable card){
    cards.add(card);
  }

  public int count(){
    return this.cards.size();
  }

  public Deckable getTopCard(){
    Deckable card =  this.cards.remove(0);
    return card;
  }


  public void shuffle(){
    Collections.shuffle(cards);
  }

  public void populateNumerals(){
    for (int i = 1; i < 10; i++){
      for(SuitType suit : SuitType.values()){
        addCardtoDeck(new Card(i, suit));
      }
    }
  }

  public void populateRoyals(){
    for (RoyalType royal: RoyalType.values()){
      for(SuitType suit: SuitType.values()){
        addCardtoDeck(new RoyalCard(royal, suit));
      }
    }
  }

//   public void getCard(){
//     Deckable card = cards.remove(0);
//     return card;
//   }






}