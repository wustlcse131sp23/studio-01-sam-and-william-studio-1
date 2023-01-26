package studio1;

import java.util.Scanner;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Print first name");
		String s0 = in.nextLine();
		System.out.println("print second name");
		String s1 = in.nextLine();
		System.out.println("print 3rd name ");
		String s2 = in.nextLine();
		System.out.println("print 4th name");
		String s3 = in.nextLine();
		//
		// Say hello to the names in s0 through s3.
		//

		System.out.println("Hi " + s0 + ", " + s1 + ", " + s2 + ", and " + s3 + ". How are you all?");
	}
}
