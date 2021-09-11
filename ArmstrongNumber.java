import java.util.Scanner;
public class ArmstrongNumber 
{
    public static void main(String[] args) 
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = s.nextInt();
        int c=0,a;
        int temp=n;
        while(n>0)
        {
            a=n%10;
            n=n/10;
            c=c+(a*a*a);
        }
        if(temp==c)
            System.out.println("The Entered number is Armstrong:");
        else
            System.out.println("The Entered number is not Armstrong:");    
    }
}