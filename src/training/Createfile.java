package training;
import java.io.File;

public class Createfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fileObj =new File("example.txt");
		try {
			boolean success = fileObj.createNewFile();
			if(success) {
				System.out.println("File got created");
			}else {
				System.out.println("File got created");
			}}
			catch(Exception e) {
				System.out.println();
			}
		

	}

}
