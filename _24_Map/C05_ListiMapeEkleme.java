package _24_Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class C05_ListiMapeEkleme {
	 public static void main(String[] args) {
		 HashMap<String, List<String>> hsmp = new HashMap<>();
		    
		 List<String> meyveler = new ArrayList<>(
		      Arrays.asList("Elma", "Armut", "Çilek")
		    );
		    List<String> sebzeler = new ArrayList<>(
		      Arrays.asList("Kabak", "Patlýcan", "Marul", "Ispanak")
		    );
		    List<String> vitaminler = new ArrayList<>(
		      Arrays.asList("A", "B", "C", "D")
		    );
		    hsmp.put("Meyveler", meyveler);
		    hsmp.put("Sebzeler", sebzeler);
		    hsmp.put("Vitaminler", vitaminler);

		    System.out.println(hsmp.get("Sebzeler").get(1));
		 
	 }
}
