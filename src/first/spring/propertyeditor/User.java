package first.spring.propertyeditor;

import java.util.Date;

public class User {
	private int id;

	private String name;

	private String sex;

	private int age;

	private Date date;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	/*
	 * public User(int id, String name) { super(); this.id = id; this.name =
	 * name; }
	 */

	public void printinfo() {
		System.out.println("user.id = " + id);
		System.out.println("user.name = " + name);
		System.out.println("user.sex = " + sex);
		System.out.println("user.age = " + age);
		System.out.println("user.date = " + date);
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
