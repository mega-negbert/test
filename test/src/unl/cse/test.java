package unl.cse;


public class test {
	public static void main(String args[]) {
		
		int primes[] = {2,3,5,7,11,13,17,19};
		
		
		//traditional way to iterate over an array
		for (int i = 0; i < primes.length; i++) {
			System.out.println(primes[i]);
		}
		
		/*
		 * enhanced for loop
		 * read: for each integer (x) in the array 'primes'
		 *       print said integer (x).
		 */
		for (int x: primes) {
			System.out.println(x);
		}
		
	}

}
