package first.hibernate.main;

import org.hibernate.Session;

import first.hibernate.init.HibernateInit;
import first.hibernate.javabean.person.Student;
import first.hibernate.javabean.person.Stuff;

public class Manager {
	public static void main(String[] args) {
		Session session = null;
		try {
			session = HibernateInit.getSession();
			session.beginTransaction();
			Student stu = new Student();
			stu.setId(1);
			stu.setName("stu01");
			stu.setAge(18);
			stu.setSex("��");
			stu.setSchool("�廪��ѧ");
			session.save(stu);
			Stuff stf = new Stuff();
			stf.setId(2);
			stf.setName("stf02");
			stf.setAge(20);
			stf.setSex("Ů");
			stf.setCompany("��Ѷ");
			session.save(stf);
			session.getTransaction().commit();
			System.out.println("���ݿ���³ɹ���");
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
			System.out.println("���ݿ����ʧ�ܣ�");
		} finally {
			HibernateInit.closeSession();
		}
	}
}
