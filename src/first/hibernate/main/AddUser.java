package first.hibernate.main;

import org.hibernate.Session;

import first.hibernate.init.HibernateInit;
import first.hibernate.javabean.User;

public class AddUser {
	public static void main(String[] args) {
		Session session = null;
		User user = new User();
		// user.setId(001);	不需要单独设置主键
		user.setName("guanqi");
		user.setPassword("123456");
		try {
			session = HibernateInit.getSession();
			session.beginTransaction(); // 开始事务
			session.save(user);
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
}
