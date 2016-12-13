package dateTimeJava8;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ssa");
		Scanner in = new Scanner(System.in);
		String input = in.next();
		LocalTime parsedTime1 = LocalTime.parse(input, formatter);
		System.out.println(parsedTime1);
	}

}
