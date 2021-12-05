package _08_Arrays;

import java.util.Arrays;

@SuppressWarnings("unused")
public class Q_07 {

	public static void main(String[] args) {
		/*
         * write a method that accepts a 2 dimensional array and finds the max value
         * (2 boyutlu bir diziyi kabul eden ve maksimum degeri bulan bir method yazin )
         * Input : {{1,2,-3},{41,55},{-61,-17,80}}
         * Output : 8
         */
		
		int arr[][]={{1,2,-3},{41,55},{-61,-17,80}};
		
		
		System.out.println(maksimum(arr));
		}

	private static int maksimum(int[][] arr) {
		int max= arr[0][0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (max<arr[i][j]) {
					max=arr[i][j];
				}
				
			}
			
		}
		return max;
		
	}
		
	}


