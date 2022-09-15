package training;
import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		int i;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the age:");
		i=scan.nextInt();
		if(i>=18) {
			System.out.println("you are eligable for vote");
		}
		else {
			System.out.println("you are not eligable for vote");
			
		}

	}

}
