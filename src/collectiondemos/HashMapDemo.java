package collectiondemos;

import java.util.HashMap;


public class HashMapDemo {
	
	public static void main(String[] args) {
		
		
		HashMap<Integer, Employee> hm= new HashMap<Integer, Employee>();
		
		hm.put(101,  new Employee(2010, "newemp12", "mumbai"));
		hm.put(101,  new Employee(2011, "newemp12", "mumbai"));
		hm.put(101,  new Employee(2012, "newemp12", "mumbai"));

		System.out.println(hm);
		
		
	}

}
