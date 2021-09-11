import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class CompareTriplets
{
    public class Compare
    {
        static List<Integer> Compare(List<Integer> a, List<integer> b)
        {
            int alce = 0, bob = 0;

            for (int i = 0; i< 3; i++)
            {
                int aliceScore = a.get(i);
                int bobScore = b.get(i);
                if(aliceScore != bobScore)
                {
                    int temp = aliceScore > bobScore ? aliceTotalScore++ : bobTolalScore++;
                }
            }
            List<Integer> result = new ArrayList<>();
            result.add(aliceTotalScore);
            result.add(bobTotalScore);
            return result;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int a3 = sc.nextInt();
            int b1 = sc.nextInt();
            int b2 = sc.nextInt();
            int b3 = sc.nextInt();
        }
    }

}