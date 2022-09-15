package training;

import java.util.LinkedList;
import java.util.ListIterator;

public class L4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>l_List=new LinkedList<String>();
		l_List.add("Red");
		l_List.add("black");
		l_List.add("blue");
		l_List.add("pink");
		ListIterator It=l_List.listIterator(l_List.size());
		System.out.println("The elements are");
		while(It.hasPrevious()) {
			System.out.println(It.previous()+"");
		}
				
}
}
