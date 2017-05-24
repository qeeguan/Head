package first.filter.count;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class CountFilter
 */
/*@WebFilter(filterName = "CountFilter", urlPatterns = "/count/index.jsp", initParams = {
		@WebInitParam(name = "count", value = "443") })*/
public class CountFilter implements Filter {

	private int count;

	/**
	 * Default constructor.
	 */
	public CountFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		count++;
		HttpServletRequest req = (HttpServletRequest) request;
		ServletContext context = req.getSession().getServletContext();
		context.setAttribute("count", count);
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		String param = fConfig.getInitParameter("count");
		count = Integer.parseInt(param);
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
