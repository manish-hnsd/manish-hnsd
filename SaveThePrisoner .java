import java.util.Scanner;

public class SaveThePrisoner  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int s = sc.nextInt();
            System.out.println(savethePrison n, m, s);
        }
    }
    static int savethePrison(int n, int m, int s){
        int r = m % n;
		if ((r + s - 1) % n == 0) {
			return n;
		} else {
			return ((r + s - 1) % n);
		}
    }
    
}
