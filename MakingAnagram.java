import java.util.*;
import java.util.Scanner;

class MakingAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int res = makeAnagram(a,b);
        System.out.println(res);
    }

    static int makeAnagram(String a, String b) {
            int min_deletion =0;
            int[] a_frequencies= new int[26];
            int[] b_frequencies= new int[26];
            for(int i=0; i<a.length(); i++){
                char current_char = a.charAt(i);
                int char_to_int= (int) current_char;
                int position= char_to_int-(int) 'a';
                a_frequencies[position]++;
            }
            for(int i=0; i<b.length(); i++){
                char current_char = b.charAt(i);
                int char_to_int= (int) current_char;
                int position= char_to_int-(int) 'a';
                b_frequencies[position]++;  
        }
        for(int i=0; i<26; i++){
            int difference= Math.abs(a_frequencies[i]- b_frequencies[i]);
            min_deletion += difference; 
        }
        return min_deletion;
    
}