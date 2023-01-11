package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>myList = Arrays.asList(10,4,3,20,41,1);
		
		List<Integer>sortedList = myList.stream()
			.sorted()
			.limit(3)
			.collect(Collectors.toList());
		
		System.out.println(sortedList);

	}

}
