import javakara.JavaKaraProgram;
        

public class umBaumHerum extends JavaKaraProgram {

void umBaumHerum()
{if (!kara.treeFront())
{kara.move();}
else {kara.turnLeft(); kara.move(); kara.turnRight(); kara.move(); kara.move(); kara.turnRight(); kara.move(); kara.turnLeft();} }

  public void myProgram() {

    while (!kara.onLeaf()) 
    {
      umBaumHerum();
    }
  if (kara.onLeaf())  {kara.removeLeaf();}
  }
}

        