package Section2;

public class State <C extends Capital, G extends Governor > implements HasCapital<C>,HasGovernor<G>,HasName{
	
	public String name;
	public C capital;
	public G governor;
	
	State(String ename,C ecapital, G egovernor) {
		name = ename;
		capital= ecapital;
		governor = egovernor;
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
		return null;
	}

	public G getGovernor() {
		// TODO Auto-generated method stub
		return governor;
	}

	public String getGovernorname() {
		// TODO Auto-generated method stub
		return name;
	}
	
	
	
	

}
