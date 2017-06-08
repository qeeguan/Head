package first.hibernate.javabean.factory;

import java.util.Set;

import first.hibernate.javabean.user.User;

public class Factory {

	private int factoryid;

	private String factoryname;

	private Set<User> products;

	public Set<User> getProducts() {
		return products;
	}

	public void setProducts(Set<User> products) {
		this.products = products;
	}

	public int getFactoryid() {
		return factoryid;
	}

	public void setFactoryid(int factoryid) {
		this.factoryid = factoryid;
	}

	public String getFactoryname() {
		return factoryname;
	}

	public void setFactoryname(String factoryname) {
		this.factoryname = factoryname;
	}
}
