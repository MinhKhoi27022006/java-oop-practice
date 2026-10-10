package act2;

public class Person {
	private int id;
	private String name;
	private String email;

	public Person(int id, String name, String email) {
		this.id = id;
		this.email = email;
		this.name = name;
	}

	public int getId() {
		return id;

	}

	public String getName() {
		return name;

	}

	public String getEmail() {
		return email;
	}

	public String toString() {
		return id + "-" + name + "-" + email;
	}

}
