import java.util.Scanner;

class CircularArrayRotation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int queries = sc.nextInt();
        int a[] = new int [n];
        for(int i= 0; i<n; i++){
            a[i]=sc.nextInt();
        }
        rotateArray(a,k,queries)
    }
    static int rotateArray(int[] a, int k, int q){
        k=k%a.length;
        int l=a.length;
        for(int i=0; i<q.length; i++){
            int pos=(q[i]-k+l)%l;
            queries[i]=a[pos];
        }
        return queries;
    }
}