//Define class "Parent1" with some data.
//Define interface "Parent2" with some data.
//Derive a class "Child" from "Parent1" and "Parent2", instantiate it and call the members.
class Parent1 {
	int i = 12;
	int j = 14;
}

interface Parent2 {
	int k = 10;
	int l = 20;
}

class Child2 extends Parent1 implements Parent2 {

}

class TestParent1Parent2 {
	public static void main(String args[]) {

		Parent1 p1 = new Child2();
		System.out.println(p1.i);
		System.out.println(p1.j);

		Child2 c = new Child2();
		System.out.println(c.k);
		System.out.println(c.l);
	}
}
