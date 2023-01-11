package Collections;
import java.util.*;  

class LinkedHashSet1 {

	public static void main(String[] args) {
		LinkedHashSet<String> myLinkedSet=new LinkedHashSet<String>();  
		myLinkedSet.add("Apple");
		myLinkedSet.add("Banana");
		myLinkedSet.add("Dell");
		myLinkedSet.add("Cat");
		
		myLinkedSet.remove("Apple");
		
		System.out.println(myLinkedSet);
		
	}

}
