package training;

import java.util.HashMap;

public class Map5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String>M2=new HashMap<Integer,String>();
		M2.put(4,"black");
		M2.put(9,"Red");
		M2.put(7,"green");
		M2.put(0,"orage");
		boolean result=M2.isEmpty();
		System.out.println("Map elements are:"+M2);
		M2.clear();
		result=M2.isEmpty();
		System.out.println("Map Elements are:"+M2);
	

	}

}
