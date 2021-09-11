import java.util.Scanner;

public class Insertion_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        insertion(n,arr);
    }
    static void insertion(int no,int arr[]){
        for(int i=0; i<no; i++){
            int s = arr[i];
            int j;
            for(j=i-1; j>=0 && arr[j] > s; j--){
                arr[j+1]= arr[j];

                printArr(arr);
            }
            arr[j+1]=s;
        }
        printArr(arr);
    }
    static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"");
        }
        System.out.println();
    }
    
}
