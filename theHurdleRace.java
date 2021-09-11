import java.util.Scanner;

public class theHurdleRace 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int sum = 0;
        for(int height=0; height<n; height++){
            int temp = sc.nextInt();
            if(temp > k){
                sum += (temp - k);
                k = temp;
            }
        }
        System.out.println("Output"+sum);
    }
    
}
