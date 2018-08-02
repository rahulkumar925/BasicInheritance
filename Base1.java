//Define a class "base1" with only parameterized constructor.
//Derive a class "sub1" from "base1". This class should have following constructors
//a) Default
//b) one parameter
//c) two parameter
//Now try to instantiate "sub1" , using any of the above mentioned constructors.

public class Base1 {

	int i;

	Base1(int i) {
		System.out.println("Base1 Constructor.");
	}

}

class Sub1 extends Base1 {
	Sub1() {
		super(10);
		System.out.println("Default Constructor.");
	}

	Sub1(int i) {
		super(15);
		System.out.println("One Parameter Constructor.");
	}

	Sub1(int i, int j) {
		super(8);
		System.out.println("Two Parameters Constructor.");
	}
}

//Test Class

class TestBase1 {

	public static void main(String args[]) {

		Sub1 s1 = new Sub1();
		Sub1 s2 = new Sub1(8);
		Sub1 s3 = new Sub1(8, 9);

	}
}
