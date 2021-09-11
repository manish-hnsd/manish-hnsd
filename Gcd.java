import java.util.Scanner;

public class Gcd 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter Two Number :");
        Scanner sc = new Scanner(System.in);
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int gcd=1;
        for(int i=1; i<=num1 && i<=num2; i++)
        {
            if (num1 % i==0 && num2 % i==0)
            gcd =i;
        }
        System.out.println("GCD of Two Numbers are :"+gcd);
    }
    
}
