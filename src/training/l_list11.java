package training;
import java.util.LinkedList;
import java.util.ListIterator;
public class l_list11 {

	public static void main(String[] args) {
		LinkedList<String>l_List=new LinkedList<String>();
		l_List.add("Red");
		l_List.add("black");
		l_List.add("blue");
		l_List.add("pink");
		l_List.add("grey");
		System.out.println("Elements:"+l_List);
		l_List.remove(2);
		System.out.println(" After removing Elements:"+l_List);

	}

}
