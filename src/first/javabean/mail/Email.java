package first.javabean.mail;

import java.io.Serializable;

public class Email implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6906149641730599004L;

	private String mailAdd; // 邮箱名称

	public String getMailAdd() {
		return mailAdd;
	}

	public void setMailAdd(String mailAdd) {
		this.mailAdd = mailAdd;
	}

	private boolean email; // 判断是否是邮箱，是则为true，否则为false

	public Email() {
	}

	public Email(String mailAdd) {
		this.mailAdd = mailAdd;
	}

	public boolean isEamil() {
		String regex = "\\w+([-+.']\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*";
		if (getMailAdd().matches(regex)) {
			return true;
		}
		return email;
	}

}
