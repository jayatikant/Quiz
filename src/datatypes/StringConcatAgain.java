package datatypes;

public class StringConcatAgain {
	public static void main(String[] args) {
		String space = " ";
		String composite = space + "hello" + space + space;
		composite.concat("world");
		String trimmed = composite.trim();
		System.out.println(trimmed.length());
	}
}
