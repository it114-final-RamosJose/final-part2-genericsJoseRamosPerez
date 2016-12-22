package Section1;

public class MyGenericContainerTester {
	
	public static void main(String args[]) {
	
		MyGenericContainerInterface<String> c4String = new MyGenericContainerClass<String>("ILKER");
		
		MyGenericContainerInterface<Integer> c4Integer = new MyGenericContainerClass<Integer>(1234);
		
		System.out.println("My String Container  :  " + c4String.getContained());
		System.out.println("My Integer Container :  " + c4Integer.getContained());
			
	}

}
