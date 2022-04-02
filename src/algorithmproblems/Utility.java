package algorithmproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Utility {

	public static boolean isAnagramString(String str1, String str2) {
		if (str1.length() == str2.length()) {
			char a[] = str1.toCharArray();
			char b[] = str2.toCharArray();

			Arrays.sort(a);
			Arrays.sort(b);
			if (Arrays.equals(a, b)) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	public static int isAnagramInt(int a, int b) {
		int p = 0;
		String.valueOf(a);
		String.valueOf(b);

		return p;
	}

	public static boolean isAnagram(String n1, String n2) {

		char a[] = n1.toCharArray();
		char b[] = n2.toCharArray();

		Arrays.sort(a);
		Arrays.sort(b);
		if (Arrays.equals(a, b)) {
			return true;
		}
		return false;
	}

	public static boolean isPrime(int n) {
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static ArrayList<Integer> isPrimePallindrom(ArrayList<Integer> alist) {
		ArrayList<Integer> blist = new ArrayList<Integer>();
		for (int i = 0; i < alist.size(); i++) {
			int a = alist.get(i);
			int reverse = 0;
			while (a > 0) {
				int r = a % 10;
				reverse = reverse * 10 + r;
				a = a / 10;
			}
			if (reverse == alist.get(i)) {
				blist.add(reverse);
			}

		}
		return blist;
	}

	public static int binarySearchInt(int arr[], int x) {
		int l = 0;
		int r = arr.length - 1;

		while (l <= r) {
			int m = l + (r - l) / 2;
			if (arr[m] == x)
				return m;

			if (arr[m] < x)
				l = m + 1;
			else
				r = m - 1;
		}
		return -1;
	}

	public static int binarySearchString(String arr[], String x) {
		int l = 0;
		int r = arr.length;
		while (l <= r) {
			int m = l + (r - 1) / 2;
			int val = x.compareTo(arr[m]);
			if (val == 0) {
				return m;
			}
			if (val > 0)
				l = m + 1;
			else
				r = m - 1;
		}
		return -1;
	}

	public static void bubbleSort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void bubbleSortString(String arr[]) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].compareTo(arr[j]) > 0) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void insertionSortInt(int arr[]) {

		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i;
			while (j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[j - 1];
				j = j - 1;
			}
			arr[j] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public static void insertionSortString(String arr[]) {
		for (int i = 1; i < arr.length; i++) {
			String temp = arr[i];
			int j = i;
			while (j > 0 && arr[j - 1].compareTo(temp) > 0) {
				arr[j] = arr[j - 1];
				j = j - 1;
			}
			arr[j] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public static String dayOfWeek(int d, int m, int y) {

		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + 31 * m0 / 12) % 7;

		String week[] = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		return week[d0];
	}

	public static void Conversion(int C, int n) {

		switch (n) {
		case 1:
			double f = (C * 9 / 5) + 32;
			System.out.println("The temprature in farneheight" + f);

		case 2:
			double F = (double) (C);
			double c = (F - 32) * (5 / 9);
			System.out.println("The temprature in celcious" + c);
		}
	}

	public static void currency(int money) {

		int[] notes = { 1000, 500, 100, 50, 20, 10, 5, 2, 1 };
		int[] noteCounter = new int[9];

		for (int i = 0; i < notes.length; i++) {
			if (money >= notes[i]) {
				noteCounter[i] = money / notes[i];
				money = money - noteCounter[i] * notes[i];
			}
		}
		System.out.println("Currency Count ->");
		for (int i = 0; i < 9; i++) {
			if (noteCounter[i] != 0) {
				System.out.println(notes[i] + " : " + noteCounter[i]);
			}
		}
	}

	public static void toBinary(int n) {
		String bin = "";
		while (n > 0) {
			int b = n % 2;
			bin = b + bin;
			n = n / 2;
		}
		System.out.println(bin);
	}

	public static void toDecimal(int n) {
		int dec = 0, i = 0;
		while (n != 0) {
			dec += n % 10 * Math.pow(2, i);
			n = n / 10;
			i++;
		}
		System.out.println("Your Decimal number is from Binary ==>>" + dec);
	}

	public static void sqrt(int c) {
		double t = c;
		double epsilon = 1e-15;
		while (Math.abs(t - (c / t)) > epsilon * t) {
			t = (t + (c / t)) / 2;
		}
		System.out.println(t);
	}

	public static int guessing(int lo, int hi) {
		Scanner sc = new Scanner(System.in);
		int mid = (lo + hi) / 2;

		if (hi - lo == 1)
			return lo;
		System.out.println("this number is less than from this number  " + mid);
		if (sc.nextBoolean()) {
			return guessing(lo, mid);
		} else {
			return guessing(mid, hi);
		}
	}

	public static void monthlyPayment(int p, int y, int R) {
		int n = 12 * y;
		double r = (double) R / (12 * 100);
		double payment = (p * r) / (1 - Math.pow((1 + r), -n));
		System.out.println(payment);
	}

	public static void main(String[] args) {
	}

}
