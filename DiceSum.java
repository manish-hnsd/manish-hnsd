import java.util.Scanner;

public class DiceSum {
    public static void main(String[] args) {
        int count=0;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a dice number:");
        int x = s.nextInt();
        for(int i=1;i<=6;i++)
        {
            for(int j=1;j<=6;j++)
            {
                for(int k=1;k<=6;k++)
                {
                    if(x==(i+j+k))
                    count++;
                }
            }
        }
        System.out.println("Possible Combination of three Dice is:"+count);
        
    }
    
}
