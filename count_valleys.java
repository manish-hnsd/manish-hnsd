import java.util.Scanner;

public class count_valleys {
    static int counting_Valleys(int n, String s)
    {
        int valleyCounter = 0, altitude = 0;

        for(int i = 0; i<n; i++)
        {
            char ch = s.charAt(i);
            if(ch == 'U')
            {
                altitude++;
                if(altitude == 0)
                {
                    valleyCounter++;
                }
            }else
                {
                    altitude--;
                }
            }
            return valleyCounter;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(counting_Valleys(n, str));
        sc.close();
    }
    
}
