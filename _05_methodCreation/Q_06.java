package _05_methodCreation;

public class Q_06 {

	public static void main(String[] args) {
		/*
        Problem tanýmý :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdýran parametreli bir method yazýnýz.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */
		
		
		birkez("javacýlar çoook afilli arkadaþlar");
	}

	private static void birkez(String str) {
		String sonuc="";
		for (int i = 0; i < str.length(); i++) {
			if (!sonuc.contains(str.substring(i, i+1))) {
				sonuc+=str.substring(i, i+1);
			}
		}
		System.out.println(sonuc);
	}

}
