package first.struts2.greet;

import com.opensymphony.xwork2.ActionSupport;

public class GreetingAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -265109343200527032L;

	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String execute() throws Exception {
		if (username == null || username.equals("")) {
			return ERROR;
		} else {
			return SUCCESS;
		}
	}

}
