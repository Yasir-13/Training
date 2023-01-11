package Collections;

import java.util.*;  
import java.io.*;  
  
public class Car implements Comparable<Car>{
	
	int id;
	String name;
	
	public Car(int id, String name) {
		this.id = id;
		this.name = name;
	}
	

	@Override
	public int compareTo(Car obj) {
		if(this.id > obj.id) return 1;
		else if(this.id == obj.id) return 0;
		else return -1;
	}
	
	public static void main(String[] args) {
		ArrayList<Car> myList = new ArrayList<Car>();
		
		Car c1 = new Car(10 , "Swift");
		Car c2 = new Car(20 , "Fortuner");
		Car c3 = new Car(5 , "Innova");
		Car c4 = new Car(1 , "Audi");
		
		myList.add(c1);
		myList.add(c2);
		myList.add(c3);
		myList.add(c4);
		
		Collections.sort(myList);
				
		for (Car c:myList) {
			System.out.println(c.id);
		}
		
	}
}  
