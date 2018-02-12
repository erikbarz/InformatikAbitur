import javakara.JavaKaraProgram;
 
public class easy2 extends JavaKaraProgram 
{


 public void myProgram() {
    
    while (!kara.treeFront()) {
      if (kara.onLeaf()) {kara.removeLeaf();}
      else {kara.putLeaf();}   
kara.move();
       
  if (kara.treeFront()) {kara.turnRight();}
    }
  }
}

        