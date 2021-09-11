import java.util.Scanner;

class MatrixinSpiralForm 
{
    private static void MatrixSpiral(int[][] matrix)
    {
        int top = 0, bottom = matrix.length -1;
        int left = 0, right =matrix[0].length-1;
        while(true)
        {
            if(left>right)
            {
                break;
            }

            // print top row
            for(int i=left;i<right;i++)
            {
                System.out.print(matrix[top][i]+" ");
            }
            top++;
            if (top>bottom)
            {
                break;
            }
            //print right column
            for(int i = top; i<=bottom; i++)
            {
                System.out.print(matrix[i][right]+" ");
            }
            right--;
            if(left>right)
            {
                break;
            }
            //print bottom row
            for(int i=right; i>=left;i--)
            {
                System.out.print(matrix[bottom][i]+" ");
            }
            bottom--;
            //print left collumn
            for(int i =bottom;i>=top;i--)
            {
                System.out.print(matrix[i][left]+" ");
            }
            left++;
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Rows in Matrix :");
        int row = sc.nextInt();
        System.out.println("Enter number of Columns in Matrix :");
        int column = sc.nextInt();
        int [][] matrix = new int [row][column];
        System.out.println(" Length "+matrix.length);
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.println("Enter the number: ["+i+"]["+j+"]");
                matrix[i][j] = sc.nextInt();
            }
        }
        MatrixSpiral(matrix);
    }
    
}
