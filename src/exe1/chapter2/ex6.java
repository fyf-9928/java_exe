package chapter2;

import java.util.Scanner;

public class ex6 {
	public static void main(String[] arg) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a integer for seconds: ");

		int seconds = input.nextInt();
		int minutes = seconds / 60;
		int remainingSeconds = seconds % 60;

		System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds");
	}
}
