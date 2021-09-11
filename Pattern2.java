import java.util.Scanner;

public class Pattern2 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the number of Rows :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c= n-1;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            //c = c+1;
            System.out.print(c++);
            for(int j=1;j<=n;j++)
            {
                System.out.print(i);
            }
            if(i%2!=0)
            //c = c+1;
            System.out.print(c++);
            System.out.println("");

        }
        
    }
    
}
