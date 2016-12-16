package override;

class Base {
	public void print() {
		System.out.println("base");
	}
}

class Extension extends Base {
	public void print() {
		System.out.println("extension");
		// Insert a line of code here.
	}
}

public class OverrideLogic {
	public static void main(String[] args) {
		Extension ext = new Extension();
		ext.print();
	}
}
