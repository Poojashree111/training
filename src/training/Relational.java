package training;
import java.util.Scanner;

public class Relational {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the a:");
		a=sc.nextInt();
		System.out.println("enter the b:");
		b=sc.nextInt();
		System.out.println("enter the c:");
		c=sc.nextInt();
		System.out.println("a==b:"+(a==b));
		System.out.println("a==c:"+(a==c));
		System.out.println("a!=b:"+(a!=b));
		System.out.println("a!=c:"+(a!=c));

	}

}
