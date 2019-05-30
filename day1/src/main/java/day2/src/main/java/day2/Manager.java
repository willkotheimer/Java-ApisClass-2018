package day2;

public class Manager extends Employee {

	private Employee[] underlings;
	
	//private Manager() {}
	
	public Manager(String name, double salary, Employee[] underlings) {
		super(name, salary);
		this.setUnderlings(underlings);
	}

	public Employee[] getUnderlings() {
		return underlings;
	}

	public void setUnderlings(Employee[] underlings) {
		this.underlings = underlings;
	}
}
