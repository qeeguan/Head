package first.javabean.dropdown;

import java.util.LinkedHashMap;
import java.util.Map;

public class CityMap {

	public static Map<String, String[]> model = new LinkedHashMap<>();

	static {
		model.put("辽宁", new String[] { "沈阳", "大连", "鞍山", "抚顺", "本溪" });
		model.put("北京", new String[] { "北京" });
		model.put("广东", new String[] { "广州", "深圳", "东莞" });
	}

}
