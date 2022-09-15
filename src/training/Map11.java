package training;

import java.util.HashMap;
import java.util.Set;

public class Map11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String>M1=new HashMap<Integer,String>();
		M1.put(2,"black");
		M1.put(3,"Red");
		M1.put(1,"green");
		M1.put(5,"orage");
		System.out.println("Map1 elements are:"+M1);
		Set set=M1.keySet();
		System.out.println(" key set view:"+set);
	}

}
