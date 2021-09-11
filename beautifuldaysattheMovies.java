import java.util.Scanner;

public class beautifuldaysattheMovies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        for(int m = i; m<=j; m++){
            int revesrseString = getReversed(m);
            if((m - revesrseString) % k ==0){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
    static int getReversed(int n){
        int rev = 0;
        int rem;
        while(n>0){
            rem = n%10;
            rev = (rev*10) + rem;
            n = n/10;
        }
        return rev;
    }
    
}
