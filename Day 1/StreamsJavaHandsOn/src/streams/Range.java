package streams;

import java.util.stream.IntStream;


public class Range {

	public static void main(String[] args) {
		
		IntStream range = IntStream.range(100 , 111);
		
		range.forEach(ele -> System.out.println(ele));
	}

}
