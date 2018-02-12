import javakara.JavaKaraProgram;
        

public class bewacher extends JavaKaraProgram {



  public void myProgram() {

    while (!kara.onLeaf()) 
    {
if (!kara.treeFront() && !kara.treeLeft() && kara.treeRight())    {kara.move(); } 
if (!(kara.treeFront() && kara.treeLeft() && kara.treeRight()))   {kara.turnRight(); kara.move();} 
if (kara.treeFront() && kara.treeLeft() && kara.treeRight())      {kara.turnRight(); kara.turnRight(); kara.move(); kara.turnRight(); kara.move(); }
if (kara.treeFront() && kara.treeLeft() && !kara.treeRight())     {kara.turnLeft(); kara.turnLeft(); kara.move(); kara.turnRight(); kara.move(); }  
if (kara.treeFront() && !kara.treeLeft() && kara.treeRight())     {kara.turnLeft(); kara.move(); kara.turnRight(); } 
if (kara.treeFront() && !kara.treeLeft() && !kara.treeRight())    {kara.turnLeft(); kara.move();}
    }

  }
}

        