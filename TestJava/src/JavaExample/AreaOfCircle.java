package JavaExample;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first num :");

		int num = scan.nextInt();

		for (int i = 1; i <= num; i++) {

			if (num % i == 0)
				System.out.println(i);
		}

	}

}
