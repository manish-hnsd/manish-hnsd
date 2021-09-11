import java.util.Scanner;

public class Distinct_Elements
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array: ");
        int n = sc.nextInt();
        System.out.println("Elements for the 2nd elements: ");
        int m = sc.nextInt();*/
        int arr1[]= {1,2,3,4,5};
        int arr2[]= {2,6,8,10};
        System.out.print("Entered Elements are: "+ arr1 + arr2);
        /*for(int i=0;i<n;i++)
        {
            arr1[i] = sc.nextInt();
        }
        for(int j=0; j<n; j++)
        {
            arr2[j] = sc.nextInt();
        }
        /*System.out.print("Input Array is: ");
        for(int i=0; i<n; i++)
        {   
            System.out.print(arr1[i]+ " ");

        }*/
        //distinct(arr, n);
        
    }
    /*static void distinct(int arr[], int num)
    {
        System.out.println("");
        System.out.println("Distinct Elements: ");
        for(int i=0; i<num; i++)
        {
            int j;
            for(j=0; j<i; j++)
            if(arr[i] == arr[j])
            break;
            if(i==j)
            System.out.print(arr[i] + " ");
        }

    }*/

}