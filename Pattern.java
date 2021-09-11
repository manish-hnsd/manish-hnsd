import java.lang.*;
import java.util.*;

public class Pattern 
{

	static void pattern(int n)
    {

	int i, j, k = 1;
    for (i = 1; i <= n; i++)
    {
        if (i % 2 != 0)
        {
            for (j = 1; j <= i; j++)
            {
                if (j < i)
					System.out.print( k++ +"*");        
                else
                    System.out.print(k++);
            }
        }
        else
        {
            for (j = 1  ; j <= i; j++)
            {
                if (j < i)
                {
                    if (j == 1)
                        k = k + i - 1;
                    System.out.print(k-- + "*");
                }
                else
                    System.out.print(k--);
                if (j == i)
                    k = k + i + 1;
            }
        }
        System.out.println();
    }

	}

	public static void main (String[] args){
	 int n =3;
	 pattern(n);
	 n =4;
	 pattern(n);
	 n= 5;
	 pattern(n);
	  } 
}