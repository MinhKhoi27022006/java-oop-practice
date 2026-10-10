import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {

		Student s = new Student("Khoi", LocalDate.of(2005, 1, 1), "S001");

		// Course 1
		Course java = new JavaCourse("Java", "J01", 3);

		// Course 2 (anonymous class)
		Course special = new Course() {
			public String getName() {
				return "Special Subject";
			}

			public String getCourseCode() {
				return "SP01";
			}
			public int getCredit() {
				return 10;
			}
		};

		s.registerCourse(java);
		s.registerCourse(special);

		s.assignGrade(java, 8.5);
		s.assignGrade(special, 9.0);

		s.calculateGPA();

		System.out.println(s);
	}
}
