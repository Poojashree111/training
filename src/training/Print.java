package training;

public class Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print obj = new Print();
		obj.Printn(10,'A');
		obj.Printn('B',5);

	}

	void Printn(int a,char c) {
	 System.out.println("integer is:"+a+ "\t char is:"+c);
	}
	void Printn(char c,int a) {
		System.out.println("char is:"+c+ "\tinteger is:"+a);
		
	}

}

