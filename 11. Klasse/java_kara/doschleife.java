import javakara.JavaKaraProgram;
        
public class doschleife extends JavaKaraProgram
{  
  public void myProgram()
  {  
  do
    {
      if (kara.onLeaf()) { kara.removeLeaf(); }
      if (!kara.treeFront()) { kara.move(); }
    } while (!kara.treeFront());
    if (kara.onLeaf()) { kara.removeLeaf(); }
  }  
} 


        