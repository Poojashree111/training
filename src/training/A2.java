package training;
import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] ,sum=0,prod=1,num;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number of array elements:");
		num=s.nextInt();
		a=new int[num];
		System.out.println("enter the array elements:");
		
		for(int i=0;i<num ;i++) {
			System.out.println("enter the"+(i+1)+" element:");
			a[i]=s.nextInt();
		}
		for(int i=0;i<num ;i++) {
			sum=sum+a[i];
			prod=prod*a[i];
		}
System.out.println("sum of array elements is:"+sum);
System.out.println("prod of array elements is:"+prod);

	}

}
