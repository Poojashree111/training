package training;
import java.util.LinkedList;
import java.util.ListIterator;
public class L8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>l_List=new LinkedList<String>();
		l_List.add("Red");
		l_List.add("black");
		l_List.add("blue");
		l_List.add("pink");
		l_List.add("grey");
		System.out.println("Before adding:"+l_List);
		l_List.addLast("p");
		
		System.out.println("After adding:"+l_List);

	}

}
