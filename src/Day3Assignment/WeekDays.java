package Day3Assignment;

import java.util.Scanner;

public class WeekDays {
	public static void main(String []args) {
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the name of week"+" ");
		String week = sc1.next();
		
		switch(week) {
		case "Sunday" : System.out.println("Weekday is 1");break;
		case "Monday" : System.out.println("Weekday is 2");break;
		case "Tuesday" : System.out.println("Weekday is 3");break;
		case "Wednesday" : System.out.println("Weekday is 4");break;
		case "Thursday" : System.out.println("Weekday is 5");break;
		case "Friday" : System.out.println("Weekday is 6");break;
		case "Saturday" : System.out.println("Weekday is 7");break;
		default : System.out.println("Invalid");break;
		
		}
		
		
	}

}
