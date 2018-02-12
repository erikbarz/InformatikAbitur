
/**
 * Beschreiben Sie hier die Klasse Zeichnung.
 * 
 * @author Erik
 * @version 16.09.2009
 */
public class Zeichnung
{
    // Instanzvariablen
    private Kreis sonne; //objektname sonne deklariert
    private Quadrat fenster;
    private Quadrat wand;
    private Dreieck dach;
    private Quadrat tuer1;
    private Quadrat tuer2;
    private boolean gezeichnet;
    
    
    /**
     * Konstruktor für Objekte der Klasse Zeichnung
     */
    public Zeichnung()
    {
        sonne = new Kreis();    //benötigte Objekte erzeugt
        fenster = new Quadrat();
        wand = new Quadrat();
        dach = new Dreieck();
        tuer1 = new Quadrat();
        tuer2 = new Quadrat();
        gezeichnet = false; //Initialisierung der variable gezeichnet
        
    }

    /**
     * zeichne erstellt die Zeichnung : ein Haus mit sonne
     */
    
    public void sonnenUntergang() 
    {
        if (gezeichnet) 
        {
        sonne.langsamVertikalBewegen(250);
        wand.farbeAendern("schwarz");
        fenster.farbeAendern("gelb");
        dach.farbeAendern("schwarz");
        }
    }
    
    public void zeichne()
    {
              
        gezeichnet=true;
        
        sonne.groesseAendern(60);
        sonne.horizontalBewegen(180);
        sonne.vertikalBewegen(-10);
        sonne.farbeAendern("gelb");
        sonne.sichtbarMachen();
        
       
        wand.groesseAendern(100);
        wand.vertikalBewegen(80);
        wand.sichtbarMachen();
        
        fenster.farbeAendern("schwarz");
        fenster.horizontalBewegen(20);
        fenster.vertikalBewegen(100);
        fenster.sichtbarMachen();  
        
        
        dach.groesseAendern(50,140);
        dach.horizontalBewegen(60);
        dach.vertikalBewegen(70);
        dach.sichtbarMachen();
        
        tuer1.farbeAendern("blau");
        tuer1.horizontalBewegen(60);
        tuer1.vertikalBewegen(150);
        tuer1.sichtbarMachen();
        
        tuer2.farbeAendern("blau");
        tuer2.horizontalBewegen(60);
        tuer2.vertikalBewegen(120);
        tuer2.sichtbarMachen();
    }//zeichne
    
}//class ende
