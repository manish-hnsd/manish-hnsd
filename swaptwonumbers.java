import java.util.Scanner;

public class swaptwonumbers {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int a = n.nextInt();
        System.out.println("Enter 2nd number:");
        int b = n.nextInt();
        /*a=a+b;
        b=a-b;
        a=a-b;*/
        a = (a + b) - (b = a);
        System.out.println("After Swapping numbers are: "+a+" and "+b);
    }
    
}
