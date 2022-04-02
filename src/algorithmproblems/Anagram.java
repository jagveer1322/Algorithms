package algorithmproblems;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first name");
		String str = sc.nextLine();
		System.out.println("Enter the Second name");
		String str2 = sc.nextLine();
		System.out.println(Utility.isAnagramString(str, str2));
		sc.close();
		long end = System.currentTimeMillis();
		System.out.println("Time is taken by to program in milli seconds " + (end - start));
	}

}
