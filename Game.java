import java.util. *; 
public class Game
{
  public static Stack<Card> deck = new Stack<Card>(); 
  public static Stack<Card> pile = new Stack<Card>(); 
  List<Player> players; 
  int  nCardsPerPlayer = 7;  
  public Game () 
  {
    CreateDeck(); 
    ShuffleDeck(); 

    players = new ArrayList<Player>(); 
    players.add(new HumanPlayer("Sarah")); 
    players.add(new AIPlayer("Joe")); //add a new player onto the game
    System.out.println(players.get(0).name); 
    System.out.println(players.get(1).name); 
    HandOutCards(); 
    pile.push(deck.pop());   //grab top card from deck stack and moves it. 
    /*
    for(int i = 0; i < players.size(); i++){
      System.out.println(players.get(i).name);
    }
    */
    pile.get(0); //pile.get(0).number 
    System.out.println(pile.get(0).number); 
    if (pile.get(0).number == 8)  
    {
      Card temp = pile.pop(); 
      deck.add(0, temp);  
      pile.push(deck.pop()); 
    }

    for(Card c:deck)
    {
      System.out.println(c.GetCardName()); 
    } 
    while (true)
    {
      for(Player p:players)
      {
        p.DoTurn();
          
      }
    }
  }
  void HandOutCards ()
  {
    for(Player p:players)
    {
      for (int i = 0; i < nCardsPerPlayer;i++)
      {
        Card topCard = deck.pop(); 
        p.cardsInHand.add(topCard); 
      }
    }
  }
  
  void CreateDeck()
  {
    for (int i = 2; i <= 14; i++)
    {
      deck.push(new Card(i, Card.Suit.Hearts));
      deck.push(new Card(i, Card.Suit.Diamonds));
      deck.push(new Card(i, Card.Suit.Clubs));
      deck.push(new Card(i, Card.Suit.Spades));
    }
  }
  void ShuffleDeck() 
  {
    for(int i=0; i< deck.size(); i++)
    {
      int r = Main.rand.nextInt(deck.size()); 
      Card temp = deck.get(r); //random # in the number size
      deck.set(r, deck.get(i)); //getting a card in the stack on what im itterating. the i is the itterator. loops through the loop until it hits the deck size limit. 
      deck.set(i, temp); //is a copy of the .get and assign the value. what the card used to be is stored in temp. set i = temp. swap the 2 cards
    }
  }
}