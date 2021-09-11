public class LeaderinanArray {
    public static void main(String[] args) {
        LeaderinanArray lead = new LeaderinanArray();
        int arr[]= new int[]{16,20,4,13,5,6};
        int n = arr.length;
        lead.printLeaders(arr, n);
    }
    void printLeaders(int arr[], int size){
        for (int i=0; i<size; i++){
            int j;
            for(j=i+1;j<size;j++){
                if(arr[i] <= arr[j])
                    break;
            }
            if(j==size)
                System.out.print(arr[i]+ " ");
        }
    }
}
