package first.struts2.form;

import com.opensymphony.xwork2.ActionSupport;

public class FormAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3744565072013927408L;

	private String name;

	private String password;

	private int sex;

	private String province;

	private String[] hobby;

	private String desc;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String[] getHobby() {
		return hobby;
	}

	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String register() {
		return SUCCESS;
	}

}
