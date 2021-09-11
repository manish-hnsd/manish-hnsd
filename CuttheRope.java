import java.util.*;

class CuttheRope{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int Sum = -1;
		while (Sum != 0) {
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < n; i++) {
				if (min > arr[i] && arr[i] != 0) {
					min = arr[i];
				}

			}
			int count = 0;
			Sum = 0;
			for (int i = 0; i < n; i++) {
				if (arr[i] >= min) {
					arr[i] = arr[i] - min;
					count++;
				}
				Sum += arr[i];
			}

			System.out.println(count);
		}
		sc.close();
    }
}