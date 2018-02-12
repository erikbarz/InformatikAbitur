public class simple extends JavaKaraProgram 
{

  public void myProgram() 
{
haupt() ;
haupt() ;
haupt() ;
haupt() ;
}

  public void vorBlattnehemn() 
    {

      if (kara.onLeaf()) 
      {
        kara.removeLeaf();
      }

      if(!kara.treeFront()) 
      {
        kara.move();
      }
    }

  public void haupt()
      {
        while (!kara.treeFront()) 
        {vorBlattnehemn();}

        if (kara.treeFront())
        {kehrtRechts();}

        while (!kara.treeFront()) 
        {vorBlattnehemn();}

        if (kara.treeFront())
        {kehrtLinks();}
      }


  public void kehrtRechts() 
      {
        if (kara.treeFront()) 
        {
        kara.turnRight();
        vorBlattnehemn();
        kara.turnRight();
        }
      }


  public void kehrtLinks() 
      {
        if (kara.treeFront()) 
        {
        kara.turnLeft();
        vorBlattnehemn();
        kara.turnLeft();
        }
      }

}



