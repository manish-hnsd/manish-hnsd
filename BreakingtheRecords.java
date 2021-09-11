import java.util.Scanner;

public class BreakingtheRecords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int score[] = new int[n];
        int baseScore = sc.nextInt();
        int bestScoreCount = 0, leastScoreCount = 0;
        int baseBestScore = baseScore, baseLeastScore = baseScore;
        for(int i=1; i<n; i++){
            score[i] = sc.nextInt();
            if(score[i] < baseLeastScore){
                baseLeastScore = score[i];
                leastScoreCount++;
            }
            if(score[i] > baseBestScore){
                baseBestScore = score[i];
                bestScoreCount++;
            }
        }
        System.out.println(bestScoreCount+ " "+ leastScoreCount);
        sc.close();
    }
}