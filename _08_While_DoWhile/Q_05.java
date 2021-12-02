package _07_While_DoWhile;

import java.util.Scanner;

public class Q_05 {

	public static void main(String[] args) {
		/*
		 * sayinin basamak degerlerinin toplamini while loop ile yapin bir method create ediniz.
		 */
		
		Scanner scan = new Scanner(System.in);
        System.out.println("bir tam sayý giriniz");
        int x=scan.nextInt();
        int rakam=0;
        int rakamlarToplami=0;
        scan.close();
        while (x>0) {
        	rakam=x%10;
        	rakamlarToplami+=rakam;
        	x/=10;	
		}
System.out.println("Giridiginiz sayinin basamak degerlerinin toplami :" +rakamlarToplami);
	}

}
