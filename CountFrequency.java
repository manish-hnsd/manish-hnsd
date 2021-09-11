import java.util.*;
import java.util.Scanner;

public class CountFrequency 
{
    public static void CountFrequency(int a[]) 
    {
        int count=1;
        for(int i= 0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length; j++)
            {
                if(a[i]>a[j])
                {
                    a[i]=a[i]+a[j];
                    a[i]=a[i]-a[j];
                    a[i]=a[i]-a[j];
                }
            }
        }
        for(int i=0; i<a.length;i++)
        {
            for(int j= 0;j<a.length;j++)
            {
                if (a[i]==a[j])
                {
                    count= count +1;
                }
            }
            int t=i;
            i=i+count;
            System.out.println("%d is repeated %d times",a[t],count);
            count=1;
        }
    }
    
}

public static void main(String[] args) 
{
    int arr[];
    System.out.print(" Enter the numbers: ");
    int size=new Scanner(System.in).nextInt();
    arr= new int [size];
    System.out.print("Enter the element of array:");
    for(int i=0;i<arr.length;i++)
    {
        arr[i] = new Scanner(System.in).nextInt();
    }
    CountFrequency(arr);
}
}