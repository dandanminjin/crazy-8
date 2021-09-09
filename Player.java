import java.util.*; 

public class Player  
{
  public String name; 
  public List<Card> cardsInHand = new ArrayList<Card>(); 

  public Player (String _name) 
  {
    name = _name;  
  }
  public void DoTurn()
  {
    System.out.println("It's " +  name + "'s turn'"); 
    System.out.println("Card on pile:"); 
    System.out.println(Game.pile.peek().GetCardName()); 
    System.out.println("-----" ); 
  }

  void DisplayHand() 
  {
    for (int i = 0; i < cardsInHand.size();i++)
    {
      Card c = cardsInHand.get(i);
      System.out.println("["+i+"]" + c.GetCardName()); 
    } 
  }
  void TryPlayCard(Card c)
  {
    Card topCard = Game.pile.peek(); 
    boolean canPlay = false; 
    if (c.number == 8 || topCard.number==c.number || topCard.mySuit == c.mySuit)
    {
      canPlay = true; 
    }
    if(canPlay)
    {
      cardsInHand.remove(c); 
      Game.pile.push(c); 
     }
  }
}