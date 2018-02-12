
/**
 * Beschreiben Sie hier die Klasse Schleifen.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Schleifen
{

    void whileSchleife()
    {
        int i=1;
        while (i<=10)
        {
            System.out.println(i);
            i++;
        }
    }

    
    void doWhileSchleife()
    {
        int i=1;
        do
        {
            System.out.println(i);
            i++;
        }
        while (i<=10);
    }
    
    
    void forSchleifeTest19()
    {
        int i;
        for (i=0; i<=10; i++) System.out.println(i);
    }
    
    
    void forSchleifeTest20()
    {
        int i;
        for (i=10; i>=1; i--) System.out.println(i);
    }    
    
    
    void forSchleifeTest21()
    {
        for (int i=10; i>=1; i--) System.out.println(i);
    }      
    
    
    void forSchleifeTest22()
    {
        int i,k;
        int n=10;
        for (i=0, k=n; i<n; i++, k--) System.out.println(i + ", " + k);
    }     
    
    
    void forSchleifeTest23()
    {
        int i;
        int n=10;
        int k=n;
        for (i=0; i<n; i++) 
        {
            System.out.println(i + ", " + k);
            k--;
        }
    }
    
    
    void forSchleifeTest25()
    {
        int i;
        double max;
        max=Math.random();
        for (i=2; i<=100; i++) 
        {
            double x=Math.random();
            if (x>max) max=x;
        }
        System.out.println("Maximum :" + max);
    }
    
    
    void forSchleifeTest27()
    {
        for (int i=1; i<10; i++)
        {
            for (int j=1; j<10; j++)
            {
                if (i*j<10) {System.out.print(" " + i*j + " ");}
                else {System.out.print(i*j + " ");}
            }
            System.out.println("");
        }
    }    
    
    
    void forSchleifeTest28()
    {
        for (int i=1; i<10; i++)
        {
            System.out.println(i);
            if (i==5) {break;}
        }
    }     
    
    
    
    
    int summeBis_While(int n)
    {
        int summe=0;
        int i=1;
        while(i<=n)
        {
            summe=summe+i;
            i++;
        }
        return summe;
    }
    
    int summeBis_DoWhile(int n)
    {
        int summe=0;
        int i=1;
        do
        {
            summe=summe+i;
            i++;
        }
        while(i<=n);
        return summe;        
    }
    
    int summeBis_for(int n)
    {
        int summe=0;
        for(int i=1; i<=n;i++)
        {
            summe=summe+i;
        }
        return summe;
    }    
    
}
