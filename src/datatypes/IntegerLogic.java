package datatypes;

public class IntegerLogic {

	public static void main(String[] args) {
		int first =0;
		int second = 0;
		
		System.out.println(first == second);
		
		Integer firstWrapped = 10;
		Integer secondWrapped = 10;
		
		System.out.println(firstWrapped == secondWrapped);
		//-127 to 128
		Integer firstWrappedLarge = 1111;
		Integer secondWrappedLarge= 1111;
		
		System.out.println(firstWrappedLarge == secondWrappedLarge);
	}
}
