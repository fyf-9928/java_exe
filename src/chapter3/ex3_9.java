package chapter3;

import java.util.Scanner;

public class ex3_9 {

	public static void main(String[] args){

		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		Scanner input = new Scanner(System.in);
		int integer = input.nextInt();

		int d9 = integer %10;
        int d8 = integer /10 % 10;
        int d7 = integer /100 % 10;
        int d6 = integer /1000 % 10;
        int d5 = integer /10000 % 10;
        int d4 = integer /100000 % 10;
        int d3 = integer /1000000 % 10;
        int d2 = integer /10000000 % 10;
        int d1 = integer /100000000;
	    int check = (int)(d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

	    if (check == 10)
	        System.out.println("The ISBN-10 number is " + d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + "" + d7 + "" + d8 + "" + d9 + "" + "X");
	    else
	        System.out.println("The ISBN-10 number is " + d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + "" + d7 + "" + d8 + "" + d9 + "" + check);

	}

}
