import java.util.Scanner;

public class TrapeziumPattern 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the number of Rows : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num=1,space=0,k=1,number=n;
        for(int i=0; i<n; i++)
        {
            for(int j=1;j<=space;j++)
            {
                System.out.print("-"); 
            }
            for(int m=1;m<2*n-space;m++)
            {
                if(m%2==0)
                System.out.print("*");
                else
                System.out.print(num++);
            }
            System.out.print("*");
            for(int l=1;l<2*n-space;l++)
            {
                if(l%2==0)
                System.out.print("*");
                else
                {
                    System.out.print(k+number*number);
                    k++;
                }
            }
            number--;
            space=space+2;
            System.out.println();
        }
        
    }
    
}
