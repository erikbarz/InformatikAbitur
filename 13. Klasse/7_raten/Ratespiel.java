
/**
 * Beschreiben Sie hier die Klasse Zahlenraten.
 * 
 * @author (Erik Barz) 
 * @version (20.11.09)
 */

public class Ratespiel
{
    //Versuche i
    private int i;
    //Objekt in Zahlenraten anlegen
    private Zahlenraten geheim;
    private boolean gewonnen;
    
    public Ratespiel()
    {
        geheim = new Zahlenraten(); 
        i=0;
    }

    public void starten()
    {
        i=0;
        gewonnen=false;
        geheim.neueZZ();
    }
    
    public String eingabe(int x)
    {
        String text = "";

        if (geheim.gleich(x))
        {
            text = "Glückwunsch! Sie haben mit " + getVersuche() + " Versuchen gewonnen";
            gewonnen=true;
        }
        else
        {
            if (geheim.groesser(x))
            {
                text = "Ihre Zahl ist zu klein";
            }
            else
            {
                text = "Ihre zahl ist zu groß";
            }
        }
        System.out.println(geheim.getZZ());
        i=i+1;
        return text;

    }

   
    public boolean getGewonnen()
    {
        return gewonnen;
    }

   
   public int getVersuche()
   {
    return i;
    }
}
