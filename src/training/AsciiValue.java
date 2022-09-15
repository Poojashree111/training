package training;
import java.util.Scanner;

public class AsciiValue {

	public static void main(String[] args) {
		System.out.println("enter a character:");
		Scanner sc = new Scanner(System.in);
		char chr =sc.next().charAt(0);
		int asciiValue = chr;
		System.out.println("ASCII  value of" +chr+ "is:" + asciiValue);
	}
}
