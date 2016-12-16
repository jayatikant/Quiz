package staticstuff;

public class StaticNull {
	
	
	public static void main(String[] args) {
		Service service = null;
		service.print();
	}

}

class Service{
	
	public static void  print(){
		System.out.println("Printing ...");
	}
}
