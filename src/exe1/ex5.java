package chapter2;

import java.util.Scanner;

public class ex5 {
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a degree in Fahrenheit: ");

		double fahrenheit = input.nextDouble();
		double celsius=(5.0/9)*(fahrenheit-32);

		System.out.println("Fahrenheit "+ fahrenheit + " is "
				+ celsius + " in Celsius");
	}
}
