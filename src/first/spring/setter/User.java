package first.spring.setter;

public class User {
	private int id;

	private String name;

	private String sex;

	private int age;

	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void printinfo() {
		System.out.println("user.id = " + id);
		System.out.println("user.name = " + name);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
