import java.util.Scanner;

public class EqualizeTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for()

    }
    static int equalizeArray(int[] arr) {
		int len = arr.length;
		int aux[] = new int[101];
		for (int i = 0; i < len; i++) {
			int index = arr[i];
			aux[index]++;
		}
        int maxFreqCount = getMaxFreqCount(aux);
		return len - maxFreqCount;
    }
    private static int getMaxFreqCount(int[] aux) {
		int maxFreqCount = Integer.MIN_VALUE;
		for (int freqCount : aux) {
			if (freqCount > maxFreqCount) {
				maxFreqCount = freqCount;
			}
		}
		return maxFreqCount;
	}
}
