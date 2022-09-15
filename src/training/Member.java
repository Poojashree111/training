package training;
class Member1{
	String name;
	int age;
	String number;
	String address;
	int salary;
	
public void printSalary() {
		System.out.println(salary);
	}
}
class Employee extends Member1{
	String specialization;
}
class Manager extends Member1{
	String specialization;
}


public class Member {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee m=new Employee();
		m.name = "pooja";
		m.age = 23;
		m.number= "7349582561";
		m.address="poojashreeni111@gmail.com";
		m.salary = 23;
		m.specialization= "mca";
		Manager s =new Manager();
	}
}
