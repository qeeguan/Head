package first.struts2.map;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class MapAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2638817824051543356L;

	private Map<String, Object> request;

	private Map<String, Object> session;

	private Map<String, Object> application;

	@SuppressWarnings("unchecked")
	public MapAction() {
		ActionContext context = ActionContext.getContext();
		request = (Map<String, Object>) context.get("request");
		session = context.getSession();
		application = context.getApplication();
	}

	@Override
	public String execute() throws Exception {
		request.put("request", "MM");
		session.put("session", "GG");
		application.put("application", "ºÙºÙ");
		return SUCCESS;
	}

}
