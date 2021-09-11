public class Triangle_Triplet 
{
    public static void main(String[] args) 
    {
        int arr[] = {4, 6, 3, 7};
        int size = arr.length;
        System.out.println("Total Number of Triangles Formed are: "+ numberOfTriangles(arr, size));      
    }
    static int numberOfTriangles(int arr[], int n)
    {
        int count = 0;
        for(int i= 0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                for(int k= j+1; k<n; k++)
                if(
                    arr[i]+arr[j]>arr[k]
                    && arr[i]+arr[k]>arr[j]
                    && arr[k]+arr[j]>arr[i]
                )
                count++;
            }
        }
        return count;
    }
}