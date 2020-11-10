import java.time.LocalDate;

public class Student implements Comparable<Student> {
	private String name;
	private int age;
	private LocalDate joinedDate;
	private double grade;
	
	public Student(String name, int age, LocalDate joinedDate, double grade) {
		this.name = name;
		this.age = age;
		this.joinedDate = joinedDate;
		this.grade = grade;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public LocalDate getJoinedDate() {
		return joinedDate;
	}

	public void setJoinedDate(LocalDate joinedDate) {
		this.joinedDate = joinedDate;
	}
	
	@Override
	public String toString() {
		return "\nName: " + name + 
				"\nAge: " + age + 
				"\nJoined Date: " + joinedDate +
				"\nGrade: " + grade;
	}

	@Override
	public int compareTo(Student o) {
		return this.getAge() - o.getAge();
//		return (int) (this.getGrade() - o.getGrade());
//		return this.getName().compareTo(o.getName());
//		return this.getJoinedDate().compareTo(o.getJoinedDate());
	}
}
