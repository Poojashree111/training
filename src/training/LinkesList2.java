package training;

import java.util.*;


public class LinkesList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>l_List=new LinkedList<String>();
		l_List.add("Red");
		l_List.add("black");
		l_List.add("blue");
		l_List.add("pink");
		Iterator itr=l_List.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
