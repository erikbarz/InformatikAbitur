import javakara.JavaKaraProgram;

public class bla extends JavaKaraProgram {

  public void myProgram() {

    while (!kara.treeFront()) {
      kara.move();

{if (kara.onLeaf()) {kara.removeLeaf();}}

    }
  }
}

        