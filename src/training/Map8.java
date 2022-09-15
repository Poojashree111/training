package training;

import java.util.HashMap;
import java.util.Scanner;

public class Map8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     HashMap<Integer,String>M1=new HashMap<Integer,String>();
			M1.put(2,"black");
			M1.put(3,"Red");
			M1.put(1,"green");
			M1.put(5,"orage");
			System.out.println("Map1 elements are:"+M1);
			System.out.println("Does Hashmap contain value\'Red\':");
			if(M1.containsValue("Red")) {
				System.out.println("yes,value is present");
			}else {
				System.out.println("No,value is not present");
			}

	}

}
