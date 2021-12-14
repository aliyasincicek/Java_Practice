package _09_List;

import java.util.Scanner;

public class Q_09 {

	public static void main(String[] args) {
		 /*  Write a Java program to get a String from user as input and find the maximumCounts occurring character in that string.
        (Ignore case sensitivity)
        Kullanicidan aldiginiz bir string icinde en cok tekrar eden karakteri yazdiriniz
      input : Learning java is easy
      output: maximumCounts occurring character is : a
       */
		    @SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
	        System.out.println("bir metin giriniz : ");
	        String str = scan.nextLine();//hayat coooook bayat
	        String arr[] = str.split("");//str yi "" hiclige gore parcalayip her bir parcayi arr yin bir elemani yapti
	        
	        int count=0;
	        int maxCount=0;
	        String ect="";
	        for (int i = 0; i < arr.length; i++) {
	        	for (int j = 0; j < arr.length; j++) {
	        		if (arr[i].equalsIgnoreCase(arr[j])) {
	        			count++;
					}
					
				}
	        	if (count>maxCount) {
	        		maxCount=count;
	        		ect=arr[i];
					
				} else if(count==maxCount) {
					ect+=" ,"+ arr[i];
				}
	        	count=0;
			}

   System.out.println("maximumCounts occurring character is :" +ect + "\n"+"maximumCounts " + maxCount);
	}

}
