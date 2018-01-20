package edu.miracosta.cs113;
import java.util.ListIterator;

import org.junit.Assert;
import org.junit.Test;

public class JunitTester {

	
@Test
public void testAdd(){

	// TEST Student class adding and Constructors	
	Student zero = new Student("Kenzo","Figueroa,0");
	Student one = new Student("Jane","Doe",1);
	Student two = new Student("John","Doe,2");
	Student three = new Student("Livy","Figueroa,3");
	Student four = new Student(" Mike","<--------------- Inserted Fig",4);
//END Student TEST	

// INSTANTIATE linked list and iterator	
	StudentList<Student> x = new StudentList<Student>();
	ListIterator<Student> it = x.listIterator(0);
//END 
	
	//TEST LinkedLIST add methods and add to location
	// Student cutting in line move current student down one place
		x.add(zero);
		x.add(one);
		x.add(two);
		x.add(three);
		System.out.println("\n---------Print First List---------\n");
		x.printlist(x);
		System.out.println("\n1).Good");
	}
//ENND METHOD
	@Test
	public void testRemoveFirst(){
		Student zero = new Student("Kenzo","Figueroa",0);
		Student one= new Student("Jane","Mary",1);
		Student two = new Student("John","Doe",2);
		Student three = new Student("Livy","<---------- Insert Figueroa",3);
		
	
		StudentList x = new StudentList();
	
			x.add(zero);
			x.add(one);
			x.add(two);
			x.add(2,three);
			System.out.println("\n-----------Print RemoveFirst List---------\n");
			x.removeFirst();
			x.printlist(x);
			System.out.println("\n2).Good");
	}

	@Test
	public void testAddAtIndex(){
		Student zero = new Student("Kenzo","Figueroa",0);
		Student one = new Student("Jane","Mary",1);
		Student two = new Student("John","Doe",2);
		Student three = new Student("Livy","<---------- Insert Figueroa",3);
		
	
		StudentList<Student> x = new StudentList<Student>();
	
			x.add(zero);
			x.add(one);
			x.add(two);
			x.add(0,three);
			System.out.println("\n-----------Print addAtIdnex(four) List---------\n");
			x.printlist(x);
			System.out.println("\n3).Good");
		
	}

	@Test
	public void testRemove(){
		Student zero = new Student("Kenzo","Figueroa",0);
		Student one = new Student("Jane","Mary",1);
		Student two = new Student("John","Doe",2);
		Student three = new Student("Livy","<---------- Insert Figueroa",3);
		
		StudentList<Student> x = new StudentList<Student>();
		
		x.add(zero);
		x.add(one);
		x.add(two);
		x.add(2,three);
		
		
		
		System.out.println("\n-----------BEFORE Remove() List---------\n");
		x.printlist(x);
		x.remove();	
			System.out.println("\n-----------Remove() List---------\n");
			x.printlist(x);
			System.out.println("\n4).Good");
	}
	
	@Test
	public void removeAt(){
		Student zero = new Student("Kenzo","Figueroa",0);
		Student one = new Student("Jane","Mary",1);
		Student two = new Student("John","Doe",2);
		Student three = new Student("Livy","<---------- Insert Figueroa",3);
		
		StudentList<Student> x = new StudentList<Student>();

			x.add(zero);
			x.add(one);
			x.add(two);
			x.add(three);
			System.out.println("\n-----------Before removeAt() List---------\n");
			x.printlist(x);
			x.removeAt(0);
			
			System.out.println("\n-----------removeAt() List---------\n");
			x.printlist(x);
			
			System.out.println("\n5).Good");
	}




	

	
}