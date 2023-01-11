package Collections;
import java.util.*;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap<String,Integer> myMap=new HashMap<String,Integer>();
		
		myMap.put("Balloon", 1);
		myMap.put("Apple", 1);
		myMap.put("Elephant", 3);
		myMap.put("Balloon", 2);
		
//		myMap.remove("Balloon");
		
		System.out.println(myMap);
		
		
	}

}
