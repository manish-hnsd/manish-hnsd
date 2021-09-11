import java.lang.reflect.Array;
import java.util.Scanner;

public class remove_Duplicate {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //String str = sc.next();
        System.out.println(removeDup("aaabbbeeecddd"));
    }
    static String removeDup(String str){
        if(str.length()==0){
            return "";
        }
        char ch = str[0];
        String ans = removeDup(str.substring(1));
        if(ch == ans[0]){
            return ans;
        }
        return (ch+ans);
    }
    
}
