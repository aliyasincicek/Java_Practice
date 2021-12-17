package _11_Varargs;

public class R_01 {

	public static void main(String[] args) {
		/*
		 * Write a return method that accepts more than one integer as parameter and prints the sum of integers 
		 * Method name = sum if you call method like that sum(1,2,3) output =6 sum(1,2,3,4,5) output =15 sum(1,2) output=3
		 */
		
	sumMethod(100,200,300,400);

	}

	private static void sumMethod(int... numbers) {
		int total=0;
		for (int i : numbers) {
			total+=i;
			
		}
		System.out.println(total);
	}

}
