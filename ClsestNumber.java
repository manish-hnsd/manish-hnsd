import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ClsestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt(); 
        }
        Arrays.sort(arr);
        int minDiff= Integer.MAX_VALUE;
        int min1 = 0;
        int min2 = 0, minIndex=-1;

        String res="";
        for(int i =1;i<n; i++){
            int diff = Math.abs(arr[i] - arr[i-1]);
            if(diff < minDiff){
                minDiff = diff;
                min1 = arr[i-1];
                min2 = arr[i];
                minIndex = i;
                res = min1+ " "+min2;
            }
        }
        for (int i = minIndex + 1; i < n; i++) {
			if (minDiff == Math.abs(arr[i] - arr[i - 1])) {
				res = res + " " + arr[i - 1] + " " + arr[i];
			}
        }
        System.out.println(res);
    }
}
