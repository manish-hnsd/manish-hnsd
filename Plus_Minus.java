import java.util.Scanner;
public class Plus_Minus 
{
    public static void plus_Minus(int arr[])
    {
        int len = arr.length;
        float positiveCount= 0;
        float negativeCount= 0;
        float zeroCount = 0;

        for(int i=0;i<len;i++)
        {
            int e = arr[i];
            if(e >0)
            {
                positiveCount = positiveCount+1;
            }
            if(e<0)
            {
                negativeCount++;
            }
            if(e==0)
            {
                zeroCount++;
            }
            System.out.printf("%1.6f \n",positiveCount);
            System.out.printf("%1.6f \n",negativeCount);
            System.out.printf("%1.6f \n",zeroCount);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0; i< n; i++)
        {
            arr[i] = sc.nextInt();
        }
        plus_Minus(arr); 
        sc.close();
    }
    
}
