import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j=0; j<n; j++){
                arr[j] = sc.nextInt();
            }
            int result = sansaXor(arr);
            System.out.println(result);
        }
    }
    static int sansaXor(int[] arr){
        int res = 0;
        int len = arr.length;
        if((len ^ 1) == 0)
            return 0;
        for(int i=0; i<arr.length; i++){
            if((i & 1) == 1)
                res ^= arr[i];
        }
        return res;
    }
}
