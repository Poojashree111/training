package training;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedlist3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>l_List=new LinkedList<String>();
		l_List.add("Red");
		l_List.add("black");
		l_List.add("blue");
		l_List.add("pink");
		ListIterator itr=l_List.listIterator(3);
	 System.out.println("l_list are:");	
		while(itr.hasNext()) {
			System.out.println(itr.next()+"");
		}

	}

}
