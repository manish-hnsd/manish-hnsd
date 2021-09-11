import java.util.Scanner;

public class correctnessandtheLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        correctness(arr);
    }
    static void correctness(int []A){
        for(int i=1; i<A.length; i++){
            int value = A[i];
            int j = i-1;
            while (j>=0 && A[i] > value){
                A[j+1] = A[j];
                j--;
            }
            A[j+1] = value;
        }
        printArr(A);
    }
    static void printArr(int []arr){
        for(int n :arr)
        System.out.print(n+" ");
    }
}
