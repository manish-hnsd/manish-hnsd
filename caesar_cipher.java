import java.util.Scanner;

class caesar_cipher{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number_of_letters = sc.nextInt();
        int add = sc.nextInt();
        String s = "middle-Outz";
        String sn = sc.next();

        String str = "";
        for(int i=0; i<number_of_letters; i++){
            str = str + updated_Characters(s.charAt(i), add);
        }
        System.out.println(str);
    }
    static char updated_Characters(char ch, int increment)
    {
        if(Character.isLetter(ch))
        {
            int i = (int) ch;
            i = i + increment;

            if (Character.isUpperCase(ch)){
                if(i>90){
                    int num = (int) ch + increment;
                    i = num - 26;
                }

            }else if (i>122) {
                int num = (int) ch + increment;
                i = num - 26;
            }
            return (char)i;
        }
        return ch;
    }
}
