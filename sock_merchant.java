import java.util.Scanner;

public class sock_merchant {
    public static void main(String[] args) {
        //HashSet<Integer> set = new HashSet<Integer>();
		Scanner sc = new Scanner(System.in);
		int[] freq = new int[101];
		int n = sc.nextInt();
		for(int i= 0; i<n; i++){
			int x = sc.nextInt();
			freq[x]++;
		}
		int sum = 0;
		for(int i =1; i<101; i++){
			sum += freq[i]/2;
		}
		System.out.println(sum); 
		
	}   
}