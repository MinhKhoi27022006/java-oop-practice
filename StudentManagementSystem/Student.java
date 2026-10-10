import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Student {
	private String name;
	private LocalDate dateOfBirth;
	private String studentId;
	private double gpa;
	private Map<Course, Double> m1 = new HashMap<>();

	public Student(String name, LocalDate dob, String sId) {
		this.name = name;
		this.dateOfBirth = dob;
		this.studentId = sId;

	}

	public String getName() {
		return name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public String getStudentId() {
		return studentId;
	}

	public double getGpa() {
		return gpa;
	}

	public Map<Course, Double> getM1() {
		for(Course c : m1.keySet()) {
			System.out.println( c.getName() +" : "+m1.get(c));
		}
		return null;
		
	}

	public void registerCourse(Course course) {
		m1.put(course, null);
	}

	public void assignGrade(Course course, Double grade) {
		m1.put(course, grade);
	}

	public double calculateGPA() {
		double totalGrade = 0;
		double totalCredit = 0;
		for (Course c : m1.keySet()) {
			double grade = m1.get(c);
			if (grade != 0) {
				totalGrade += grade;
				totalCredit += c.getCredit();
			}
		}
		return gpa = totalGrade / totalCredit;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", dateOfBirth=" + dateOfBirth + ", studentId=" + studentId 
				+ ", Course=" + getM1() +", Your GPA: " + calculateGPA() + "]";
	}

}
