package first.spring.propertyeditor;

import java.beans.PropertyEditorSupport;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDateEditor extends PropertyEditorSupport {
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		// super.setAsText(text);
		Date date = new Date(text);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		df.format(date);
		setValue(df.format(date));
	}
}
