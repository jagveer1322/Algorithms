package algorithmproblems;

import java.util.Scanner;

public class AnswerGuessing {

	// invariant: answer is in [lo, hi)
	public static int search(int lo, int hi) {
		Scanner sc1 = new Scanner(System.in);

		if ((hi - lo) == 1)
			return lo;
		int mid = lo + (hi - lo) / 2;
		System.out.println("Is it less than %d?  " + mid);
		if (sc1.nextBoolean())
			return search(lo, mid);
		else
			return search(mid, hi);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = (int) Math.pow(2, k);
		System.out.println("Think of an integer between %d and %d\n" + 0 + " " + (n - 1));
		int secret = search(0, n);
		System.out.println("Your number is %d\n" + secret);
		sc.close();

	}

}
