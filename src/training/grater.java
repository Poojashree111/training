package training;
import java.util.Scanner;

public class grater {

	public static void main(String[] args) {
		int x,y;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the 1st user input:");
		x = sc.nextInt();
		System.out.println("enter the 2st user input:");
		y = sc.nextInt();
		if(x>y)
		{
			System.out.println("1st user input is grater");
		}
		else {
			System.out.println("2st user input is grater");
			
		}

	}

}
