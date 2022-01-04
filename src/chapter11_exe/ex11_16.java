package chapter11_exe;

import java.util.ArrayList;
import java.util.Scanner;

public class ex11_16 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);
		Scanner input = new Scanner(System.in);
		System.out.print("What is " + number1 + " + " + number2 + "? ");
		int answer = input.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		while (number1 + number2 != answer) {
			while (list.contains(answer)) {
				System.out.println("You already entered " + answer);
				break;
			}
			System.out.print("Wrong answer.try again. What is " + number1 + " + " + number2 + "? ");
			list.add(answer);
			answer = input.nextInt();
		}
		System.out.println("You got it!");
	}

}
