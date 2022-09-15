package training;
class l{
	int i;
	public void printNum() {
		System.out.println(i);
	}
}
class B extends l{
	int j;
	public void printNum() {
		System.out.println(j);
	}
}

public class IntegerDatamember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B a=new B();
		a.i=5;
		a.j=7;
		a.j=a.i;
		a.printNum();

	}

}
