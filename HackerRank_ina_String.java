public class HackerRank_ina_String {
    import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'hackerrankInString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String hackerrankInString(String s) 
    {
    // Write your code here
        String s2 = "hackerrank";
        int m = s.length();
        int n = s2.length();

        char a[] = s.toCharArray();
        char b[] = s2.toCharArray();

        int c[][] = new int[n + 1][m + 1];

        for(int i = 1; i < n; i++)
        {
            for (int j = 1; j <= m; j++)
            {
                if(b[i-1] == a[j-1])
                {
                    c[i][j] = c[i-1][j-1]+1;
                } else
                {
                    c[i][j] = Math.max(c[i-1][j], c[i][j-1]);
                }
            }
        }
        int count = [n][m];
        if(count == n)
        {
            return "YES";
        }else
        return "NO";
    }

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Result.hackerrankInString(s);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}

    
}
