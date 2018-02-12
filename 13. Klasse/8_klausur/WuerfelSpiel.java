public class WuerfelSpiel
{
  private int augensumme;
  private double konto;
  
  public WuerfelSpiel(double y)
  {
    
    konto=y;
  }
  
  public int wurf()
  {
    return (int)(Math.random()*6+1);
  }
  
  public void spiel()
  {
      augensumme=wurf()+wurf();
      berechneGewinn();
  }
  
  public double getkonto()
  {
        return konto;  
  }
  
  public void berechneGewinn()
  {
    double vorher=konto;
    double nachher=0;
    
    if (augensumme==12)
    {
       nachher=konto+1.5;
    }
    if (augensumme==11)
    {
       nachher=konto+1;
    }
    if (augensumme==10)
    {
       nachher=konto+0.5;
    }
    if (augensumme>6 &&augensumme<10)
    {
       nachher=konto;
    }
    if (augensumme<=6)
    {
       nachher = konto - 0.5;
    }
    
    double gewinn=nachher-vorher;
    double verlust=vorher-nachher;
    
    konto=nachher;
    
    if (nachher-vorher>=0)
    {
      System.out.println( "Ihr Gewinn beträgt " + gewinn + " Euro.");
    }
    else
    {
      System.out.println( "Ihr Verlust beträgt " + verlust + " Euro.");
    }
    System.out.println("Ihr Geldbestand beträgt " + getkonto() + " Euro");
  }
}
