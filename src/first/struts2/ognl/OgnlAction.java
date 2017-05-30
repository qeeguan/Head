package first.struts2.ognl;

import com.opensymphony.xwork2.ActionSupport;

public class OgnlAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2170876406049918745L;

	private Student stu;

	public Student getStu() {
		return stu;
	}

	public void setStu(Student stu) {
		this.stu = stu;
	}

	public OgnlAction() {
		stu = new Student();
		stu.setId(001);
		stu.setName("GG");
	}

}
