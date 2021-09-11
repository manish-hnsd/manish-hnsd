import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bigSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List <String> unsorted = new ArrayList<>(n);
        for (int i = 1; i <= n; i++)
            unsorted.add(i);
    }
}
