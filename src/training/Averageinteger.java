package training;

import java.util.Scanner;


public class Averageinteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		float sum=0;
		Scanner sc =new Scanner(System.in);
	     System.out.print("enter the size of array:");
	     int n=sc.nextInt();
	     float arr[] = new float[n];
	     System.out.print("enter"+n+" array elements:");
	     while(i<n) {
	    	 arr[i]	=sc.nextInt();
	    	 sum=sum+arr[i];
	    	 i++;
	     }
	     float average = sum/n;
	     System.out.print("Average of number is:"+average);
	     

	}

}
