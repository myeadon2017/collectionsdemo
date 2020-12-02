package collectiondemos;

import java.util.Collections;
import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		
		ArrayList<Employee> al= new ArrayList<Employee>();
		
		al.add(new Employee(123,"Matt","Florida City"));
		al.add(new Employee(124,"Jorge","Harrisburg"));
		al.add(new Employee(125,"Peter","Compton"));
		al.add(new Employee(126,"Jake","Camphill"));
		
		al.add(2,new Employee(129,"Jayde","Camphill2"));
		
		Collections.sort(al, new CityComparator());
		
		
		for(Employee ob: al) {
		System.out.println(ob);
		}
	}

}
