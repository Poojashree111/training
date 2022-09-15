package training;

import java.util.Scanner;

public class Threeinput {

	public static void main(String[] args) {
		int x,y,z;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the first user input:");
		x = sc.nextInt();
		System.out.println("enter the 2nd user input:");
		y = sc.nextInt();
		System.out.println("enter the threed user input:");
		z = sc.nextInt();
		if(x<y && x<z)
		{
			System.out.println("first user input is small:"+x);
		}
		else  if (y<z){
			System.out.println("2st user input is small:"+y);
		}
		else {
			System.out.println("3st user input is small:"+z);
			
		}

	}

}
