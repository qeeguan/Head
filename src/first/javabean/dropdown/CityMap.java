package first.javabean.dropdown;

import java.util.LinkedHashMap;
import java.util.Map;

public class CityMap {

	public static Map<String, String[]> model = new LinkedHashMap<>();

	static {
		model.put("����", new String[] { "����", "����", "��ɽ", "��˳", "��Ϫ" });
		model.put("����", new String[] { "����" });
		model.put("�㶫", new String[] { "����", "����", "��ݸ" });
	}

}
