package chapter3;

import java.util.Scanner;

public class ex3_28 {

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double w1 = input.nextDouble();
		double h1 = input.nextDouble();

		System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double w2 = input.nextDouble();
		double h2 = input.nextDouble();

		double inMinX = x1-(w1-w2)/2;
		double inMaxX = x1+(w1-w2)/2;

		double inMinY = y1-(h1-h2)/2;
		double inMaxY = y1+(h1-h2)/2;

		double outMinX = x1-(w1+w2)/2;
		double outMaxX = x1+(w1+w2)/2;

		double outMinY = y1-(h1+h2)/2;
		double outMaxY = y1+(h1+h2)/2;

		if(x2>=inMinX && x2<=inMaxX && y2>=inMinY && y2<=inMaxY){
			System.out.println("r2 is inside r1");
		}

		else if(x2>=outMaxX || x2<=outMinX || y2>=outMaxY ||y2 <=outMinY){
			System.out.println("r2 does not overlap r1");
		}

		else{
			System.out.println("r2 overlaps r1");
		}


	}
}
