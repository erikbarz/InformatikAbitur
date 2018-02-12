import javakara.JavaKaraProgram;
public class parameter extends JavaKaraProgram
{ 

  void legeKleeblattzeile(int anzahl)
  {
    for (int i=1; i<=anzahl; i++)
      {
        kara.putLeaf();
        kara.move();
      }
  }

  public void myProgram()
  {  
    legeKleeblattzeile(8);
    kara.turnRight();
    legeKleeblattzeile(8);
    kara.turnRight();
    legeKleeblattzeile(8);
    kara.turnRight();
    legeKleeblattzeile(7);
    kara.turnRight();
    legeKleeblattzeile(7);
    kara.turnRight();
    legeKleeblattzeile(6);
    kara.turnRight();
    legeKleeblattzeile(6);
    kara.turnRight();
    legeKleeblattzeile(5);
    kara.turnRight();
    legeKleeblattzeile(5);
    kara.turnRight();
    legeKleeblattzeile(4);
    kara.turnRight();
    legeKleeblattzeile(4);
    kara.turnRight();
    legeKleeblattzeile(3);
    kara.turnRight();
    legeKleeblattzeile(3);
    kara.turnRight();
    legeKleeblattzeile(2);
    kara.turnRight();
    legeKleeblattzeile(2);
    kara.turnRight();
    legeKleeblattzeile(1);
    kara.turnRight();
    legeKleeblattzeile(1);
    kara.turnRight();
  }  

} 



        