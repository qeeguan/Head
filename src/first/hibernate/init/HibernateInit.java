package first.hibernate.init;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateInit {
	private static final ThreadLocal<Session> threadLocal = new ThreadLocal<Session>();

	private static SessionFactory sessionFactory = null; // SessionFactory����

	static {
		try {
			Configuration cfg = new Configuration().configure(); // Ĭ�ϼ��أ�·��Ϊclasspath��Ŀ¼��src��Hibernate�����ļ�
			sessionFactory = cfg.buildSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * ��ȡSession
	 * 
	 * @return
	 * @throws HibernateException
	 */
	public static Session getSession() throws HibernateException {
		Session session = threadLocal.get();
		if (session == null || !session.isOpen()) {
			if (sessionFactory == null) {
				rebuildSessionFactory();
			}
			// Session�������sessionFactory.openSession()���
			session = (sessionFactory != null) ? sessionFactory.openSession() : null;
			threadLocal.set(session);
		}
		return session;
	}

	private static void rebuildSessionFactory() {
		try {
			Configuration cfg = new Configuration().configure();
			sessionFactory = cfg.buildSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void closeSession() throws HibernateException {
		Session session = threadLocal.get();
		threadLocal.set(null);
		if (session != null) {
			session.close(); // �ر�Session
		}
	}

}
