package datatypes;

public class FloatLogic {

	public static void main(String[] args) {
		float first = 0;
		float second = 0;

		System.out.println(first == second);

		Float firstWrapped = 10f;
		Float secondWrapped = 10f;

		System.out.println(firstWrapped == secondWrapped);

		Float firstWrappedLarge = 1111f;
		Float secondWrappedLarge = 1111f;

		System.out.println(firstWrappedLarge == secondWrappedLarge);
	}
}
