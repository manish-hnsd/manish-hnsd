import java.util.Scanner;
import java.*;
import javax.swing.text.StyledEditorKit;

public class MatrixIdentical {

    public static void main(String[] args) 
    {
        int matrix1[][]=new int[5][5];
        int matrix2[][]=new int[5][5];
        int i,j,r1,r2;
        boolean flag=true;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Row of Matrices 1: ");
        r1= s.nextInt();
        System.out.println("Enter Column of Matrices 1 :");
        int c1 = s.nextInt();
        System.out.println("Enter Row of Matrix 2: ");
        r2 = s.nextInt();
        System.out.println("Enter Column of Matrix 2 :");
        int c2 = s.nextInt();
        if(r1 != r2 || c1 != c2)
        System.out.println("Matrices are not equal!!!");
        else
        {
            System.out.println("Enter the Elements of Matrix 1: ");
            for(i=0;i<r1;i++)
                for(j=0;j<c1;j++)
                    matrix1[i][j]=s.nextInt();
                System.out.println("Enter the Elements of Matrix 2: ");
                for(i=0;i<r2;i++)
                    for(j=0;j<c2;j++)
                        matrix2[i][j]=s.nextInt();
                for(i=0;i<r1;i++)
                for(j=0;j<c1;j++)
                {
                    if(matrix1[i][j]!=matrix2[i][j])
                    {
                        flag = false;
                        break;
                    }
                }
                if(flag)
                System.out.println("Matrices are equal");
                else
                System.out.println("Matrices are not equal");
        }


    }

    
}
