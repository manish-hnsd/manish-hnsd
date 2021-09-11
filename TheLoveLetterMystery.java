import java.util.Scanner;

public class TheLoveLetterMystery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            String str = sc.next();
            int result = theLoveLetter(str);
            System.out.print(result);
        }
    }
    static int theLoveLetter(String s){
        int minCount = 0;
        int strlen = s.length();
        for(int i=0; i<strlen/2; i++){
            minCount += Math.abs(s.charAt(i)- s.charAt(s.length()-i-1)); 
        }
        return minCount;
    }
    
}