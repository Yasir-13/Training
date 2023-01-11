package Collections;
import java.util.*;

class TreeSet1 {
	
	public static void main(String[] args) {
	TreeSet<Integer> myTreeSet = new TreeSet<Integer>();  
	
	myTreeSet.add(10);
	myTreeSet.add(10);
	myTreeSet.add(15);
	myTreeSet.remove(10);
	myTreeSet.add(100);
	
	System.out.println(myTreeSet);

	}
}
