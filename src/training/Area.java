package training;
class Ar
{
	public void ar(int a) {
		System.out.println("area of square="+(a*a));
	}
	public void ar(int a,int b) {
		System.out.println("area of rectangle="+(a*b));
	}
}

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ar a=new Ar();
		a.ar(2,3);
		a.ar(2);
	}


	}


