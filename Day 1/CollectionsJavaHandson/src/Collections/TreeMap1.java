package Collections;
import java.util.*;

public class TreeMap1 {
	public static void main(String[] args) {
		TreeMap<Integer,String> myTreeMap=new TreeMap<Integer,String>();
		
		myTreeMap.put(31,"January");
		myTreeMap.put(28, "February");
		myTreeMap.put(30, "April");
		myTreeMap.put(31, "May");
		
		System.out.println(myTreeMap);
		
	}
}
