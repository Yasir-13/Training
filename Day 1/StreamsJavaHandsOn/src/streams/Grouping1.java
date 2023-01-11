package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping1 {
	public int age;
	String name;
	public int rollNo;
	
	public Grouping1(int age , String name, int rollNo){
		this.age = age;
		this.name = name;
		this.rollNo = rollNo;
	}
	
	public Integer getAge() {
		return this.age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Integer getRoll() {
		return this.rollNo;
	}
	
	
	public static void main(String[] args) {
		ArrayList<Grouping1>myList = new ArrayList<Grouping1>();
//		Grouping1 g1 = new Grouping1(20 , "Daniel" , 12);
		myList.add(new Grouping1(22 , "Yasir" , 10));
		myList.add(new Grouping1(22 , "Deepak" , 5));
		myList.add(new Grouping1(24 , "Shubham" , 15));
		myList.add(new Grouping1(22 , "Ajay" , 8));
		myList.add(new Grouping1(23 , "Vijay" , 11));
		myList.add(new Grouping1(23 , "Amar" , 7));
		
//		System.out.println(g1.name);
		
		Map<Object, List<Grouping1>>groupByAge = myList.stream()
			.collect(Collectors.groupingBy(n -> n.getAge()));
		
		System.out.println(groupByAge);


	}
}
