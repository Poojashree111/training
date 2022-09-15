package training;

import java.util.PriorityQueue;

public class Queue2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String>q=new PriorityQueue<String>();
		q.add("black");
		q.add("Red");
		q.add("green");
		q.add("orage");
		System.out.println("original Priority Queur:"+q);
		q.offer("blue");
		System.out.println("The new Priority Queue:"+q);

	}

}
