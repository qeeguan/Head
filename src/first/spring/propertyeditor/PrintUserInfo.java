package first.spring.propertyeditor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class PrintUserInfo {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		User user1 = (User) factory.getBean("user1");
		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("applicationContext.xml"); User user1
		 * = (User) context.getBean("user1");
		 */
		user1.printinfo();
	}
}
