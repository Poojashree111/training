package training;
import java.util.LinkedList;
import java.util.ListIterator;

public class L10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>l_List=new LinkedList<String>();
		l_List.add("Red");
		l_List.add("black");
		l_List.add("blue");
		l_List.add("pink");
		l_List.add("grey");
		System.out.println("Elements:"+l_List);
		Object fele=l_List.getFirst();
		Object lele=l_List.getLast();
		System.out.println("first ele:" +fele);
		System.out.println("last ele:" +lele);
		

	}

}
