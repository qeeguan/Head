package first.hibernate.main;

import org.hibernate.Session;

import first.hibernate.init.HibernateInit;
import first.hibernate.javabean.User;

public class AddUser {
	public static void main(String[] args) {
		Session session = null;
		User user = new User();
		// user.setId(001); 不需要单独设置主键
		user.setName("guanqi");
		user.setPassword("123456");
		try {
			session = HibernateInit.getSession();
			/*session.get(User.class, new Integer("1"));
			session.beginTransaction(); // 开始事务
			session.save(user);
			session.getTransaction().commit();
			System.out.println("更新数据库成功!");*/
			User u1 = session.get(User.class, new Integer("1"));
			User u3 = new User();
			session.load(u3, new Integer("1"));
			User u4 = session.get(User.class, new Integer("1"));
			session.delete(u4);
			User u5 = session.get(User.class, new Integer("1"));
			u5.setName("newname");
			session.flush();
		} catch (Exception e) {
			session.getTransaction().rollback();
			System.out.println("更新数据库失败!");
			e.printStackTrace();
		} finally {
			HibernateInit.closeSession();
		}
	}
}
