import java.util.Scanner;

public class TwoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            String str1= sc.next();
            String srt2= sc.next();
            String result= twoString(str1, str2);
            System.out.println(result);
        }
    }
        static String twoString(String str1, String str2){
            int len = str1.length() < str2.length() ? str1.length() : str2.length();
            int charExit[] = new int[26];

            for(int i=0; i<len;i++){
                int ind = str1.charAt(i)-'a';
                charExit [ind] = 1; 
            }
            for(int i =0; i<len;i++){
                int ind = str2.charAt(i)-'a';
                if(charExit[ind]>0)
                return "YES";
            }
            return "NO";
        }
}
