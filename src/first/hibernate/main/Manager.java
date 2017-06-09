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
			stu.setSex("男");
			stu.setSchool("清华大学");
			session.save(stu);
			Stuff stf = new Stuff();
			stf.setId(2);
			stf.setName("stf02");
			stf.setAge(20);
			stf.setSex("女");
			stf.setCompany("腾讯");
			session.save(stf);
			session.getTransaction().commit();
			System.out.println("数据库更新成功！");
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
			System.out.println("数据库更新失败！");
		} finally {
			HibernateInit.closeSession();
		}
	}
}
