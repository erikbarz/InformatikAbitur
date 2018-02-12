
/**
 * Beschreiben Sie hier die Klasse QuadGl.
 * 
 * @author (Erik Barz) 
 * @version (09.10.09)
 */

public class Auswahl
{
    int x,y,z;

    public Auswahl(int x, int y, int z)
    {
        this.x=x;
        this.y=y;
        this.z=z;
    }

    
    public void minimumKonsole(int m, int n)
    {
        if (n==m)
        {
            System.out.println("beide Zahlen sind gleich groﬂ");
        }
        else
        {
            if (m<n)
            {
                System.out.println("von " + m + " und " + n + " ist das Minimum: " + m);
            }
            else
            {
                System.out.println("von " + m + " und " + n + " ist das Minimum: " + n);
            }
        }
    }
    
    
    private int minimum1()
    {            
            if (x<y)
            {
                return x;
            }
            else 
            {
                return y;
            }
     }
    
      
     public void minimumAusgeben()
     {
            System.out.println("von " + x + " und " + y + " ist das Minimum: " + minimum1());
     }
    
     
     public void minimumAus3()
     {
         if (minimum1()<z)
         {
             System.out.println("von " + x + " , " + y + " und " + z + " ist das Minimum: " + minimum1());
         }
         else
         {
             System.out.println("von " + x + " , " + y + " und " + z + " ist das Minimum: " + z);
         }
     }
     
    public void derGroesseNach()
    {
        int s1=0, s2=0, s3=0;
        if (z>y&&z>x) s3=z;
        if (y>x&&y>z) s3=y;
        if (x>y&&x>z) s3=x;
        
        if (x<y&&x<z) s1=x;
        if (y<z&&y<x) s1=y;
        if (z<x&&z<y) s1=z;
        
        if (x==y && x==z) {s1=x; s2=y; s3=z;}
        if (x==y)
        {
            if (x<z){s1=x; s2=y; s3=z;}
            if (x>z){s1=z; s2=x; s3=y;}
        }
        if (y==z)
        {
            if (x<y)
            {
                s1=x; s2=y; s3=z;
            }
            if (x>y)
            {
                s1=y; s2=z; s3=x;
            }
        }
        
        if (x==z)
        {
            if (x>y) 
            {
                s1=y; s2=x; s3=z;
            }
            if (x<y)
            {
                s1=x; s2=z; s3=y;
            }
        }
        
       if (!(x==s1) && !(x==s3)) {s2=x;}
       if (!(y==s1) && !(y==s3)) {s2=y;}
       if (!(z==s1) && !(z==s3)) {s2=y;}
       
        System.out.println(s1 + ", " + s2 + ", " + s3);
    }
    
    
}
