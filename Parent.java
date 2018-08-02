
//Define a parent and child class. Now explain overriding with example.
public class Parent {

	int i, j;

	void disp() {
		System.out.println("Parent Class");
	}
}

class Child extends Parent {

	int i, j;

	@Override
	void disp() {
		System.out.println("Child Class");
	}
}

class TestParent {
	public static void main(String args[]) {

		Parent p = new Child();
		p.disp(); // Overriding Parent's disp.
	}
}
