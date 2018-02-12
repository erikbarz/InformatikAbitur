/**
 * Beschreiben Sie hier die Klasse Zeichnung.
 * 
 * @author Erik
 * @version 18.09.2009
 */

public class Person
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String name;
    private String vorname;
    private int gebJahr;
    
    /**
     * Konstruktor für Objekte der Klasse Person
     */
    public Person(String na, String vn, int jahr)
    {
        // Instanzvariable initialisieren
        name = na;
        vorname = vn;
        gebJahr = jahr;
            
    }

    public String persDaten()
    {
       String hilf = vorname + " " + name + ", geboren im Jahr " + gebJahr;
       return hilf;
    }
    
    public void setName(String neu)
    {
       name = neu;
    }

    public String getName()
    {
    return name;   
    }
    
    public int getAlter(int aktJahr)
    {
        return aktJahr - gebJahr;  
    }
    
}
