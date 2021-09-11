import java.util.Scanner;
public class Primeno
{
	public static void main(String[] args)
	{
		System.out.println("Enter a Number");
		Scanner s= new Scanner(System.in);
		int n =s.nextInt();
		int temp=0;
		for (int i=2; i<=n-1 ;i++ ) 
		{
			if (n%i!=0) 
			{
				temp=temp+1;
			}
		}
		if(temp==0)
		{
			System.out.println(n+"is primeno");
		}
		else
		{
			System.out.println(n+"is not a prime Number");
		}
	}
}