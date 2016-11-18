package card_game;
import card_game.*;
import java.util.*;

  public class Game{

    Player player;
    Deckable card;
    Deck deck;
    private ArrayList<Player> players;
    


    public Game(){
    this.players = new ArrayList<Player>();
    this.deck = deck;
  }

    public int playerCount(){
      return players.size();
    }

   
    public void addPlayers(Player player){
      players.add(player);
    }

    public void deal(Deck deck){
      deck.setUpDeck();

      Deckable card1 = deck.getTopCard();
      Deckable card2 = deck.getTopCard();
      
      for ( Player player : this.players){
        player.getHand(card1, card2);
      }

    }
    




















  }