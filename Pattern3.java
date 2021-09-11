import java.util.Scanner;

public class Pattern3 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the number of Rows :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = n-1;
        for(int i=1; i<=n; i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(c);
            }    
            c++;
            System.out.println();
        }
        c--;
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*"+c);
            }
            c--;
            System.out.println();
        }
    }
}
