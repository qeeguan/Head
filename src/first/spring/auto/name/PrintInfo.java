package first.spring.auto.name;

public class PrintInfo {
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void printUser() {
		System.out.println("user.id = " + user.getId());
		System.out.println("user.name = " + user.getName());
		System.out.println("user.sex = " + user.getSex());
		System.out.println("user.age = " + user.getAge());
	}
}
