class SequenceEquation{
    public static void main(String args[]){
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<=n; i++){
            arr[i]=sc.nextInt();
        }
        for(int i= 1; i<=n; i++){
            System.out.println(IndexofIndex(arr, i, 2));
        }
    }
    static int IndexofIndex(int arr[], int k, int j){
        
    }
}