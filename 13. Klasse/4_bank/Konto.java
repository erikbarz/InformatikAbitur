
/**
 * Beschreiben Sie hier die Klasse Konto.
 * 
 * @author (Erik Barz) 
 * @version (6.11.09)
 */
public class Konto
{
    private String name, vorName;
    private int gebJahr, kontoNr;
    private double kontoStand, dispo;
   
    
    public Konto(int kontoNr, double dispo, double betrag)
    {
        kontoStand=betrag;
        this.gebJahr=gebJahr;
        this.kontoNr=kontoNr;
        this.dispo=dispo;
    }

    
    public void einzahlen(double betrag)
    {
        kontoStand=kontoStand+betrag;
    }
    
    
    public void abheben(int betrag)
    {
        if (kontoStand-betrag>=-dispo)
        {
            kontoStand=kontoStand-betrag;
        }
        else
        {
            System.out.println("Sie können ihr Konto bei dem bestehenden Dispo nicht so weit überziehen.");
            System.out.println("------------------------------");
        }
    }
    
    
    public void ueberweisen(int x, int kontoNr2)
    {
        
    }
    
    
    public void getKontoauszug()
    {
        System.out.println("Inhaber des Kontos ist" + name + " ," + vorName + "geboren" + gebJahr + ".");
        System.out.println("Kontonummer ist" + kontoNr + ".");
        System.out.println("Kontostand beträgt" + kontoStand + "Euro.");
        System.out.println("------------------------------");
    }
    
    public void setDispo(double x)
    {
        dispo=x;
    }
    
    
    public double zinsRechner(int aktJahr, int jahr, double zinssatz)
    {
        return kontoStand*Math.pow(zinssatz,jahr-aktJahr);
    }
    
    
}
