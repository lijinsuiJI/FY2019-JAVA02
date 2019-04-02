package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestMap a = new TestMap();
		a.testMap();
	}

	public void testMap() {
		Map<String,String> map = new HashMap<String,String>();
		map.put("name", "张三");
		map.put("sex", "女");
		
		System.out.println(map.size());
		
		String name = map.get("name");
		System.out.println(name);
		
		//遍历集合
		Set<Map.Entry<String,String>> set = map.entrySet();
		Iterator<Map.Entry<String,String>> it = set.iterator();
		while(it.hasNext()) {
			Map.Entry<String, String> entry = it.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.print("key=" + key + " ");
			System.out.println("value=" + value);
					
		}
		
	}
	
	
}
