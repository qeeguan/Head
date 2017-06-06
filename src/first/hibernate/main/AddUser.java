package first.hibernate.main;

import org.hibernate.Session;

import first.hibernate.init.HibernateInit;
import first.hibernate.javabean.User;

public class AddUser {
	public static void main(String[] args) {
		Session session = null;
		User user = new User();
		// user.setId(001);	����Ҫ������������
		user.setName("guanqi");
		user.setPassword("123456");
		try {
			session = HibernateInit.getSession();
			session.beginTransaction(); // ��ʼ����
			session.save(user);
			session.getTransaction().commit();
			System.out.println("�������ݿ�ɹ�!");
		} catch (Exception e) {
			session.getTransaction().rollback();
			System.out.println("�������ݿ�ʧ��!");
			e.printStackTrace();
		} finally {
			HibernateInit.closeSession();
		}
	}
}
