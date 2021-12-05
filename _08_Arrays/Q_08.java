package _08_Arrays;

public class Q_08 {

	public static void main(String[] args) {
		/*   $ ve  £  isareti olanlarin toplamlarini ayri ayri bulun
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */
		 String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
		 String arr[]=str.split(" ");
		 
		 int topDolar=0;
		 int topsterlin=0;
		 for (int i = 0; i < arr.length; i++) {
			 if (arr[i].contains("$")) {
				 topDolar+=Integer.parseInt(arr[i].replace("$", ""));
				
			} else {
				 topsterlin+=Integer.parseInt(arr[i].replace("£", ""));

			}
			
		}
		 System.out.println("toplam dolar miktari :"+ topDolar);
		 System.out.println("toplam sterlin miktari :"+ topsterlin);
	}

}
