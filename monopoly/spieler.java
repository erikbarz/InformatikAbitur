public class spieler
{
//variablen
public int geld=0;
public int az1=0;   //Augenzahl des 1. W�rfels
public int az2=0;   //Augenzahl des 2. W�rfels

public String sName="";
public int sNr;

public spieler(int nr, String spielername)
{
   //Konstruktor (Spielfelder, Name, Geld, W�rfeln, kaufen)
   geld=30000;        //30.000 Euro Startgeld
   az1=wurf();
   az2=wurf();

   sName=spielername;
   sNr=nr;
}

//Methoden zum W�rfeln
public int wurf()
{
       return (int)(Math.random()*6+1);
}
public void setAZ()
{
  az1=wurf();
  az2=wurf();
}
public int summeAZ()
{
       return az1+az2;
}
public boolean pasch()
{
       if (az1==az2) return true;
       else return false;
}

public String getName()
{
       return sName;
}

//Methoden zum Spielende
public boolean verloren()
{
  if(geld<=0)
  {
    return true;
  }
  else
  {
    return false;
  }
}

}