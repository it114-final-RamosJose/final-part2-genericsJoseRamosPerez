package Section1;


import java.util.Collection;


public class MyGenericStaticMethodUtility <T> {
	
	public static <T> T add2collection(T _cv, Collection<T> _collection) {
		_collection.add(_cv);
		return _cv;
	}

}


