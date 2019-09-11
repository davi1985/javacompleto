package course.chapter2.topicosbasicos;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String day;
		int dayNumber;
		
		System.out.println("Enter a day number:");
		dayNumber = scan.nextInt();
		
		switch (dayNumber) {
		case 1:
			day = "Sunday";
			break;
		case 2:
			day = "Monday";
			break;
		case 3:
			day = "Tuesday";
			break;
		case 4:
			day = "Wednesday";
			break;
		case 5:
			day = "Thursday";
			break;
		case 6:
			day = "Friday";
			break;
		case 7:
			day = "Saturday";
			break;
		default:
			day = "Invalid value";
		}
		
		System.out.println(day + " is the "+ dayNumber + "th day of the week.");
		
		scan.close();
		
	}
}
