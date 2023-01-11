package streams;

import java.util.Arrays;
import java.util.List;

public class Counting {

	public static void main(String[] args) {
		List<String>name = Arrays.asList("Neymar" , "Messi" ,"Ronaldo" , "Rivaldo" , "Dominic Calwert");
		
	long cnt = 	name.stream()
					.filter(n -> n.contains("do"))
					.count();
	
	System.out.println(cnt);

	}

}
