import java.util.Scanner;

public class StarPattern1 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter number of columns: ");
        int n= s.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.println("*");
            }
            System.out.println("\n");

        }
    }
    
}
