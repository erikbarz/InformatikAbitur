
/**
 * Beschreiben Sie hier die Klasse QuadGl.
 * 
 * @author (Erik Barz) 
 * @version (09.10.09)
 */


public class QuadGl
{
    // globale Variablen
    double a, b, c;
    double a2, b2, c2;
    
    /**
     * Konstruktor für Objekte der Klasse QuadGl
     */
    public QuadGl(double a, double b, double c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }


    public void ausgeben1()
    {
        System.out.println("f(x)=0=" + a + "x2+" + b + "x+" +c);
    }
    
    
    public void ausgeben2()
    {
        if(b<0&&c<0) {System.out.println("f(x)=0= " + a + "x2 " + b + "x " +c);}
        if(b<0&&c>=0) {System.out.println("f(x)=0= " + a + "x2 " + b + "x + " +c);}
        if(b>=0&&c<0) {System.out.println("f(x)=0= " + a + "x2 + " + b + "x " +c);}
    }    

    
    public void berechne()
    {
        double diskr=b*b-4*a*c;
        if (a==0)
        {
            if(b==0)
            {
                if(c==0)
                {
                    System.out.println("L=R");
                }
                else//c ungleich 0
                {
                    System.out.println("L={/}");
                }
            }
            else //b ungleich 0
            {
                System.out.println("L={" + -c/b + "}");
            }
        }
        else //a ungleich 0
        {
            if(diskr>0)
            {
                double x1,x2,d;
                d=Math.sqrt(diskr);
                x1=(-b-d)/2*a;
                x2=(-b+d)/2*a;
                System.out.println("L={" + x1 + " , " + x2 +"}");
            }
            else //diskr<=0
            {
                if (diskr==0)
                {
                    System.out.println("L={" + -b/2*a + "}");
                }
                else 
                {
                    System.out.println("L={/}");
                }
            }
        }
    }//ende berechne()
    
    
    public void schnittpunkteMit(double a2, double b2, double c2)
    {
        this.a2=a2;
        this.b2=b2;
        this.c2=c2;
        double p, q;
        p=(b2-b)/(a2-a);
        q=c2/(a2-a)-c/(a2-a);
        double x1,x2,d,diskr;
        diskr=p*p/4-q;
        d=Math.sqrt(diskr);
        x1=-p/2+d;
        x2=-p/2-d;
        System.out.println("L={" + x1 + " , " + x2 +"}");
    }
    
    
}//ende gesamt
