package first.hibernate.main;

import org.hibernate.Session;

import first.hibernate.init.HibernateInit;
import first.hibernate.javabean.User;

public class AddUser {
	public static void main(String[] args) {
		Session session = null;
		User user = new User();
		// user.setId(001); ����Ҫ������������
		user.setName("guanqi");
		user.setPassword("123456");
		try {
			session = HibernateInit.getSession();
			/*session.get(User.class, new Integer("1"));
			session.beginTransaction(); // ��ʼ����
			session.save(user);
			session.getTransaction().commit();
			System.out.println("�������ݿ�ɹ�!");*/
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
			System.out.println("�������ݿ�ʧ��!");
			e.printStackTrace();
		} finally {
			HibernateInit.closeSession();
		}
	}
}
