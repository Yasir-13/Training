package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>myArr = new ArrayList<Integer>();
		myArr.add(10);
		myArr.add(15);
		myArr.add(20);
		myArr.add(21);
		myArr.add(23);
		
		List<Integer>newList = myArr.stream()
				.filter(n->n%10==0)
				.collect(Collectors.toList());
		
		System.out.println(newList);

	}

}
