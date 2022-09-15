package training;
import java.util.LinkedList;
import java.util.ListIterator;

public class L9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>l_List=new LinkedList<String>();
		l_List.add("Red");
		l_List.add("black");
		l_List.add("blue");
		l_List.add("pink");
		l_List.add("grey");
		System.out.println("Before adding:"+l_List);
		LinkedList<String>lList=new LinkedList<String>();
         lList.add("poo");
         l_List.addAll(3,lList);
		
		System.out.println("After adding:"+l_List);
	}

}
