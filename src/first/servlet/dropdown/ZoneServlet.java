package first.servlet.dropdown;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ZoneServlet
 */
@WebServlet("/ZoneServlet")
public class ZoneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ZoneServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());
		String action = request.getParameter("action");
		if (action.equals("getProvince")) {
			this.getProvince(request, response);
		} else if (action.equals("getCity")) {
			this.getCity(request, response);
		}
	}

	private void getCity(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("GBK");
		String result = "";
		String selProvince = request.getParameter("parProvince");
		selProvince = new String(selProvince.getBytes("ISO-8859-1"), "GBK");
		CityMap cityMap = new CityMap();
		Map<String, String[]> map = cityMap.model;
		String[] arrCity = map.get(selProvince);
		for (int i = 0; i < arrCity.length; i++) {
			result = result + arrCity[i] + ",";
		}
		result = result.substring(0, result.length() - 1);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print(result);
		out.flush();
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	public void getProvince(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("GBK");
		String result = "";
		CityMap cityMap = new CityMap();
		Map<String, String[]> map = cityMap.model;
		Set<String> set = map.ketSet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			result = result + it.next() + ",";
		}
		result = result.substring(0, result.length() - 1);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print(result);
		out.flush();
		out.close();
	}

}
