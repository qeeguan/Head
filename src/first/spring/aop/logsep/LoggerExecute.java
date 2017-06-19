package first.spring.aop.logsep;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 创建一个通知
 * @author Qee
 *
 */
public class LoggerExecute implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		before();
		invocation.proceed();
		return null;
	}

	private void before() {
		System.out.println("程序开始执行!");
	}

}
