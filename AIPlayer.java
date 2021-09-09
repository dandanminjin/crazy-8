public class AIPlayer extends Player//think of it as the ai being an extension of a player would be. 
{
  public AIPlayer (String _name) 
  {
    super(_name);   
  }

  public void DoTurn()
  {
    super.DoTurn(); 
    System.out.println("The AI does its turn here"); 
    Main.input.nextLine(); 
  }
}