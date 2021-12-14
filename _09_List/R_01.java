package _09_List;

public class R_01 {

	public static void main(String[] args) {
		/*Write a Java program to get a String from user as input and find the maximum occurring character in that string. (Ignore case sensitivity)
		input : Learning java is easy
		output:maximum occurring character is : a
        */
		String st="Learning java is easy";
		String arr[]=st.split("");
		int count=0;
		int maxCount=0;
		String str="";
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].equalsIgnoreCase(arr[j])) {	
					count++;
				}
			}
			if (count>maxCount) {
			    maxCount=count;
			    str=arr[i];
			
		}
		count=0;
		
	}System.out.println("maximumCounts occurring character is :" +str );
}
}