package collectiondemos;


import java.util.TreeSet;

public class TreeSetDemo {

public static void main(String[] args) {
		
		
		TreeSet<Employee> al= new TreeSet<Employee>();
		
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

