package chapter2;

import java.util.Scanner;

public class ex7 {
	public static void main(String[] arg) {

		long totalMilliseconds=System.currentTimeMillis();

		long totalSeconds=totalMilliseconds/1000;
		long currentSecond=totalSeconds%60;

		long totalMinutes=totalSeconds/60;
		long currentMinute=totalMinutes%60;

		long totalHours=totalMinutes/60;
		long currentHour=totalHours%24;

		System.out.println("Current time is " + currentHour + ":"
				+ currentMinute + ":" + currentSecond + " GMT");

	}
}
