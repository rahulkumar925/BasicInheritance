// Program for invoking two classes using third.

class First {

	int i;
	int j;

	First() {
		System.out.println("Hello First");
	}

	First(int i, int j) {
		this.i = i;
		this.j = j;
	}

	public void display() {
		System.out.println("I am in First Class");
		System.out.println("First i: " + i + " First j: " + j);
	}
}

class Second {
	int i;
	int j;

	Second() {
		System.out.println("Hello Second");
	}

	Second(int i, int j) {
		this.i = i;
		this.j = j;
	}

	public void display() {
		System.out.println("I am in Second Class");
		System.out.println("Second i: " + i + " Second j: " + j);
	}
}

class Two {
	public static void main(String args[]) {

		First first = new First();

		Second second = new Second();

		First first2 = new First(12, 13);
		first2.display();

		Second second2 = new Second(10, 9);
		second2.display();
	}
}
