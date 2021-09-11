import jdk.internal.util.xml.impl.Input;

public class FindTotaFeet 
{
    public static int FindTotaFeet(int input1, int input2[]) 
    {
        int sum=0;
        for(int i=0;i<input2.length;i++)
        {
            sum= sum+(input2[i]/12);
        }
        return sum;
    }

    
}
