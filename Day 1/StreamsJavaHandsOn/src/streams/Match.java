package streams;

import java.util.Arrays;
import java.util.List;

public class Match {

	public static void main(String[] args) {
		List<String>myList = Arrays.asList("Cat" , "Bat" , "Rat" , "Mat" , "Dog");
		
		boolean check = myList.stream()
						.allMatch(n -> n.contains("at"));
						
		boolean checkAgain = myList.stream()
							 .anyMatch(n->n.contains("at"));
		
		
		System.out.println(check);
		System.out.println(checkAgain);

	}

}
