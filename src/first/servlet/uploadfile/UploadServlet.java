package first.servlet.uploadfile;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.catalina.core.ApplicationPart;

/**
 * Servlet implementation class UploadServlet
 */
// @WebServlet("/UploadServlet")
@MultipartConfig
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UploadServlet() {
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
	@SuppressWarnings("deprecation")
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String path = getServletContext().getRealPath("/"); // ��ȡ��������ַ
		Part part = request.getPart("file1"); // ��ȡ�û�ѡ����ϴ��ļ�
		if (part.getContentType().contains("image")) { // �ж��ϴ����ļ������Ƿ���ͼƬ
			ApplicationPart ap = (ApplicationPart) part;
			String fname1 = ap.getName(); // ��ȡ�ϴ��ļ���
			int path_idx = fname1.lastIndexOf("\\") + 1; // �ٳ��ļ���֮ǰ·���ĳ���
			String fname2 = fname1.substring(path_idx, fname1.length()); // �ļ���
			part.write("f:/tmp/" + fname2);
			// part.write(path + "/uoload/" + fname2);
			out.println("�ļ��ϴ��ɹ�");
		} else {
			out.println("��ѡ��ͼƬ�ļ�");
		}
	}

}
