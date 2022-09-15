package training;
import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		int n1,n2,sum=0,sub=0,mul=0,div=0,mod;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number:");
		n1=sc.nextInt();
		System.out.println("enter the secand number:");
		n2=sc.nextInt();
		sum=n1+n2;
		System.out.println("The sum="+sum);
		sub=n1-n2;
		System.out.println("The sub="+sub);
		mul=n1*n2;
		System.out.println("multiplication="+mul);
		div=n1/n2;
		System.out.println("division="+div);
		mod=n1%n2;
		System.out.println("remainder="+mod);

	}

}
