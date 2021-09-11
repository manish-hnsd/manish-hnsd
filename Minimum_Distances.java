import java.util.HashMap;
import java.util.Scanner;

public class Minimum_Distances {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n ; i++){
            a[i] = sc.nextInt();
        }
        System.out.print(minDistance(a));
    }
    static int minDistance(int[] a){
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int minDistance = Integer.MAX_VALUE,preIndex=0, currIndex=0;
        
        for(int i= 0; i<a.length; i++){
            if(hmap.containsKey(a[i])){
                currIndex= i;
                preIndex= hmap.get(a[i]);
                minDistance = Math.min(minDistance, (currIndex-preIndex));
            }else
            hmap.put(a[i], i);
        }
        return (minDistance == Integer.MAX_VALUE ? -1 : minDistance);
    }
}
