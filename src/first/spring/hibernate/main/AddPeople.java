package first.spring.hibernate.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import first.spring.hibernate.dao.PeopleDAO;
import first.spring.hibernate.people.People;

public class AddPeople {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		PeopleDAO peopleDAO = (PeopleDAO) factory.getBean("peopleDAO");
		People people = new People();
		people.setId(5);
		people.setName("Spring与Hibernate整合");
		people.setAge(20);
		people.setSex("男");
		peopleDAO.inssert(people);
		System.out.println("添加数据库成功！");
	}

}
