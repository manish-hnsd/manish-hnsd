class CeilingofaFloor{
    public static void main(String[] args) {
        int a[] = {2, 3, 5, 9, 14, 16, 18};
        int target = 20;
        int ans = ceiling(a, target);
        System.out.println(ans);
    }
    static int ceiling(int a[], int target){
        int start = 0;
        int end = a.length-1;

        while(start <= end){
            //finding the middlr element mid = (stat+end)/2
            int mid = start+ (end-start)/2;
            if (target < a[mid]){
                end = mid-1;
            }else if (target > a[mid]){
                start = mid+ 1;
            }else {
                return mid;
            }
        }
        return start;
    }
}