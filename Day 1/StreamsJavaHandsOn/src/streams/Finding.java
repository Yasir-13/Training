package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Finding {

	public static void main(String[] args) {
		List<String>myList = Arrays.asList("Yasir" , "Shubham", "Nadeem" , "Deepak" , "Kumar");
		
	Optional<String> ele = myList.stream()
				.filter(n->n.charAt(n.length()-1) == 'r')
				.findFirst();
	System.out.println(ele.get());
	}
	
}

