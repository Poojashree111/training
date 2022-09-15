package training;

import java.util.HashMap;

public class Map3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String>M1=new HashMap<Integer,String>();
		M1.put(2,"black");
		M1.put(3,"Red");
		M1.put(1,"green");
		M1.put(5,"orage");
		System.out.println("Map1 elements are:"+M1);
		HashMap<Integer,String>M2=new HashMap<Integer,String>();
		M2.put(4,"black");
		M2.put(9,"Red");
		M2.put(7,"green");
		M2.put(0,"orage");
		System.out.println("Map2 elements are:"+M2);
		M2.putAll(M1);
		System.out.println("now the Map2 Elements are:"+M2);
	

	}

}
