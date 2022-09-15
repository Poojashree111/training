package training;
import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]array=new int[10];
		int a;
		Scanner s=new Scanner(System.in);
		System.out.println("enter 10 number");
		for(int i=0;i<10;i++)
		{
			array[i]=s.nextInt();
		}
		System.out.println("enter a number");
		a=s.nextInt();
		for(int i=0;i<10;i++) {
			if(array[i]==a) {
				System.out.println("present");
				System.exit(0);
			}
		}
		System.out.println("not present");

	}

}

