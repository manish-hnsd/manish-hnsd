import java.util.Scanner;
public class EmployeePassword 
{
    public static void main(String[] args)
	{
		System.out.println("Enter your EID: ");
		Scanner s= new Scanner(System.in);
        int n =s.nextInt();
        for(int i=2;i<=n;i++)
        {
			int c=0;
		    for (int j=2; j<i ;j++) 
		    {
			    if (i%j==0) 
			    {
				    c++;
			    }
		    }
			if(c==0)
			{
				System.out.print(i);
			}
		    /*else
		    {
			    System.out.println("Incorrect Password! RETRY ");
		    }*/
	    }
    }
}
