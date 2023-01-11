package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PreprocessingMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>myList = Arrays.asList("Yasir", "Nadeem", "Deepak", "Kumar" , "Shubham");
		
		List<Integer>newList = myList.stream()
			.map(name->name.length())
			.collect(Collectors.toList());
		
		System.out.println(newList);
		
	}

}
