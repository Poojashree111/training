package training;
class Student
{
	String name,address;
	int age;
	Student()
	{
		name="unknown";
		age=0;
		address="not avialable";
	}
	public void setInfo(String a,int b) {
		name=a;
		age=b;
	}
	public void setInfo(String a,int b,String c) {
		name=a;
		age=b;
		address=c;
		System.out.println(name+" "+age+" "+address);
	}
}

public class Studentdetals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] s=new Student[10];
		s[0]=new Student();
		s[0].setInfo("pooja", 23,"Mysuru");
		s[1]=new Student();
		s[1].setInfo("joo",23,"banglore");
	}

}
 