package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Partitioning {
	Integer age;
	String name;
	String eyeColor;
	
	Partitioning (Integer age, String name, String eyeColor){
		this.age = age;
		this.name = name;
		this.eyeColor = eyeColor;
	}
	
	public String getEyeColor() {
		return this.eyeColor;
	}

	public static void main(String[] args) {
		ArrayList<Partitioning>myList = new ArrayList<Partitioning>();
		myList.add(new Partitioning(22 , "Yasir" , "black"));
		myList.add(new Partitioning(22 , "Nadeem" , "brown"));
		myList.add(new Partitioning(23 , "Deepak" , "black"));
		myList.add(new Partitioning(24 , "Shubham" , "blue"));
		myList.add(new Partitioning(21 , "Kumar" , "black"));
		
		Map<Boolean, List<Partitioning>>partEyeColor = myList.stream()
			.collect(Collectors.partitioningBy(n->n.getEyeColor()== "black"));
		
		System.out.println(partEyeColor);
	}

}
