package Collections;
import java.util.*;  

class TestGenerics1{  
	public static void main(String args[]){  
		ArrayList<Integer>myList = new ArrayList<Integer>();
		
		myList.add(3);
		myList.add(5);
		myList.add(7);
		myList.remove(1);
		
		System.out.println(myList);
 
	}  
}  

