package chapter9_exe;

import java.util.GregorianCalendar;

public class ex9_4 {
	public static void main(String[] args) {

		GregorianCalendar calendar = new GregorianCalendar();
		System.out.println("��ʾ��ǰ��������: " + calendar.get(calendar.YEAR) + "." + calendar.get(calendar.MONTH) + "."
				+ calendar.get(calendar.DAY_OF_MONTH));

		calendar.setTimeInMillis(1234567898765L);
		System.out.println("��ʾ�ض���������: " + calendar.get(calendar.YEAR) + "." + calendar.get(calendar.MONTH) + "."
				+ calendar.get(calendar.DAY_OF_MONTH));

	}
}
