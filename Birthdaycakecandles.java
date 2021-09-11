import java.util.Scanner;

public class Birthdaycakecandles 
{
    static int birthdayCakeCandales(int [] arr)
    {
        int maxCandaleHeight = Integer.MIN_VALUE;
        int maxCandaleFreq = 0;

        for(int i =0; i<arr.length; i++){
            if (arr[i] == maxCandaleHeight){
                maxCandaleFreq++;
            }

            if(arr[i] > maxCandaleHeight){
                maxCandaleHeight = arr[i];
                maxCandaleFreq = 1;
            }
        }
        return maxCandaleFreq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a[] = new int[N];
        for(int i = 0; i<N; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println(birthdayCakeCandales(a));
        sc.close();
        
    }
    
}
