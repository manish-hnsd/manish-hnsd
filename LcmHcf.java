import java.util.Scanner;
public class LcmHcf {
    public static void main(String[] args) 
    {
        int a,b,x,y,t,gcd,lcm;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two number:");
        x=sc.nextInt();
        y=sc.nextInt();

        a=x;
        b=y;
        while(b!=0)
        {
            t = b;
            b = a%b;
            a = t;
        }
        gcd= a;
        lcm=(x*y)/gcd;
        System.out.println("GCD/HCF of "+x+" and "+y+" is: "+gcd);
        System.out.println("LCM of "+x+" and "+y+" is: "+lcm);

    }
    
}
