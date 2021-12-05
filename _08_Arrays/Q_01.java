package _08_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q_01 {

	public static void main(String[] args) {
		// kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
		// ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
		// java programi yazin
		
		@SuppressWarnings("resource")
		Scanner scan =new Scanner(System.in);
		System.out.print("arrayinizin boyutunu giriniz :");
		int arrBoyutu =scan.nextInt();
		int arr[]=new int[arrBoyutu];
		
		for (int i = 0; i <arr.length; i++) {
			System.out.println("arrayin " +(i+1) +". elemanini giriniz");
			arr[i]=scan.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("array elemanlarinin en buyuk ile en kucuk elemaninin arasinki fark :" + (arr[arr.length-1]- arr[0]));
		

	}

}
