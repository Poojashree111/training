package training;

public class PrintNumber {
	public int print(int a) {
		System.out.println(a);
		return a;
	}
	public float print(float b) {
		System.out.println(b);
		return b;
	}
	public double print(double c) {
		System.out.println(c);
		return c;
	}
	public String print(String d) {
		System.out.println(d);
		return d;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintNumber a= new PrintNumber();
		PrintNumber b= new PrintNumber();
		a.print("pooja");
		a.print(9.4);
		a.print(0.22222);
		a.print(25);
		

	}

}
