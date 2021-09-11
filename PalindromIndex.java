import java.util.Scanner;

class PalindromIndex{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            String s=sc.next();
            int result = palindromIndex(s);
            System.out.println(result);
        }
    }
    static int palindromIndex(String s){
        int palindromIndex = -1;
        int len = s.length();

        for(int i=0; i< len/2;i++){
            if(s.charAt(i) != s.charAt(len - i -1)){
                if(i+1 < len){
                    boolean isRightValid = isValid(s.substring(i+1, len -1));
                    if(isRightValid){
                        return i;
                    }
                    return len - i - 1;
                }
            }
        }
        return palindromIndex;  
    }
    static boolean isValid(String str){
        int len= str.length();
        for(int i = 0; i<len/2; i++){
            if(str.charAt(i) != str.charAt(len - i - 1)){
            return false;
            }
        }
        return true;
    }
}