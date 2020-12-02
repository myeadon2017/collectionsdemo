package collectiondemos;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapArrayListDemo {

public static void main(String[] args) {
		
		ArrayList<Employee> al=new ArrayList<Employee>();
		
		al.add(new Employee(101, "", ""));
		al.add(new Employee(102, "", ""));
		
		
	
		HashMap<Integer, ArrayList<Employee>> hm= new HashMap<Integer, ArrayList<Employee>>();
		
		hm.put(101, al);

		System.out.println(hm);
		
		
	}

}

