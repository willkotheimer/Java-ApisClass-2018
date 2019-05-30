package day1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"bob","bill"};
			int[] nums = {1,2,3};
			
			//enhanced for loop
			for (String name:names ) {
				System.out.println(name);
			}
			
			System.out.println(add(1,2,3,4,5,6));
			String[] words = {"Bob","William","Rachel"};
			System.out.println(countVowels(words));
			
			
			Car car = new Car("red");
			
			car.drive(5);
			System.out.println(car.getMiles());
			
	}
	
	public static int add (int x, int y) {
		return x+y;
	}
	
	public static int add (int ...nums) {
		int sum = 0;
		for (int num : nums) {
			sum+=num;
		}
		return sum;
	}
	
	public static int countVowels(String[] Stringarr) {
		
		int numVowels=0;
		
		
		for(String str : Stringarr) {
			for(char c : str.toCharArray()) {
				if (c=='a') {
					numVowels++;
				}
				if (c=='e') {
					numVowels++;
				}
				if (c=='i') {
					numVowels++;
				}
				if (c=='o') {
					numVowels++;
				}
				if (c=='u') {
					numVowels++;
				}
			}
			
		}
		
		return numVowels;
	}
	
	

}
