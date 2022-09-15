package training;
import java.util.TreeSet;
import java.util.*;

public class Set5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer>tn=new TreeSet<Integer>();
		TreeSet<Integer>th=new TreeSet<Integer>();
		tn.add(1);
		tn.add(2);
		tn.add(3);
		tn.add(4);
		tn.add(5);
		tn.add(6);
		tn.add(7);
		tn.add(8);
		tn.add(9);
		tn.add(0);
		th=(TreeSet)tn.headSet(7);
		Iterator iterator;
		iterator=th.iterator();
		System.out.println("Tree set data: ");
		while(iterator.hasNext()) {
			System.out.println(iterator.next()+"");
		}
		

	}

}
