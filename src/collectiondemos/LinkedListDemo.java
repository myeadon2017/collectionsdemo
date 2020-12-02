package collectiondemos;

import java.util.LinkedList;
import java.util.Collections;

public class LinkedListDemo {
public static void main(String[] args) {
		
		
		LinkedList<Employee> al= new LinkedList<Employee>();
		
		al.add(new Employee(123,"Matt","Florida City"));
		al.add(new Employee(124,"Jorge","Harrisburg"));
		al.add(new Employee(125,"Peter","Compton"));
		al.add(new Employee(126,"Jake","Camphill"));
		
		al.addFirst(new Employee(121,"Oreo","Cam"));
		al.addLast(new Employee(130,"Brady","Hugh City"));
		
		Collections.sort(al, new CityComparator());
		
		//al.remove(3);
		//Collections.reverse(al);
		
		for(Employee ob: al) {
		System.out.println(ob);
		}
	}

}
