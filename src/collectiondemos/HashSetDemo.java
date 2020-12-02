package collectiondemos;

import java.util.HashSet;

public class HashSetDemo {
public static void main(String[] args) {
		
		
		HashSet<Employee> al= new HashSet<Employee>();
		
		al.add(new Employee(123,"Matt","Florida City"));
		al.add(new Employee(124,"Jorge","Harrisburg"));
		al.add(new Employee(125,"Peter","Compton"));
		al.add(new Employee(126,"Jake","Camphill"));
		al.add(new Employee(126,"Jake","Camphill"));
		//Since we generated HashCode equals in Employee class 
		//there can't be duplicates
		
		for(Employee ob: al) {
		System.out.println(ob);
		}
	}

}
