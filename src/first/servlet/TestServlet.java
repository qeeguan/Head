package first.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ����Servlet
 * 
 * @author Administrator
 *
 */
public class TestServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5048676463605269746L;

	// ��ʼ������
	@Override
	public void init() throws ServletException {
		// TODO �Զ����ɵķ������
		super.init();
	}

	// ����HTTP Post����
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
	}

	// ����HTTP Get����
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO �Զ����ɵķ������
		super.doGet(req, resp);
	}

	// ����HTTP Put����
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO �Զ����ɵķ������
		super.doPut(req, resp);
	}

	// ����HTTP Put����
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO �Զ����ɵķ������
		super.doDelete(req, resp);
	}

	// ���ٷ���
	@Override
	public void destroy() {
		// TODO �Զ����ɵķ������
		super.destroy();
	}
}
