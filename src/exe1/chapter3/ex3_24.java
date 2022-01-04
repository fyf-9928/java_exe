package chapter3;

import java.util.Scanner;

public class ex3_24 {

	public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String[] size_sum = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] color_sum= {"Clubs", "Diamonds", "Hearts", "Spades"};

        int size = (int)(Math.random() * 13 + 1);
        int color = (int)(Math.random() * 4);

        System.out.println("The card you picked is " + size_sum[size] + " of " + color_sum[color]);
	}
}
