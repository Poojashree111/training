package training;

class Sha {
	public void print_shape() {
		System.out.println("this is shape");
	}
}
class Rect extends Sha{
	public void print_rect() {
		System.out.println("this is Square shape");
	}	
}
class Cricle extends Sha{
	public void print_circle() {
		System.out.println("this is circle shape");
	}	
}
class Squa extends Rect {
	public void print_Square() {
		System.out.println("this is Square shape");
	}
	
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Squa sq = new Squa();
		sq.print_shape();
		sq.print_rect();

	}

}
