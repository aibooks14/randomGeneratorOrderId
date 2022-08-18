import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.Random;

public class RandomNumber {

	public static void orderIdGenerator() {
		Random rnd = new Random();
		int number1 = rnd.nextInt(999999);
		String s1 = String.valueOf(number1);

		int number2 = rnd.nextInt(999999);
		String s2 = String.valueOf(number2);

		System.out.println(number1 + "" + number2);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		String date = dtf.format(now);
		String year = date.substring(0, 4);
		String month = date.substring(5, 7);
		String day = date.substring(8, 10);
		String hour = date.substring(11, 13);
		String minute = date.substring(14, 16);
		String second = date.substring(17, 19);

		String date1 = year + month + day;
		String time = hour + minute + second;
		String orderId = date1 + time + s1 + s2;
		System.out.println(orderId);
		
	}

	public static void main(String[] args) {
		orderIdGenerator() ;
	}
}
