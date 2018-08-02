
//Program for Single Level Inheritance
public class SingleLevelInheritance {

	SingleLevelInheritance(int a) {
		System.out.println("Hye Single");
	}
}

class A extends SingleLevelInheritance {

	A() {
		super(5);
		System.out.println("Hello A");
	}
}

class Test {

	public static void main(String args[]) {

		SingleLevelInheritance si = new A();
	}
}
