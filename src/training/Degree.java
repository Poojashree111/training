package training;

class Degree1{
	public void getDegree1() {
		System.out.println("i got a degree");
	}
}
class undergraduate extends Degree1{
	public void getDegree1() {
		System.out.println("i am a undergraduate");
	}
}
class Postgraduate extends Degree1{
	public void getDegree1() {
		System.out.println("i am a Postgraduate");
	}
}


public class Degree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		undergraduate a =new undergraduate();
		Postgraduate b = new Postgraduate();
		a.getDegree1();
		b.getDegree1();
		

	}

}
