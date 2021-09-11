import java.util.Vector;

public class Minimum_number_of_coins {
    public static void main(String[] args) {
        int n = 93;
        System.out.print("Following is the minimal number of change "+ n +":");
        findMin(n);
    }

    static int deno[] = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
    static int n = deno.length;
    static void findMin(int M){
        Vector<Integer> ans = new Vector<>();
        /*int deno[] = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
        int n = deno.length;*/
        for(int i=n-1; i>=0; i++){
            while(M >= deno[i]){
                M -= deno[i];
                ans.add(deno[i]);
            }
        }
        for(int i = 0; i<ans.size(); i++)
        {
            System.out.print(" "+ans.elementAt(i));
        }
    }
    
}
