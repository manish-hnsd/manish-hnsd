import java.util.Scanner;

public class DivisibleSumPairs 
{
    static int divisibleSumPairs(int n, int k, int ar[] ){
        //int[] bucket = new int[k];
		int count = 0;
        for (int i = 0; i < n; i++) 
        {
			ar[i] = sc.nextInt();
        for(int j=i+1; j<n; j++)
        {
                if((ar[i]+ar[j]%k==0)){
                    count++;
                }
            }
        }
		
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count=0;
		int ar[] = new int[n];
		
        System.out.println(divisibleSumPairs(n, k, ar));
    }
}