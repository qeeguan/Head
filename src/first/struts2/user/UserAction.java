package first.struts2.user;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1715770603901198863L;

	private String info;

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String add() {
		info = "����û���Ϣ";
		return "add";
	}

	public String update() {
		info = "�����û���Ϣ";
		return "update";
	}
}
