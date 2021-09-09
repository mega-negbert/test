package unl.cse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArraysAndCollections {

	public static void main(String[] args) {

//		int primes[] = {2,3,5,7,11,13,17,19};
//		
//		//creating array with 100 integers
//		int numbers[] = new int[100];
//		
//		numbers[0] = 42;
//		numbers[99] = -3;
//		
//		for(int i = 0; i < numbers.length; i++) {
//			numbers[i] = i * 10;
//		}
//		
//		//System.out.println(Arrays.toString(numbers));
//		
//		List<Integer> nums = new ArrayList<Integer>();
//		
//		nums.add(10);
//		nums.add(20);
//		nums.add(30);
//		nums.add(0, 42);
//		
//		System.out.println(nums);
//		
//		nums.remove(3);
//		System.out.println(nums);
//		
//		int x = nums.get(0);
//		
//		nums.clear();
//		System.out.println(nums);
//		
		
		Map<Integer, String> m = new HashMap<>();
		//key (int) -> value (String);
		m.put(10, "Connor");
		m.put(20, "Alan");
		m.put(30, "Anita");
		
		String s = m.get(20);
		System.out.println(s);
		
		
	}

}
