package training;
import java.util.Scanner;
public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of rows to print the pattern");
		int rows = sc.nextInt();
		System.out.println("**printing the pattern...**");
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				System.out.println(i +" ");
			}
			System.out.println();
		}

	}

}
