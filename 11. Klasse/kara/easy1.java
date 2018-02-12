import javakara.JavaKaraProgram;

public class easy1 extends JavaKaraProgram {

  public void myProgram() {

    while (!kara.treeFront()) {
      kara.move();

{if (kara.onLeaf()) {kara.removeLeaf();}}

    }
  }
}

        