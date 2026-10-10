
public class JavaCourse implements Course {
	private String name;
	private String courseCode;
	private int credit;

	public JavaCourse(String name,String courseCode,int credit) {
		this.courseCode=courseCode;
		this.name = name;
		this.credit = credit;
	}

	public String getName() {
		return name;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public int getCredit() {
		return credit;
	}

}
