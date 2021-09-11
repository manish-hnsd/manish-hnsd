import java.util.Scanner;

class Grading_School
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++)
        {
            int grade = sc.nextInt();
            System.out.println(grade < 38 || grade %5 < 3 ? grade : grade + (5-grade % 5));

        }
        
    }
}