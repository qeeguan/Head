package first.servlet.processbar;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.RequestContext;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

/**
 * Servlet implementation class UpLoad
 */
@WebServlet("/UpLoad")
public class UpLoad extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpLoad() {
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
		if ("uploadFile".equals(action)) {
			this.uploadFile(request, response); // 上传文件
		}
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

	public void uploadFile(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		session.setAttribute("processBar", 0);
		String error = "";
		int maxSize = 50 * 1024 * 1024;
		DiskFileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload upload = new ServletFileUpload(factory);
		try {
			List items = upload.parseRequest((RequestContext) request);
			Iterator it = items.iterator();
			while (it.hasNext()) {
				FileItem item = (FileItem) it.next();
				if (!item.isFormField()) {
					if (item.getName() != null && !item.getName().equals("")) {
						long upFileSize = item.getSize();
						String fileName = item.getName();
						if (upFileSize > maxSize) {
							error = "文件太大，请选择不超过50m的文件";
							break;
						}
						File tempFile = new File(fileName);
						File file = new File(request.getRealPath("F:/"), tempFile.getName());
						InputStream is = item.getInputStream();
						int buffer = 1024;
						int length = 0;
						byte[] b = new byte[buffer];
						double percent = 0;
						FileOutputStream fos = new FileOutputStream(file);
						while ((length = is.read(b)) != -1) {
							percent += length / (double) upFileSize * 100D;
							fos.write(b, 0, length);
							session.setAttribute("processBar", Math.round(percent));
						}
						fos.close();
						Thread.sleep(1000);
					} else {
						error = "没有文件上传";
					}
				}
			}
		} catch (Exception e) {

		}
		if (!error.equals("")) {
			request.setAttribute("error", error);
			request.getRequestDispatcher("error.jsp").forward(request, response);
		} else {
			request.setAttribute("result", "文件上传成功");
			request.getRequestDispatcher("upFile_deal.jsp").forward(request, response);
		}
	}

}
