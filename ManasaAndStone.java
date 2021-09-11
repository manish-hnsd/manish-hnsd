import java.util.Scanner;

public class ManasaAndStone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0; i<T; i++){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int[] result = stones(n,a,b);
            for(int i= 0; i<result.length; i++){
                System.out.print(result[i]+ (i !=result.length - 1 ? " " : ""));
            }
            System.out.println("");
        }
    }
    static int[] stones(int n, int a, int b){
        if(a==b){
            int c[] = {a*(n-1)};
            return c;
        }
        int output[] = new int[n];
        if(b<a){
            int tmp = a;
            a=b;
            b=tmp;
        }
        output[0] = a*(n-1);
        int diff = Math.abs(b-a);
        for(int i= 1; i<n; i++){
            output[i] = diff + output[i -1];
        }
        return output;
    }
}
