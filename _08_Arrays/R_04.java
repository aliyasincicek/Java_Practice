package _08_Arrays;

import java.util.Arrays;

public class R_04 {

	public static void main(String[] args) {
		/*
		 Create a custom return type method accepts a name as parameter and prints the name as a char array. (do not use toCharArray() method)
		 Input : John  Output :[J, o, h, n]
		 */
		String x="John";
		String y[]=x.split("");
		System.out.println(Arrays.toString(y));

	}

}
