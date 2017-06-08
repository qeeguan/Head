package first.hibernate.main;

import org.hibernate.Session;

import first.hibernate.init.HibernateInit;
import first.hibernate.javabean.user.User;

public class AddUser {
	public static void main(String[] args) {
		Session session = null;
		/*
		 * User user = new User(); // user.setId(001); 不需要单独设置主键
		 * user.setName("guanqi"); user.setPassword("123456");
		 */
		try {
			session = HibernateInit.getSession();
			session.beginTransaction(); // 开始事务 session.save(user);
			many_to_one(session);
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
}
