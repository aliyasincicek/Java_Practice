package _09_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Q_05 {

	public static void main(String[] args) {
		// Kullanýcýdan alacaðýnýz 6 elemanlý bir dizinin
        // sadece tek elemanlarýný ayrý diziye bir metodda atayarak
        // main de yazdýrýnýz.
		 @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
	        int arr[] = new int[6];

	        for (int i = 0; i < 6; i++) {
	            System.out.print("sayi giriniz : ");
	            arr[i] = scan.nextInt();				
	}
	        tekEleman(arr);
	        System.out.println(tekEleman(arr));
	}

	private static ArrayList<Integer> tekEleman(int[] arr) {
	
		ArrayList<Integer>list=new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==1) {
				list.add(arr[i]);
			}
				
		}
		
		return list;
		
		
	}

}
