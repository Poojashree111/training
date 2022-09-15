package training;
import java.util.Scanner;

public class Numberformatexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("enter any valid integer: ");
			try {
				number=Integer.parseInt(sc.next());
				System.out.println("you entered:"+number);
				break;
			}
			catch(NumberFormatException e) {
				System.out.println("NumberFormatException occurred");
			}
		}

	}

}
