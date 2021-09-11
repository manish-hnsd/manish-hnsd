import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int number,remainder,reverse=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter A number: ");
        int n=s.nextInt();
        number = n;
        while(n!=0)
        {
            remainder=n%10;
            reverse = reverse*10+remainder;
            n/=10;
        }
        if(number==reverse)
        System.out.println("The Number is Palindrome "+number);
        else
        System.out.println("The Number is not Palindrome "+number);
    }
    
}
