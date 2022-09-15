package training;

import java.util.HashSet;

public class Hsetclone7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String>hs=new HashSet<String>();
		hs.add("black");
		hs.add("Red1");
		hs.add("green");
		hs.add("102");
		System.out.println("HashSet:"+hs);
		HashSet<String>cs=new HashSet<String>();
		cs=(HashSet)hs.clone();
		System.out.println("the new clone set elements:"+cs);
	}

}
