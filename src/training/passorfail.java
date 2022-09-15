package training;

import java.util.Scanner;

public class passorfail {

	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter score:");
		i=sc.nextInt();
		if(i>=80) {
			System.out.println("Distintion");
		}
		else if(i>=40 && i<=80) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}

	}

}
