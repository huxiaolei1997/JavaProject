package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int ThisSum, MaxSum, a = 1;
		ThisSum = MaxSum = 0;
		Scanner in3 = new Scanner(System.in);
		int K = in3.nextInt();
		int[] n = new int[K];
		int w = 0, y = 0;
		List<Integer> alList = new ArrayList<Integer>();
		for (int j = 0; j < K; j++) {
			n[j] = in3.nextInt();
			if (n[j] < 0) {
				w++;
			}
			if (n[j] == 0) {
				y++;
			}
		}
		if (w == K) {
			System.out.print(0 + " " + n[0] + " " + n[K - 1]);
		} else if (w + y == K) {
			for (int i = 0; i < K; i++) {
				if (n[i] == 0)
					break;
			}
			System.out.print(0 + " " + 0 + " " + 0);

		} else {
			for (int i = 0; i < K; i++) {
				a = n[0];
				ThisSum += n[i];
				// System.out.println(ThisSum);
				if (ThisSum > MaxSum) {
					MaxSum = ThisSum;
					if (n[i] != 0) {
						alList.add(n[i]);
					}
				} else if (ThisSum < 0) {
					ThisSum = 0;
				}

			}

		}

		if (a == 0) {
			System.out.print(MaxSum + " " + 0 + " " + alList.get(alList.size() - 1));
		} else {
			System.out.print(MaxSum + " " + alList.get(0) + " " + alList.get(alList.size() - 1));
		}

	}
}