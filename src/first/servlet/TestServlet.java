package first.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 测试Servlet
 * 
 * @author Administrator
 *
 */
public class TestServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5048676463605269746L;

	// 初始化方法
	@Override
	public void init() throws ServletException {
		// TODO 自动生成的方法存根
		super.init();
	}

	// 处理HTTP Post请求
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
	}

	// 处理HTTP Get请求
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO 自动生成的方法存根
		super.doGet(req, resp);
	}

	// 处理HTTP Put请求
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO 自动生成的方法存根
		super.doPut(req, resp);
	}

	// 处理HTTP Put请求
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO 自动生成的方法存根
		super.doDelete(req, resp);
	}

	// 销毁方法
	@Override
	public void destroy() {
		// TODO 自动生成的方法存根
		super.destroy();
	}
}
