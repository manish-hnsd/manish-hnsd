import java.util.Scanner;

public class NumberofLines {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x1= sc.nextInt();
        int v1 = sc.nextInt();
        int x2 = sc.nextInt();
        int v2 = sc.nextInt();

        System.out.println(kangaroo(x1,v1,x2,v2));
    }
    static String kangaroo(int x1, int v1, int x2, int v2){
        if(v1>v2){
            int rem = (x1-x2) % (v2-v1);
            if(rem == 0){
                return "YES";
            }
        }
        return "NO";
    }
}
