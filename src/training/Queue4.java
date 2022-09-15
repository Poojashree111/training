package training;

import java.util.PriorityQueue;

public class Queue4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String>q=new PriorityQueue<String>();
		q.add("black");
		q.add("Red");
		q.add("green");
		q.add("orage");
		System.out.println(" first Queur elements are:"+q);
		PriorityQueue<String>q2=new PriorityQueue<String>();
		q2.add("black");
		q2.add("white");
		q2.add("blue");
		q2.add("orage");
		System.out.println("secand Queur elements are:"+q);
		q.retainAll(q2);
		System.out.println("Queue countent:"+q);

	}

}
