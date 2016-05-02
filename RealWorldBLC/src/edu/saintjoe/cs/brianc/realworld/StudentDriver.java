package edu.saintjoe.cs.brianc.realworld;

public class StudentDriver {

	public static void main(String[] args) {
		// See what we can do about our class and students
		
		int studentCount = 0;
		
		Course cmp112 = new Course("CMP112A", "B. Capouch", "Core 125");
		
		Student nextStudent = new Student("Wiley Abbott", "M", 1, 18, "CA");
		// To put data into our private array, we had to write a mutator
		//  We pass it a filled-in Student record, and our "counter" which is studentCount
		cmp112.setStudent(nextStudent, (studentCount++));
		nextStudent = new Student("Jim Ballew", "M", 2, 19, "FL");
		cmp112.setStudent(nextStudent, studentCount++);
		nextStudent = new Student("Christine Black", "F", 1, 20, "AL");
		cmp112.setStudent(nextStudent, studentCount++);
		// Add YOURSELF!!!
		nextStudent = new Student("Luke Price", "M", 1, 19, "OH");
		cmp112.setStudent(nextStudent, studentCount++);
		System.out.println(cmp112.toString()); 

	}

}
