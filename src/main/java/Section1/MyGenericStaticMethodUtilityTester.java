package Section1;
import java.util.ArrayList;
import java.util.List;

public class MyGenericStaticMethodUtilityTester <T> {
	
	public static void main(String args[]){
		
		String s1 ="element1";
		List<String> strings = new ArrayList<String>();
		String s = MyGenericStaticMethodUtility.add2collection(s1,  strings);
		System.out.println("added String " + s1 + ", now strings.size():" + strings.size());;
		
		Integer i1 =123;
		List<Integer> integers =new ArrayList<Integer>();
		Integer i = MyGenericStaticMethodUtility.add2collection(i1, integers);
		System.out.println("added Integeer " + i +",nowintegers.size():" + integers.size());
	
	}

}
