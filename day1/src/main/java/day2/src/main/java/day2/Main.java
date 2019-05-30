package day2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p = new Person("Will");
		System.out.println(p.getName());
		Employee e = new Employee("John", 10000);
		Employee f = new Employee("John", 10000);
		
		System.out.println(e.equals(f));
		System.out.println(e);
		
		MallardDuck d= new MallardDuck();
		d.quack();
		d.fly();
		
	}

}
