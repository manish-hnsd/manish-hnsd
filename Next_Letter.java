import java.util.Scanner;

public class Next_Letter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch1 = 'c';
        char ch2 = 'g';
        System.out.println(nextLetter(ch1,ch2));
    }
    static char nextLetter(char ch1, char ch2 ){
        int sum = ch1- ch2;
        char result = ch2 + sum;
        return result;
    }
}