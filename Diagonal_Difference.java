import java.util.*;
import java.util.Scanner;
public class Diagonal_Difference 
{
    static int diagonalDifference(int arr[][], int n)
    {
        int leftSum = 0, rightSum =0;
        //int n = arr.length;
        for(int i = 0; i<n; i++)
        {
            leftSum += arr[i][i];
            rightSum += arr[i][n - 1 - i];
        }
        return (Math.abs(leftSum - rightSum));
    }
    public static void main(String[] args) 
    {
        //int n,m;
        //int[][] arr = new int[n][m];  
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int m = sc.nextInt(); 
          
        int arr[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for (int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        // {
        //     {11, 2, 4},
        //     {4 , 5, 6},
        //     {10, 8, -12}
        // };
        int result = diagonalDifference(arr,n);
        System.out.print(result);
        sc.close();
    }
}
