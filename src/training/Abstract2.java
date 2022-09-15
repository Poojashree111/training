package training;
abstract class Animal{
	public abstract void printSound();
	public void  displayInfo() {
		System.out.println("i am an Animal");
	}
}
class Dog extends Animal{
	public void  printSound() {
		System.out.println("Dogs Bark");
	}
}
class Cat extends Animal{
	public void  printSound() {
		System.out.println("Cat meow");
	}
}



public class Abstract2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		Cat c=new Cat();
		 d.printSound();
		 d.displayInfo();
		 c.printSound();
		 c.displayInfo();

	}

}
