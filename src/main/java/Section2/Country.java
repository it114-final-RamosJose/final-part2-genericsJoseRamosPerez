package Section2;

public class Country<C extends Capital> implements HasCapital<C>,HasName {
	
	C capital;
	String name;
	
	Country(C ecapital,String ename){
		capital =ecapital;
		name = ename;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public C getCapital() {
		// TODO Auto-generated method stub
		return capital;
	}

	public String getCapitalName() {
		// TODO Auto-generated method stub
		return name;
	}
	
}
