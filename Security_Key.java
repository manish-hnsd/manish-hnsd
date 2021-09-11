import java.util.Scanner;

public class Security_Key {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long data = sc.nextInt();
        long arr[] = new long[10];
        //int i;
        int ans=0;
        while(data !=0){
            arr[data%10]++;
            data = data/10;
        }
        for(int i = 0;i<10;i++){
            if(arr[i] > 1);
                ans++;
        }
        if(ans == 0){
            ans = -1;
        }
        System.out.println("Security no. is"+ ans);
    }
}
