package first.servlet.cal;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import first.javabean.calculator.CalBean;

/**
 * Servlet implementation class CalServlet
 */
@WebServlet("/CalServlet")
public class CalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CalServlet() {
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		CalBean cal = new CalBean();

		String firstParam = request.getParameter("firstParam");
		String secondParam = request.getParameter("secondParam");
		String operator = request.getParameter("operator");

		if (firstParam != null && secondParam != null && cal.isNum(firstParam) && cal.isNum(secondParam)) {
			if (!firstParam.isEmpty()) {
				cal.setFirstParam(Double.valueOf(firstParam));
			}
			if (!secondParam.isEmpty()) {
				cal.setSecondParam(Double.valueOf(secondParam));
			}
			cal.setOperator(operator);
			if (cal.getOperator().equals("/") && cal.getSecondParam() == 0) {
				out.println("<html><head>");
				out.println("<title>" + "简易计算器" + "</title>");
				out.println("</head>");
				out.println("<body>");
				out.println("输入有误，除数不能为零" + "<br>");
				out.println("<a href='F:/javaweb/first/WebContent/cal/index.jsp'>返回</a>");
				out.println("</body>");
				out.println("</html>");
			} else {
				double result = cal.Cal();
				out.println("<html><head>");
				out.println("<title>" + "简易计算器" + "</title>");
				out.println("</head>");
				out.println("<body>");
				out.println(firstParam + " " + operator + " " + secondParam + "= " + result + "<br>");
				out.println("<a href='../cal/index.jsp'>返回</a>");
				out.println("</body>");
				out.println("</html>");
			}
		} else {
			out.println("<html><head>");
			out.println("<title>简易计算器</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("输入有误，无法进行计算，请输入数字且除数不能为零" + "<br>");
			out.println("</body>");
			out.println("</head></html>");
		}
	}

}
