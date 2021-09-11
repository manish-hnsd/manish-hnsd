import java.util.Scanner;

class Repeated_String{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long n = sc.nextLong();
        long count = repeatedString(s,n);
        System.out.print("Repeated 'a' Are : "+count);
    }
    static long repeatedString(String s, long n){
        long sLen = s.length();
        int count = 0;
        for (int i = 0; i<sLen; i++){
            if(s.charAt(i) == 'a'){
                ++count;
            }
        }
        long repeatTimes = n/sLen;
        long sLeftLeng = n - (sLen*repeatTimes);
        int extra = 0;
        for(int i=0;i<sLeftLeng;i++){
            if(s.charAt(i) == 'a'){
                ++extra;
            }
        }
        long totalCount = (repeatTimes*count)+extra;
        return totalCount;
    }
}