package training;

import java.util.TreeSet;
import java.util.Iterator;

public class Set3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String>ts=new TreeSet<String>();
		ts.add("black");
		ts.add("Red");
		ts.add("green");
		System.out.println("original tree: "+ts);
		Iterator it=ts.descendingIterator();
		System.out.println("Elements in Reverse order:");
		while(it.hasNext()) {
		System.out.println(it.next());

	}

}
}
