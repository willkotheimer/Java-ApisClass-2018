package day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//package day3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Box<Integer> b= new Box<>(new String("quinton"));

		List<Integer> numbers = new ArrayList<Integer>();

		for (int i = 0; i <= 10; i++) {
			numbers.add(i);
		}

		for (int num : numbers) {
			System.out.println(numbers.get(num));
		}

		String[] names = { "bob", "bill", "sally", "bill" };

		Map<String,List<String>> map = new HashMap<>();
		String w = "Will";
		String p = "Peter";
		map.put("Quinton", Arrays.asList(new String[] {w,p}));
		String name = "Quinton";
		System.out.println("Here"+map.get(name));
		
		
		List<String> setOfNames = new ArrayList<>();
		setOfNames.addAll(Arrays.asList(names));

		Collections.sort(setOfNames);
		

		Map<String, Integer> map1 = new HashMap<>();
		map1.put("Quinton", 24);
		map1.put("Will", 24);

		System.out.println(map1.get("Quinton"));
		
		

	}

}
