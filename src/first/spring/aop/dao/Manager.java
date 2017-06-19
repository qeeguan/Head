package first.spring.aop.dao;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Manager {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		User user = new User();
		user.setId(4);
		user.setName("springdao");
		user.setAge(20);
		user.setSex("Ů");
		UserDAOImp dao = (UserDAOImp) factory.getBean("userDAO");
		try {
			dao.insertUser(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
