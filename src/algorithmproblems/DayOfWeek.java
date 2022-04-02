package algorithmproblems;

import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The day");
		int d = sc.nextInt();
		System.out.println("Enter the Month");
		int m = sc.nextInt();
		System.out.println("Enter the year");
		int y = sc.nextInt();
		System.out.println(Utility.dayOfWeek(d, m, y));
		sc.close();
	}
}