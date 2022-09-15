package training;

import java.util.HashSet;

public class Hset8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String>hs=new HashSet<String>();
		hs.add("black");
		hs.add("Red");
		hs.add("green");
		hs.add("orage");
		System.out.println("first HashSet content:"+hs);
		HashSet<String>hs1=new HashSet<String>();
		hs1.add("White");
		hs1.add("pink");
		hs1.add("black");
		hs1.add("Red");
		System.out.println("Second HashSet content:"+hs1);
		hs.retainAll(hs1);
		System.out.println("Hashset content:");
		System.out.println(hs);

	}

}
