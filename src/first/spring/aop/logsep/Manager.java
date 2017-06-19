package first.spring.aop.logsep;

import org.springframework.aop.framework.ProxyFactory;

public class Manager {

	public static void main(String[] args) {
		Target target = new Target();
		ProxyFactory pf = new ProxyFactory();
		pf.addAdvice(new LoggerExecute()); // 将advisor设置在代理工厂里
		pf.setTarget(target);
		Target proxy = (Target) pf.getProxy();
		proxy.execute("AOP的简单实现！");
	}

}
