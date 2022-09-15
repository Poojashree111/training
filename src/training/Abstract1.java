package training;
abstract class Parent{
	void message() {}
	}
	class Subclass1 extends Parent{
		void message() {
			System.out.println("this is First Subclass");
		}
	}
	class Subclass2 extends Parent{
		void message() {
			System.out.println("this is Second Subclass");
		}
	
	}

public class Abstract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subclass1 sb1=new Subclass1();
		Subclass2 sb2=new Subclass2();
		

	}

}



