public class MaxMin 
{
    public static void main(String[] args) 
    {
        int n[]= new int[]{33,53,73,94,22,45,23,87,13,63};
        int max = n[0];
        int min = n[0];

        for(int i=1; i<n.length;i++)
        {
            if(n[i]>max)
            max= n[i];
            else if (n[i]<min)
            min= n[i];
        }
        System.out.println("max number is :"+max);
        System.out.println("min number is :"+min);
    }
    
}
