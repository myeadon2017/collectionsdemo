package collectiondemos;

import java.util.TreeMap;

public class TreeMapDemo {
public static void main(String[] args) {
		
		
		TreeMap<Integer, Employee> hm= new TreeMap<Integer, Employee>();
		
		hm.put(101,  new Employee(2010, "newemp12", "mumbai"));
		hm.put(101,  new Employee(2011, "newemp12", "mumbai"));
		hm.put(101,  new Employee(2012, "newemp12", "mumbai"));

		System.out.println(hm);
		
		
	}

}
