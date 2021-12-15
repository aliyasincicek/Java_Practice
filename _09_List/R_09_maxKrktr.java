package _09_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings("unused")
public class R_09_maxKrktr {

	public static void main(String[] args) {
		/*Write a Java program to get a String from user as input and find the maximum occurring character in that string.(Ignore case sensitivity).
Input : Learning java is easy
Output: maximum occurring character is : a
		 * 
		 */
		    Scanner scan = new Scanner(System.in);
	        System.out.print("Lutfen bir cumle giriniz : ");
	        String cumle = scan.nextLine();
	        String arr[]=cumle.split("");
	        
	        int count=0;
	        int maxCount=0;
	        String container="";
	        for (int i = 0; i < arr.length; i++) {
	        	for (int j = 0; j < arr.length; j++) {
	        		if (arr[i].equalsIgnoreCase(arr[j])) {
	        			count++;
	        		}
	        		}
	        	if (count>maxCount) {
	        		maxCount=count;
	        		container=arr[i];
					
				} else if(count==maxCount) {
					container+=" ,"+ arr[i];
				}
	        	count=0;
	       }
	        System.out.println("maximumCounts occurring character is :" +container + "\n"+"maximumCounts " + maxCount);
	        scan.close();
}
}