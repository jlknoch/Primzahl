/** Checks if an input value is a prime number
    @author Jan-Lukas Knoch 
    @version 1.2.0 */

public class Main
{
    public static boolean istPrim (int x)
    {
        boolean y = false;   
    
        if (x == 2)
        {
            y = true;
        }
        else
        {
            int ceiling = 1;
            int rest = 0;
   
            for (int i = 1; i <= x; i++)
            {
                rest = x % ceiling;
                if (rest == 0)
                {
                    System.out.println(x + " ist durch " + ceiling + " teilbar.");
                    
                    if (ceiling != 1 && ceiling != x)
                    {            
                        y = true;
                        break;          
                    }
                }
                else
                {
                    System.out.println(x + " ist durch " + ceiling + " nicht teilbar.");
                }
                ceiling++;
            }
        }
        return y;
    
    }
  
    public static void main (String[] args)
    {
        int x = Input.readInt("Geben Sie den zu Überprüfenden Wert ein: "); 
        boolean func_istPrim = istPrim(x);
    
        if (func_istPrim == true)
        {
            System.out.println(x + " ist eine Primzahl.");
        }
        else
        {
            System.out.println(x + " ist keine Primzahl.");
        }
    }
}
