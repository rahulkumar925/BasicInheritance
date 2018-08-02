//program for multilevel inheritance.

public class MultiLevelInheritance {

	MultiLevelInheritance() {

		System.out.println("I am in MLH.");
	}
}

class D extends MultiLevelInheritance {
	D() {

		System.out.println("I am in D.");
	}
}

class B extends D {

	B() {

		System.out.println("I am in B");
	}
}

class C extends B {
	C() {

		System.out.println("I am in C");
	}
}

class TestMulti {

	public static void main(String args[]) {

		MultiLevelInheritance mlh = new C();
		MultiLevelInheritance mlh2 = new B();
	}
}