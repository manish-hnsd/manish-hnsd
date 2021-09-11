import java.util.Scanner;

public class FairRations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[] = new int[n];
        for(int i=0;i<n;i++){
            A[i] = sc.nextInt();
        }
        int results = minLoaveCount(A);
        System.out.println(results != -1 ? results : "NO");
        sc.close();
    }

    static int minLoaveCount(int A[]){
        int minCount = 0, sum = 0;
        for(int i=0; i<A.length; i++){
            sum += A[i];

            if (sum %2 ==1){
                minCount += 2;
            }
        }
        return ((sum & 1) == 1) ? -1 : minCount;
    }
    
}
