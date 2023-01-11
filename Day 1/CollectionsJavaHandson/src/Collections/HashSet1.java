package Collections;
import java.util.*;

class HashSet1 {

	public static void main(String[] args) {
		HashSet<String> mySet=new HashSet<String>();  
		mySet.add("Yasir");
		mySet.add("Nadeem");
		mySet.add("Sony");
		mySet.add("Yasir");
		mySet.add("Hashset");
		mySet.remove("Sony");


		System.out.println(mySet);
		
	}

}
