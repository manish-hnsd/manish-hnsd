import java.io.*;
public class SpiralPrint 
{
    public static void main(String[] args) 
    {
        int a[][]=new int[4][4];
        Scanner s=new Scanner(System.in);
        for(i=0;i<4;<i++)
        {
            for(j=0;j<4;j++)
            {
                System.out.print("Enter Number in Pocket["+i+"]["+j+"]");
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix is....");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.print();
        }
        int row=0,col=0;
        while(row<4 && col<4)
        {
            for(int i=col;i<4;i++)
            {
                System.out.print(a[row][i]+" ");
            }
            row++;
            for(i=row;i<4;i++)
            {
                System.out.print(a[i][n-1]+" ");
            }
            n--;
            if(row<4)
            {
                for(i=n-1;i>=col;i++)
                {
                    System.out.print(x);
                }
            }

        }

    }
    
}
