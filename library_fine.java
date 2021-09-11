import java.util.Scanner;

public class library_fine
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String d1 = sc.nextLine();
        String d2 = sc.nextLine();




        if(y1>y2)
        return 10000;
        else if(y1==y2&&m1>m2)
        {
            return (m1-m2)*500;
        }
        else if(y1==y2&&m1==m2&&d1>d2)
        {
            return (d1-d2)*15;
        }
        else 
        return 0;
    }

}