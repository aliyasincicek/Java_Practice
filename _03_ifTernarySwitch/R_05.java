package _03_ifTernarySwitch;

import java.util.Scanner;

public class R_05 {

	public static void main(String[] args) {
		/*Bir aydaki gün sayýsýný hesaplayan bir Java programý yazýnýz.
		INPUT:
		Ay Numarasi:
		2
		Yil :
		2016
		OUTPUT :
		Subat 2016 29 Gundur.
		*/
        Scanner scan =new Scanner(System.in);
		System.out.print("bir ay no giriniz ");
		int ayNo=scan.nextInt();
		
switch (ayNo) {
case 1:	
case 3:
case 5:
case 7:
case 8:
case 10:
case 12:
	System.out.println("girdiginiz ay 31 gundur");
	break;
case 4:
case 6:
case 9:
case 11:
	System.out.println("girdiginiz ay 30 gundur");
	break;
case 2:
	if (ayNo==2) {
		System.out.println("Lutfen yil giriniz");
		int yilNo=scan.nextInt();
		if (yilNo%4==0) {
			System.out.println("girdiginiz ay 29 gundur");
		} else {
			System.out.println("girdiginiz ay 28 gundur");

		}
		
	}
break;
default: System.out.println("girdiginiz ay numarasi cok büyük");
break;
		}
scan.close();
	}

}
