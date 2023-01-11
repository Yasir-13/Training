package Collections;
import java.util.*;  
import java.io.*;  


public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<String> cars = new LinkedList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		cars.remove("Ford");
        System.out.println(cars);

	}

}
