package first.spring.setter;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Manager {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		User user = (User) factory.getBean("user");
		System.out.println("------------Setter注入--------------");
		System.out.println("user.id = " + user.getId());
		System.out.println("user.name = " + user.getName());
		System.out.println("user.sex = " + user.getSex());
		System.out.println("user.age = " + user.getAge());
		/*System.out.println("------------构造器注入--------------");
		user.printinfo();*/
	}
}
