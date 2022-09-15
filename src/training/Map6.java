package training;

import java.util.HashMap;

public class Map6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String>M1=new HashMap<Integer,String>();
		M1.put(2,"black");
		M1.put(3,"Red");
		M1.put(1,"green");
		M1.put(5,"orage");
		System.out.println("Map1 elements are:"+M1);
		HashMap<Integer,String>M2=new HashMap<Integer,String>();
		M2=(HashMap)M1.clone();
		System.out.println("Shallow copy of the element of map1:"+M1);

	}

}
