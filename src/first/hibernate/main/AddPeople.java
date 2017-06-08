package first.hibernate.main;

import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;

import first.hibernate.init.HibernateInit;
import first.hibernate.javabean.factory.Factory;
import first.hibernate.javabean.people.People;
import first.hibernate.javabean.user.User;

public class AddPeople {
	public static void main(String[] args) {
		Session session = null;
		/*
		 * User user = new User(); // user.setId(001); 不需要单独设置主键
		 * user.setName("guanqi"); user.setPassword("123456");
		 */
		try {
			session = HibernateInit.getSession();
			session.beginTransaction(); // 开始事务 session.save(user);
			// many_to_one(session);
			// one_to_many(session);
			one_to_one(session);
			session.getTransaction().commit();
			System.out.println("更新数据库成功!");

		} catch (Exception e) {
			session.getTransaction().rollback();
			System.out.println("更新数据库失败!");
			e.printStackTrace();
		} finally {
			HibernateInit.closeSession();
		}
	}

	private void delete(Session session) {
		User u4 = session.get(User.class, new Integer("1"));
		session.delete(u4);
	}

	private void query(Session session) {
		User u1 = session.get(User.class, new Integer("1"));
		// --------------------------------------
		User u3 = new User();
		session.load(u3, new Integer("1"));
	}

	private void update(Session session) {
		User u5 = session.get(User.class, new Integer("1"));
		u5.setName("newname");
		session.flush();
	}

	private static void many_to_one(Session session) {
		User user = session.get(User.class, new Integer("1"));
		System.out.println("user.id=" + user.getId());
		System.out.println("user.name=" + user.getName());
		System.out.println("factory.name=" + user.getFactory().getFactoryname());
	}

	private static void one_to_many(Session session) {
		Factory factory = session.get(Factory.class, new Integer("1"));
		System.out.println("factory.id=" + factory.getFactoryid());
		System.out.println("factory.name=" + factory.getFactoryname());
		Set<User> sets = factory.getProducts();
		Iterator<User> it = sets.iterator();
		while (it.hasNext()) {
			User user = (User) it.next();
			System.out.println("user.name=" + user.getName());
		}
	}

	private static void one_to_one(Session session) {
		People people = session.get(People.class, new Integer("1"));
		System.out.println("people.id=" + people.getId());
		System.out.println("people.name=" + people.getName());
		System.out.println("idcard.idcard_code=" + people.getIdcard().getIdcard_code());
	}
}
