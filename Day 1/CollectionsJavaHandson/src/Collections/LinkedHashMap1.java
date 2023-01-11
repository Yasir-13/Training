package Collections;
import java.util.*;

public class LinkedHashMap1 {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String>myLinkedHashMap  = new LinkedHashMap<Integer,String>(); 
		myLinkedHashMap.put(10 , "Apple");
		myLinkedHashMap.put(20, "Banana");
		myLinkedHashMap.put(5, "Cucumber");
		myLinkedHashMap.put(100, "Guava");
		
		System.out.println(myLinkedHashMap);
	}

}
