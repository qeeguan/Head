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
		String path = getServletContext().getRealPath("/"); // 获取服务器地址
		Part part = request.getPart("file1"); // 获取用户选择的上传文件
		if (part.getContentType().contains("image")) { // 判断上传的文件类型是否是图片
			ApplicationPart ap = (ApplicationPart) part;
			String fname1 = ap.getFilename(); // 获取上传文件名
			int path_idx = fname1.lastIndexOf("\\") + 1; // 刨除文件名之前路径的长度
			String fname2 = fname1.substring(path_idx, fname1.length()); // 文件名
			part.write("f:/tmp/" + fname2);
			// part.write(path + "/uoload/" + fname2);
			out.println("文件上传成功");
		} else {
			out.println("请选择图片文件");
		}
	}

}
