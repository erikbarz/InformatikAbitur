
/**
 * Beschreiben Sie hier die Klasse Auto.
 * 
 * @author erik barz
 * @version 02.10.09
 */

public class Auto
{
    double tankvolumen, benzinstand; 
    double verbrauch, kmstand;
    int personen;
    int maxpers;
    int mleer;
    int zulgesamt;  
    double aktgewicht;
    
        
    public Auto()
    {
        tankvolumen = 70.0;
        benzinstand = 50.0;
        kmstand = 77000;
        personen = 1;
        maxpers = 5;
        mleer = 1159;
        zulgesamt = 1605;
        aktgewicht=personen*85+mleer+benzinstand*0.8;
        verbrauch=aktgewicht/189;        
    }

    
        public Auto(double tv, double bst, double km, int pers, int mpers, int leer, int maxgesamt)
    {
        tankvolumen = tv;
        benzinstand = bst;
        kmstand = km;
        personen = pers;
        maxpers = mpers;
        mleer = leer;
        zulgesamt = maxgesamt;
        aktgewicht=personen*85+mleer+benzinstand*0.8;
        verbrauch=aktgewicht/189;
    }
    
    
    //nur so viel tanken wie Platz, sonst Meldung
    public void tanken(double liter)
    {
       if (benzinstand<=tankvolumen && benzinstand + liter <= tankvolumen && personen*85+mleer+benzinstand*0.8+liter*0.8<=zulgesamt)
       {        
            benzinstand = benzinstand + liter;
            System.out.println("neuer Benzinstand = "+benzinstand+" liter");
            System.out.println("---------------");
       }
        else 
            {
                if (benzinstand>tankvolumen) 
                {
                    System.out.println("ohne tanken schon mehr benzin als tank fässt");
                    System.out.println("---------------");
                }
                if (benzinstand+liter>tankvolumen) 
                {
                    System.out.println("nach tanken mehr als tank fässt");
                    System.out.println("---------------");
                }
                if (personen*85+mleer+benzinstand*0.8+liter*0.8>zulgesamt)
                {
                    System.out.println("auto zu schwer");
                    System.out.println("---------------");
                }
            }
    }
    
    
    public void anzeigen()
        {
            System.out.println("Tankvolumen = " + tankvolumen + " Liter");
            System.out.println("Benzinstand = " + benzinstand + " Liter");
            System.out.println("Verbrauch = " + verbrauch + " Liter/100km");
            System.out.println("KmStand = " + kmstand + " km");
            System.out.println("Personen an Bord = " + personen);
            System.out.println("max Anzahl Personen an Bord = " + maxpers);
            System.out.println("Leergewicht = " + mleer + " kg");
            System.out.println("zulässige Gesamtmasse = " + zulgesamt + " kg");
            System.out.println("aktuelles Gewicht = " + aktgewicht + " kg");
            System.out.println("---------------");
        }
    
        
    //negativer Stand möglich, sonst Meldung
    public void fahren(double kilometer)
    {
     if (benzinstand >= kilometer/100*verbrauch)
        {
            kmstand = kmstand + kilometer;
            benzinstand = benzinstand - kilometer/100*verbrauch; 
            if (benzinstand<tankvolumen*0.05)
            {
                System.out.println("Tank fast alle!");
                System.out.println("---------------");
            }
        }
     else 
        {
            System.out.println("zu weit, km verringern!");
            System.out.println("---------------");
        }
    }
       
    
    public void einsteigen(int pers)
    {
    if (pers <= maxpers - personen && pers*85+mleer+benzinstand*0.8<=zulgesamt) 
        {      
            personen = personen + pers;
            aktgewicht=personen*85+mleer+benzinstand*0.8;
            System.out.println("neue Anzahl Personen ist " + personen );
            System.out.println("aktuelles gewicht = " + aktgewicht + " kg");
            System.out.println("---------------");
        }
    else 
        {
            System.out.println("zu viele Personen, Anzahl verringern!");
            System.out.println("---------------");
        }
    }
    
    
    public void aussteigen(int pers)
    {
        if (personen-pers>=1)
        {
            personen=personen-pers;
            System.out.println("neue Anzahl Personen ist "+personen);
            System.out.println("---------------");
        }
        else
        {
           System.out.println("zu viele Personen sind ausgestiegen! Jemand muss fahren");
           System.out.println("---------------"); 
        }
    }
    
    
    public void fahrdauerBerechnen(int km, double kmh)
    {
        double zeit=km/kmh;
        System.out.println("ungefähre Fahrdauer = "+zeit+" h");
        System.out.println("---------------"); 
    }
    
    
    public double bremsweg(int kmh)
    {
        double bremsweg=(kmh/10)*(kmh/10);
        return bremsweg;
    }
    
    public double getMaxStrecke()
    {
        double maxweg=benzinstand*100/verbrauch;
        return maxweg;
    }
    
    
    public int getPersonen()
    {
        return personen;
    }
    
    
    public double getVerbrauch()
    {
        return verbrauch;
    }
    
    
    public double getAktuellesGewicht()
    {
        aktgewicht=personen*85+mleer+benzinstand*0.8;
        return aktgewicht;
    }
    
    
    public void tachoZurueckdrehen(int neuerStand)
    {
        kmstand=neuerStand;
        System.out.println("neuer Kilometerstand ist "+kmstand+" km");   
        System.out.println("---------------");
    }
    
    //Ende
    }
