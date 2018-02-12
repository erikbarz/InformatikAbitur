import javakara.JavaKaraProgram;


public class legen extends JavaKaraProgram
{  // Anfang von Zaehlen
  public void myProgram()
  {  // Anfang von myProgram
  int i;
  i = 0;
  while (i<5)
    {
      kara.putLeaf();
      kara.move();
      i = i+1; 
      document.write(i);
    }
  } 
}

        