package _13_dateProject;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Registration {

	
		
		List<User> kisiler=new ArrayList<>();
		
		public List<User> register() {
			Scanner scan = new Scanner(System.in);
	        System.out.print("adinizi giriniz : ");
	        String name = scan.nextLine();
	        
	        User user=new User(name, LocalDateTime.now());
	        kisiler.add(user);
			return kisiler;
			
		}
		public void printHappyUsers(List<User> kull) {
			for (User each : kull) {
				if (each.register.getSecond()<10) {
					System.out.println("kazandin cok SANSLÝSÝN"+each.name);
					
				} else { System.out.println("maalesef kazanamadin " + each.name);

				}
				
			}
			
		}

	

}
