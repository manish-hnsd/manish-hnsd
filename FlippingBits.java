import java.util.Scanner;

public class FlippingBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        inverseBits(num);
    }
    static void inverseBits(int num){
        int x = (int)(Math.log(num)/Math.log(2))+1;
        for(int i=0; i<x; i++)
        num = (num ^ (1 << i));

        System.out.println(num);
    }
    
}