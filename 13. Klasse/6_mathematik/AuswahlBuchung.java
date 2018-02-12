
/**
 * Beschreiben Sie hier die Klasse AuswahlBuchung.
 * 
 * @author (Erik Barz) 
 * @version (14.10.09)
 */

public class AuswahlBuchung
{
    private int buchungen, gebuehr;
    
    

    public AuswahlBuchung(int anzahl)
    {
        buchungen=anzahl;
    }

    
    public void berechneGebuehren()
    {
        if (buchungen<=10)
            {
                gebuehr=0;
                System.out.println("Sie müssen " + gebuehr + " Pfund zahlen!");
                System.out.println("-------------------");
            }
        else // mehr als 10 buchungen
            {
                if (buchungen<=20)
                {
                    gebuehr=(buchungen-10)*30;
                    System.out.println("Sie müssen " + gebuehr + " Pfund zahlen!");
                    System.out.println("-------------------");
                }
                else //mehr als 20 Buchungen
                {
                    gebuehr=10*30+(buchungen-20)*20;
                    System.out.println("Sie müssen " + gebuehr + " Pfund zahlen!");
                    System.out.println("-------------------");
                }
            }
    }
       
    
    
}//ende gesamt
