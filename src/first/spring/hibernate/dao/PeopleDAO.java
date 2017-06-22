package first.spring.hibernate.dao;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import first.spring.hibernate.people.People;

public class PeopleDAO extends HibernateDaoSupport {

	public void inssert(People people) {
		this.getHibernateTemplate().save(people);
	}
}
