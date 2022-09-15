package training;

import java.util.*;

public class Map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String>M=new HashMap<Integer,String>();
		M.put(2,"black");
		M.put(3,"Red");
		M.put(1,"green");
		M.put(5,"orage");
		for(Map.Entry x:M.entrySet()) {
		System.out.println(x.getKey()+" "+x.getValue());

	}

}
}
