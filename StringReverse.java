import java.util.Scanner;
import java.util.*;
public class StringReverse 
{
    public static void main(String[] args) 
    {
        Scanner s= new Scanner("System.in");
        System.out.println("Enter a String: ");
        String str= s.nextLine();
        
        String[] str2=str.split(" ");
        int l = str2.length;
        for(int i=0;i<l;i++)
        {
            StringBuffer sb=new StringBuffer(str2[i]);
            StringBuffer revstr= sb.reverse();
            System.out.print(""+revstr);

        }
    }
    
}
