package training;

import java.util.PriorityQueue;

public class Queue3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String>q=new PriorityQueue<String>();
		q.add("black");
		q.add("Red");
		q.add("green");
		q.add("orage");
		System.out.println("Queur elements are:"+q);
		q.offer("blue");
		System.out.println("Size of Queue Elements are:"+q.size());

	}

}
