package training;

import java.io.FileWriter;

public class Write {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter myWriter =  new FileWriter("example.txt");
			myWriter.write("Hello!!");
			myWriter.write("Welcome  the java course of CodesDope.");
			myWriter.close();
		}
		catch(Exception e) {
			System.out.println(e);
			}

	}

}
