package Section2;

public class Governor implements HasName{
	
	String name;
	
	Governor(String vname){
		name= vname;
	}
	
	public String getName(){
		return name;
	}

}
