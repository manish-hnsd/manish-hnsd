import java.util.Scanner;

class min_max_sum
{
    static void minMaxSum(int arr[]){
        int min = 0, max = 0, sum = 0;
        min = arr[0];
        max = min;
        sum = min;
        for(int i = 1; i<arr.length; i++){
            sum += arr[i];
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.print((sum - max)+ " "+ (sum-min));
    }
    public static void main(String[] args) 
    {
        //Scanner sc = new Scanner(System.in);
        //int arr[] = sc.nextInt();
        int arr[] = {10, 20, 30, 40, 50};

        /*System.out.println("Enter Number ");
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            arr [i]*/
        }
    }

}