import javakara.JavaKaraProgram;
        

public class labyrinth extends JavaKaraProgram {

void sucheWeg()
{
if (kara.treeFront() && kara.treeLeft() && !kara.treeRight()){kara.turnRight(); kara.move();} 
if (kara.treeFront() && !kara.treeLeft() && kara.treeRight()){kara.turnLeft(); kara.move();} 
if (!kara.treeFront() && kara.treeLeft() && kara.treeRight()){kara.move();} 
}

  public void myProgram() {

    while (!(kara.treeFront() && kara.treeLeft() && kara.treeRight())) 
    {
      sucheWeg();
    }
 
  }
}

        