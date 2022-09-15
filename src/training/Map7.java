package training;

import java.util.HashMap;
import java.util.Scanner;

public class Map7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	     System.out.print("enter a number:");
	     int i=s.nextInt();
		HashMap<Integer,String>M1=new HashMap<Integer,String>();
		M1.put(2,"black");
		M1.put(3,"Red");
		M1.put(1,"green");
		M1.put(5,"orage");
		System.out.println("Map1 elements are:"+M1);
		System.out.println("Does Hashmap contain key1:");
		if(M1.containsKey(i)) {
			System.out.println("yes,key is present");
		}else {
			System.out.println("No,key is not present");
		}
		
	}

}
