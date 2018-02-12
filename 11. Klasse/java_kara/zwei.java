import javakara.JavaKaraProgram;

public class zwei extends JavaKaraProgram {

  void geheUmBaumHerum()
  {
     kara.turnLeft();
     kara.move();
      kara.turnRight();
     kara.move();
     kara.move();
      kara.turnRight();
     kara.move();
    kara.removeLeaf();
     kara.turnLeft();
     kara.move();
     kara.putLeaf();
     kara.move();
     kara.turnLeft();
     kara.turnLeft();
  }

  public void myProgram()
  {  
    if (kara.treeFront())
         { this.geheUmBaumHerum(); }
    else { kara.move(); }

  }  

} 

        