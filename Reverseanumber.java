import java.util.Scanner;

public class Reverseanumber 
{
    public static void main(String[] args) 
    {
        int a,r=0;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a number to Reverse:");
        int n = s.nextInt();
        while(n>1)
        {
            a=n%10;
            r=r*10+a;
            n=n/10;
        }
        System.out.println("Reverse of a number:"+r);
    }
    
}
