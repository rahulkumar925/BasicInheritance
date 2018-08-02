/*Define a parent class with one function. Define child class with the function
having same name as of parent class function, but having different argument.
Create an instance of child class and call the functions. Make sure u have
followed the concept of “function overloading “ in inheritance.*/
public class ParentOver {

	int add(int a, int b) {

		return a + b;
	}

}

class ChildOver extends ParentOver {

	double add(double a, double b) {

		return a + b;
	}
}

class TestOverloading {

	public static void main(String args[]) {
		ChildOver po = new ChildOver();

		double result = po.add(8.80, 7.68);
		System.out.println("Result: " + result);

		int result2 = po.add(4, 6);
		System.out.println("Result: " + result2);

	}
}
