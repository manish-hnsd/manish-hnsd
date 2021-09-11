import java.util.Scanner;

public class Drawing_Book
{
    static int pageCount(int TotalPage, int pageNo)
    {
        int totalPageCountFront = TotalPage/2;
        int targetPageCountFront = pageNo/2;
        int targetPageFromBack = totalPageCountFront - targetPageCountFront;

        return Math.min(targetPageCountFront, targetPageFromBack);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int TotalPage = sc.nextInt();
        int pageNo = sc.nextInt();
        System.out.println(pageCount(TotalPage,pageNo));
    }
    
}
