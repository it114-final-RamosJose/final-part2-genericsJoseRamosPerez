package Section1;

public class MyGenericContainerClass<T> implements MyGenericContainerInterface<T>{
	private T contained;
	
	public MyGenericContainerClass(T v) {     // Create Constructor
		contained = v;
	}
	
	public T getContained(){
		return contained;
	}

}
