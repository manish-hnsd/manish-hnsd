import java.util.Scanner;

class piCount{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        replacePi(str);
    }
    static String replacePi(String s)
    {
        if(s.length()==0){
            return;
        }
        if(s[0]=="p" && s[1]=="i"){
            System.out.println(s.substr[2]);
        }
    }
}