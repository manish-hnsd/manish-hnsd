import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class OrganizingContainersofBalls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int n = sc.nextInt();
        //int m = sc.nextInt();
        int[][] a = new int[n][n];
        for(int i=0; i<n ; i++){
            for(int j=0; j<n; j++){
                a[i][j] = sc.nextInt();
                //System.out.print(a[m][n]+ " ");
            }
            //System.out.println();
        }
        String ans =  organizingContainers(a[n][n], n);
        System.out.println(ans);
    }
    public static String organizingContainers(Class<a[][]> class1, int n) {
    // Write your code here
        boolean flag = true;
        //int size = a.length;
        int box[] = new int[n];
        int type[] = new int[n];
        for(int i=0; i<n; i++){
            for(int j=0;j<n; j++){
                box[i] += class1[i][j];
                type[j] += class1[i][j];
            }
        }
        Arrays.sort(box);
        Arrays.sort(type);
        for(int i=0; i<n; i++){
            if(box[i]!= type[i])
                flag = false;
        }
        if(flag)
            return "Possible";
        return "Impossible";
    }
}