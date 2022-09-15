package training;

public class Parentcalss {
	public void pmethod() {
		System.out.println("this is parent class");
	}
}
class Cclass extends Parentcalss{
	public void cmethod() {
		System.out.println("this is child class");
	}
}
class A{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parentcalss m=new Parentcalss();
		Cclass n=new Cclass();
		m.pmethod();
	    n.cmethod();
	    n.pmethod();

	}

}
