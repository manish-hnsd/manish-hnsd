import java.util.Scanner;

public class FlippingtheMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        
        //int[][] arr = new int[2*n][2*n];
        for(int k=0; k<q; q++){
            int n = sc.nextInt();
            String[][] s=new String[2*n][2*n];
            for(int i=0; i < 2*n; i++){
                for(int j=0; j < 2*n; j++){
                    s[i][j] = sc.next();
                }
            }
        }
        int sum = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                sum += Math.max(Math.max(arr[i][j], arr[i][2*n-j-i]), Math.max(arr[2*n-i-1][j], arr[2*n-i-1][2*n-j-1]));
            }
            System.out.println(sum);
        }
    }
}