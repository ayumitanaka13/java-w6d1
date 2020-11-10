import java.util.Comparator;

//public class StudentSorter implements Comparator<Student>{
//
//	@Override
//	public int compare(Student o1, Student o2) {
//		return o1.getName().compareTo(o2.getName());
//	}
//	
//}

public class StudentSorter {
	
	public static class CompareByName implements Comparator<Student> {
		@Override
		public int compare(Student o1, Student o2) {
			return o1.getName().compareTo(o2.getName());
		}
	}
	
	public static class CompareByDate implements Comparator<Student> {
		@Override
		public int compare(Student o1, Student o2) {
			return o1.getJoinedDate().compareTo(o2.getJoinedDate());
		}
	}
	
	public static class CompareByGrade implements Comparator<Student> {
		@Override
		public int compare(Student o1, Student o2) {
			return (int)(o1.getGrade() - o2.getGrade());
		}
	}
}
