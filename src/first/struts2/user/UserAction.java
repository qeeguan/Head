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
		info = "添加用户信息";
		return "add";
	}

	public String update() {
		info = "更新用户信息";
		return "update";
	}
}
