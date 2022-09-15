package training;
import java.util.LinkedList;
import java.util.ListIterator;

public class L5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>l_List=new LinkedList<String>();
		l_List.add("Red");
		l_List.add("black");
		l_List.add("blue");
		l_List.add("pink");
		l_List.add(1,"grey");
		ListIterator It=l_List.listIterator();
		System.out.println("The elements are");
		while(It.hasNext()) {
			System.out.println(It.next()+"");
		}
				

	}

}
