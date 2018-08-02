//Create a class "Top1" with "disp1()" method.
//From this class Derive "Bottom1", "Bottom2" and "Bottom3" classes ,override the "disp1()".
//Now show how will u achieve dynamic polymorphism.

public class Top1 {
	
    void disp1() {
		System.out.println("I am in Top1 Class.");
	}
}

class Bottom1 extends Top1 {

	void disp1() {
		System.out.println("I am in Bottom1 Class.");
	}
}

class Bottom2 extends Top1 {
	void disp1() {
		System.out.println("I am in Bottom2 Class.");
	}
}

class Bottom3 extends Top1 {
	void disp1() {
		System.out.println("I am in Bottom3 Class.");
	}
}

//Test Class.
class TestTop {
	public static void main(String args[]) {

		Top1 t1 = new Bottom3();
		t1.disp1(); // Run the disp1 of Bottom3 Class, overrides Top1's.
		
		t1 = new Bottom2();
		t1.disp1(); // Run the disp1 of Bottom2 Class, overrides Top1's.
		
		t1 = new Bottom1();
		t1.disp1(); // Run the disp1 of Bottom1 Class, overrides Top1's.

	}
}