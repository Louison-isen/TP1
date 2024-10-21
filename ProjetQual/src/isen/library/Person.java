package isen.library;

public class Person {
	private String name;
	private int years;
	
	public Person() {
		this.name = "unknown";
		this.years = 22;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setYears(int years) {
		this.years = years;
	}
	public int getYears() {
		return years;
	}
}
