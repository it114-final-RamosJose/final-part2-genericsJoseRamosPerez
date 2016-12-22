package Section2;

public class CountryTester {
	public static void main(String ARGS[]){
		
		Country<Capital> us = new Country<Capital>(new Capital("Washington DC"), "USA");
		Country<Capital> turkey = new Country<Capital>(new Capital("Ankara"), "Turkey");	
		
		System.out.println("Country " +us.getName() + "  Has Capital :" + us.getCapitalName());
		System.out.println("Country " + turkey.getName() + "  Has Capital :" + turkey.getCapitalName());
		 
	}
}
