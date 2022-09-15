package training;
class Modifier{
	protected String fname="pooja";
	protected String lname="shree";
	protected String mail="poojashree111@gmail.com";
	protected int age= 23;
}
class Protected extends Modifier{
	private String place="Mysuru";
    
	public static void main(String[] args) {
		Protected myObj =new Protected();
		System.out.println("name:"+myObj.fname+""+myObj.lname);
		System.out.println("mail:"+myObj.mail);
		System.out.println("age:"+myObj.age);
		System.out.println("place:"+myObj.place);

	}

}
