package first.javabean.calculator;

public class CalBean {

	private double firstParam;

	private double secondParam;

	private String operator;

	private double result;

	public double getFirstParam() {
		return firstParam;
	}

	public void setFirstParam(double firstParam) {
		this.firstParam = firstParam;
	}

	public double getSecondParam() {
		return secondParam;
	}

	public void setSecondParam(double secondParam) {
		this.secondParam = secondParam;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public double Cal() {
		result = 0;
		try {
			if (getOperator().equals("+")) {
				result = firstParam + secondParam;
			} else if (getOperator().equals("-")) {
				result = firstParam - secondParam;
			} else if (getOperator().equals("*")) {
				result = firstParam * secondParam;
			} else if (getOperator().equals("/") && secondParam != 0) {
				result = firstParam / secondParam;
			}
		} catch (Exception e) {
			e.getMessage().toString();
		}
		return result;
	}

	// 判断输入的是不是数字
	public boolean isNum(String str) {
		return str.matches("^[-+]?(([0-9]+)([.]([0-9]+))?|([.]([0-9]+))?)$");
	}
}
