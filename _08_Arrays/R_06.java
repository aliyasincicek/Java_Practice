package _08_Arrays;

import java.util.Arrays;

public class R_06 {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts an integer array as input and prints the minimum and the maximum numbers from given array
             Input : {3,2,5,4,1,6} Output :
              min: 1 max: 6
		 */
		int arr[]={3,2,5,4,1,6};
		Arrays.sort(arr);
		System.out.println("min: "+arr[0]+ " " +"max: "+arr[arr.length-1] );

	}

}
