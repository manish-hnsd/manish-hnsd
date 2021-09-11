import java.util.*;
public class Insertion_SortPart2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int res = insertion(n,arr);
        System.out.println(" "+res);
    }
    static int insertion(int no,int arr[]){
        int num, shift=0;
        for(int i=1; i<no;i++){
            num = arr[i]; 
            int j=i-1;
            while(j >= 0 && arr[j] > num){
                arr[i+1] = arr[j];
                ++shift;
                --j;
            }
            arr[j+1]= num;
        }
        return shift;
    }
}
