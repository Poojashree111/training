package training;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		int month;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the month:");
		month=sc.nextInt();
		switch(month){
		case 1:
			System.out.println("showing month:january");
			break;
		case 2:
			System.out.println("showing month:february");
			break;
		case 3:
			System.out.println("showing month:march");
			break;
		case 4:
			System.out.println("showing month:april");
			break;
		case 5:
			System.out.println("showing month:may");
			break;
		case 6:
			System.out.println("showing month:jun");
			break;
		case 7:
			System.out.println("showing month:july");
			break;
		case 8:
			System.out.println("showing month:august");
			break;
		case 9:
			System.out.println("showing month:september");
			break;
		case 10:
			System.out.println("showing month:oct");
			break;
		case 11:
			System.out.println("showing month:nevember");
			break;
		case 12:
			System.out.println("showing month:december");
			break;
			default:
			System.out.println("invalid input wrong month number");
			break;
		}
	}
}











	


