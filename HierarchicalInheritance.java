// Program for Hierarchical Inheritance
public class HierarchicalInheritance {

	HierarchicalInheritance() {

		System.out.println("I am in Hierarchical Inheritance.");
	}
}

class One extends HierarchicalInheritance {
	One() {

		System.out.println("I am in One");
	}
}

class One2 extends HierarchicalInheritance {

	One2() {

		System.out.println("I am in One2");
	}
}

class One3 extends HierarchicalInheritance {
	One3() {

		System.out.println("I am in One3");
	}
}

class TestHierarchical {

	public static void main(String args[]) {

		HierarchicalInheritance hlh = new One();
		HierarchicalInheritance hlh2 = new One2();
		HierarchicalInheritance hlh3 = new One3();
	}
}
