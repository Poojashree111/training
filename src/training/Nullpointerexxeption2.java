package training;

public class Nullpointerexxeption2 {
	private static void printLength(String str) {
		System.out.println(str.length());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myString=null;
		printLength(myString);

	}

}
