package training;
import java.util.Scanner;
public class Evenorodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner reader = new Scanner(System.in);
     System.out.print("enter a number:");
     int n=reader.nextInt();
     if(n%2==0)
    	 System.out.print(n +"is even");
     else
    	 System.out.print(n +"is odd");
    	 
	}

}
