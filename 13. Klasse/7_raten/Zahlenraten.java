
/**
 * Beschreiben Sie hier die Klasse Zahlenraten.
 * 
 * @author (Erik Barz) 
 * @version (20.11.09)
 */

public class Zahlenraten
{
    

    private int zufallszahl=(int)(Math.random()*99+1);
    
    
    public Zahlenraten()
    {
    }
    

    public boolean gleich(int y)
    {
        return (y==zufallszahl);
    }
    
    
    public boolean groesser(int y)
    {
        return (zufallszahl>y);

    }
    
    
    public boolean kleiner(int y)
    {
        return (zufallszahl<y);
      
    }


    public void neueZZ()
    {
        zufallszahl=(int)(Math.random()*99+1);
    }
        
    public int getZZ()
    {
        return zufallszahl;
    }

}
