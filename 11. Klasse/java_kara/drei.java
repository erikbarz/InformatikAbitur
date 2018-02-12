import javakara.JavaKaraProgram;

public class drei extends JavaKaraProgram {

 
  public void myProgram()
  {  

while (!kara.treeFront())
{
kara.move();
if (kara.onLeaf())
         { kara.removeLeaf(); }
else {kara.putLeaf();}
    
}
}    



  }  



        