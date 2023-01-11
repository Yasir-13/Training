package streams;

import java.util.Arrays;
import java.util.List;

public class Reduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>myList = Arrays.asList(10,4,3,5,20);
		
		int sum = myList.stream()
					.reduce(0, (val1,val2)->val1 + val2);
		
		System.out.println(sum);

	}

}
