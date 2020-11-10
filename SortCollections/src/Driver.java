import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Driver {

	public static void main(String[] args) {
		ArrayList<String> stringList = new ArrayList<String>();
		stringList.add("John");
		stringList.add("Michael");
		stringList.add("Allen");
		stringList.add("Sarah");
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(45);
		intList.add(32);
		intList.add(56);
		intList.add(2);
		intList.add(78);
		
		//stringList

		for (String s : stringList) {
			System.out.println(s);
		}
		
		Collections.sort(stringList);		
		System.out.println("after sorting");
		for (String s : stringList) {
			System.out.println(s);
		}
		System.out.println();

		//intList
		for (int n : intList) {
			System.out.println(n);
		}
		Collections.sort(intList);
		System.out.println("after sorting");
		for (int n : intList) {
			System.out.println(n);
		}
		
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("John", 25, LocalDate.of(2020, 1, 1), 15.5));
		students.add(new Student("Allen", 35, LocalDate.of(2019, 1, 1), 10.0));
		students.add(new Student("Mary", 15, LocalDate.of(2018, 12, 12), 11.2));
		students.add(new Student("Jane", 15, LocalDate.of(2018, 1, 1), 12.2));
		
		System.out.println("\n* sort students by age");
		Collections.sort(students);
		for(Student s : students) {
			System.out.println(s);
		}
		
		System.out.println("\n* sort students by name");
		Collections.sort(students, new StudentSorter.CompareByName());
		for (Student s : students) {
			System.out.println(s);
		}
		
		System.out.println("\n* sort students by date");
		Collections.sort(students, new StudentSorter.CompareByDate());
		for (Student s : students) {
			System.out.println(s);
		}
		
		System.out.println("\n* sort students by grade");
		Collections.sort(students, new StudentSorter.CompareByGrade());
		for (Student s : students) {
			System.out.println(s);
		}
		
	}

}