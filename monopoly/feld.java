public class feld
{
String fName;
int fNr=0;

int kp=0;      //Kaufpreis
int m0=0;      //Miete f�r 0 H�user
int m1=0;      //Miete f�r 1 Haus
int m2=0;      //Miete f�r 2 H�user
int m3=0;      //Miete f�r 3 H�user
int m4=0;      //Miete f�r 4 H�user
int mh=0;      //Miete f�r 1 Hotel

int hypo=0;    //Hypothek

int b1=0;      //Baukosten 1 Haus


int anzHaus=0; //Anzahl der gebauten H�user


boolean hypoAufg =false;  //bereits mit Hypothek belastet?

public feld(int feldNr, String name, int kaufpreis, int miete0, int miete1, int miete2, int miete3, int miete4, int mieteh, int hypot, int bau1, int anz)
{
  fNr=feldNr;
  fName=name;
  kp=kaufpreis;
  m0=miete0;
  m1=miete1;
  m2=miete2;
  m3=miete3;
  m4=miete4;
  mh=mieteh;
  hypo=hypot;
  b1=bau1;
  anzHaus=anz;
}
//get-Methoden f�r alle Variablen
public  int getNr()
{
        return fNr;
}

public  String getName()
{
        return fName;
}

public  int getPreis()
{
        return kp;
}

public  int getM0()
{
        return m0;
}

public  int getM1()
{
        return m1;
}

public  int getM2()
{
        return m2;
}

public  int getM3()
{
        return m3;
}

public  int getM4()
{
        return m4;
}

public  int getMh()
{
        return mh;
}

public  int getHypo()
{
        return hypo;
}

public  int getBau()
{
        return b1;
}

public  int getAnz()
{
        return anzHaus;
}


}