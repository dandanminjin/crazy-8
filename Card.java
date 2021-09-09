class Card 
{
  public int number; 

  public enum Suit //restrictions on what that type can be 
  {
    Hearts, 
    Diamonds, 
    Spades, 
    Clubs
  }
  public Suit mySuit;  //restrics mySuit to hearts, diamonds, etc.

  public Card (int _number, Suit suit) 
  {
    number = _number; 
    mySuit = suit; 
  }

  public String GetCardName () 
  {
    return Main.cardIdToName.get(number) + " of " + mySuit;  
  }

}