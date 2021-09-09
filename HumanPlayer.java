public class HumanPlayer extends Player
{
  public HumanPlayer(String _name) 
  {
    super(_name); 
  }

  public void DoTurn() 
  {
    super.DoTurn(); 
    DisplayHand(); 
    System.out.println("select the card that you want to play"); 
    System.out.println("The player does its turn here");  
    PickCard(); 
    Main.ClearConsole(); 
  }
  void PickCard()
  {
    try      
    {
      String input = Main.input.nextLine(); 
      int i = Integer.parseInt(input); 
      Card c = cardsInHand.get(i); 
      TryPlayCard(c); 
    }
    catch (Exception e) 
    {
      System.out.println(e.getMessage()); 
      PickCard (); 
    }
  }




}