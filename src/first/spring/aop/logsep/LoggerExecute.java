package first.spring.aop.logsep;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * ����һ��֪ͨ
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
		System.out.println("����ʼִ��!");
	}

}
