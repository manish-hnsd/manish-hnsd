import java.lang.reflect.Array;
import java.util.Scanner;

public class PermutingTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int A[] = new int [n];
        int B[] = new int [n];
        for(int i= 0; i<n; i++){
            A[i]=sc.nextInt();
            B[i]=sc.nextInt();
        }
        String result =PermutingTwoArray.twoArrays(k, A, B);
        System.out.println(result);
    }

    public static String twoArrays(int k, int arr[] A, int arr[] B) {
        // Write your code here
            Array.sort(A);
            Array.sort(B);
            int aIndex = 0, bIndex = B.length-1;
            while(aIndex < A.length && bIndex >=0){
                if(A[aIndex]+B[bIndex]<k)
                    return "NO";
                aIndex++;
                bIndex--;
            }
            return "YES";
        }
}