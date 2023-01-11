package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Join {

	public static void main(String[] args) {
		List<String>myList = Arrays.asList("Messi" , "is" , "the", "GOAT");
		
		String joinedStr = myList.stream()
							.collect(Collectors.joining(" "));
		
		System.out.println(joinedStr);
		
	}
}
