package day2;

public class Employee extends Person {

	private double salary;
	
	public Employee(String name, double salary) {
		// TODO Auto-generated constructor stub
		super(name);
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee - " +super.getName()+": "+salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}

	public double getSalary() {
		return salary;
	}

	

}
