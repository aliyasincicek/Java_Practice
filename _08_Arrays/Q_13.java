package _08_Arrays;

import java.util.Scanner;

public class Q_13 {

	public static void main(String[] args) {
		  // Kullanicidan aldigimiz 8 elemanli arrayin icinde
        // kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
		
		int arr[]=new int[8];
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		
		
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i+". indeksteki sayiyi giriniz ");
			arr[i]=scan.nextInt();
		}
		int depo=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%3==0) {
				depo++;
			}
		}
		System.out.println("Girdiginiz sayilar icinde " +depo+ " tane sayi 3'e bolunebilmektedir.");


	}

}
