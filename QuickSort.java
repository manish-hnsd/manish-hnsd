import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int begin = 0;
        int end = n-1;
        quickSort(arr, begin, end);
        System.out.println("Sorted array are ");
        printArray(arr, n);
        sc.close();
    }
    public static void quickSort(int arr[], int begin, int end){
        if(begin < end){
            //Find the partition
            int partition = findPartition(arr,begin,end);

            //Do quick sort on the left part
            quickSort(arr, begin, partition-1);

            //Do quick sort on the right side
            quickSort(arr, partition+1, end);
        }
    }
    public static int findPartition(int[] arr, int begin, int end){
        //Taking last elegment as pivot element
        int pivot = arr[end];
        int i = (begin-1); //index of smalller element
        for(int j=begin; j<end; j++){
            //If current element is smaller than the pivot
            if(arr[j] < pivot){
                // Increment index of 
            // smaller element
                i++;
                //swap arr[i] and arr[j]
                swap(arr, i, j);
            }
        }
        //swap arr[i+1] and arr[high] (or pivot)
        swap(arr, i+1, end);
        return (i+1);
    }

    private static void swap(int array[], int i, int j) {
		int temp = array[j];
		array[j] = array[i];
		array[i] = temp;
	}

    static void printArray(int[] arr, int size){
    for(int i = 0; i < size; i++)
        System.out.print(arr[i] + " ");
          
    System.out.println();
    }
}